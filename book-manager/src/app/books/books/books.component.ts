import { Component } from '@angular/core';
import { Book } from '../models/book';
import { BooksService } from '../services/books.service';
import { Observable, catchError, of } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';
import { Router } from '@angular/router';
import { IBookModel, VolumeInfo } from '../models/BookModel';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss'],
})
export class BooksComponent {
  //books$: Observable<Book[]>;
  //books$: Observable<Book[]>;
  //musicas$ = new Observable<Music[]>();
  books$ = new Observable<IBookModel>();

  displayedColumns = ['title', 'category'];
  loadingSpiner: boolean = false;

  constructor(private booksServices: BooksService, public dialog: MatDialog) {
    /*     this.books$ = this.booksServices.loadByIsbn('9786555604283').pipe(
      catchError((error) => {
        this.onError('Erro ao carragar livros');
        return of([]);
      })
    );
 */
    //this.books$ = this.booksServices.loadByIsbn('9786555604283').pipe();
    this.obterLivrosCadastrados();
  }

  obterLivrosCadastrados() {
    this.books$ = this.booksServices.obterLivroPeloIsbn();
  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg,
    });
  }

  onLoadingSpiner() {
    return this.loadingSpiner;
  }
}
