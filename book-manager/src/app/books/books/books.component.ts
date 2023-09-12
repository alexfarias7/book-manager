import { Component } from '@angular/core';
import { Book } from '../models/book';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss'],
})
export class BooksComponent {
  books: Book[] = [
    { _id: '01', title: 'o caminho dos reis', category: 'fantasia' },
    { _id: '02', title: 'guerra do velho', category: 'fição científca' },
  ];
  displayedColumns = ['title', 'category'];
}
