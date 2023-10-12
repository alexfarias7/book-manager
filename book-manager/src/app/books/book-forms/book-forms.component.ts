import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { BooksService } from '../services/books.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Location } from '@angular/common';

@Component({
  selector: 'app-book-forms',
  templateUrl: './book-forms.component.html',
  styleUrls: ['./book-forms.component.scss'],
})
export class BookFormsComponent {
  form: FormGroup;

  onSubmit() {
    this.service.save(this.form.value).subscribe({
      next: (data) => this.OnSuccess(),
      error: () => this.OnError(),
    });
  }

  buscarIsbn(isbn: string) {
    return this.service.loadByIsbn(isbn);
  }

  private OnSuccess() {
    this._snackBar.open('livro salvo com sucesso', '', { duration: 3000 });
    this.onCancel();
  }

  private OnError() {
    this._snackBar.open('erro ao salvar o curso', '', { duration: 3000 });
  }
  onCancel() {
    this.location.back();
  }

  constructor(
    private formBuilder: FormBuilder,
    private service: BooksService,
    private _snackBar: MatSnackBar,
    private location: Location
  ) {
    this.form = this.formBuilder.group({
      title: [null],
      category: [null],
      urlCover: [null],
      author: [null],
      shelf: [null],
      isbn: [null],
    });
  }
}
