import { Component } from '@angular/core';
import { Book } from '../models/book';
import { BooksService } from '../services/books.service';
import { Observable, catchError, of } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { ErrorDialogComponent } from 'src/app/shared/components/error-dialog/error-dialog.component';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss'],
})
export class BooksComponent {
  books$: Observable<Book[]>;
  displayedColumns = ['title', 'category'];

  constructor(private booksServices: BooksService, public dialog: MatDialog) {
    this.books$ = this.booksServices.list().pipe(
      catchError((error) => {
        this.onError('Erro ao carragar livros');
        return of([]);
      })
    );
  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg,
    });
  }
}
