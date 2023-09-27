import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooksComponent } from './books/books.component';
import { BookFormsComponent } from './book-forms/book-forms.component';

const routes: Routes = [
  { path: '', component: BooksComponent },
  { path: 'new', component: BookFormsComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class BooksRoutingModule {}
