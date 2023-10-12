import { IBookModel } from './../models/BookModel';
import { Injectable } from '@angular/core';
import { Book } from '../models/book';
import { HttpClient } from '@angular/common/http';
import { delay, first, tap, of } from 'rxjs';
import { VolumeInfo } from '../models/BookModel';

@Injectable({
  providedIn: 'root',
})
export class BooksService {
  //  private readonly API = '/assets/books.json';

  //get<Book>(this.API + '/isbn/' + isbn)
  private readonly API = 'api/books';
  private readonly URL = 'http://localhost:8080/books';
  private cache: IBookModel = { totalItems: 0, items: [] };

  constructor(private http: HttpClient) {}

  list() {
    return this.http.get<Book[]>(this.API).pipe(
      first(),
      delay(1000),
      tap((books) => console.log(books))
    );
  }
  /*   searchIsbn(isbn: string) {
    return this.http.get<IBookModel>(this.API + '/isbn/' + isbn).pipe(
      first(),
      tap((book) => console.log(book))
    );
  } */

  loadByIsbn(isbn: string) {
    /*     if (this.cache.totalItems > 0) {
      const record = this.cache.items.find(
        (book) =>
          `${book.industryIdentifiers.find((b) => b.identifier)}` === `${isbn}`
      );
      return record != null ? of(record) : this.getByIsbn(isbn);
    } */
    return this.getByIsbn(isbn);
  }

  private getByIsbn(isbn: string) {
    return this.http
      .get<IBookModel>(`${this.API}/isbn/${isbn}`)
      .pipe(tap((book) => console.log(book)));
  }

  obterLivroPeloIsbn() {
    return this.http.get<IBookModel>(`${this.URL}/isbn/9786555604283`);
  }

  save(record: Book) {
    return this.http.post<Book>(this.API, record).pipe(first());
  }
}
