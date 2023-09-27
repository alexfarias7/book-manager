import { Injectable } from '@angular/core';
import { Book } from '../models/book';
import { HttpClient } from '@angular/common/http';
import { delay, first, tap } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class BooksService {
  //  private readonly API = '/assets/books.json';
  private readonly API = 'api/books';
  constructor(private httpClient: HttpClient) {}

  list() {
    return this.httpClient.get<Book[]>(this.API).pipe(
      first(),
      delay(1000),
      tap((books) => console.log(books))
    );
  }

  save(record: Book) {
    return this.httpClient.post<Book>(this.API, record).pipe(first());
  }
}
