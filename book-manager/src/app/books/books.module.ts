import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BooksRoutingModule } from './books-routing.module';
import { BooksComponent } from './books/books.component';
import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SharedModule } from '../shared/shared.module';
import { AngularSvgIconModule } from 'angular-svg-icon';
import { BookFormsComponent } from './book-forms/book-forms.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [BooksComponent, BookFormsComponent],
  imports: [
    AngularSvgIconModule,
    CommonModule,
    BooksRoutingModule,
    FormsModule,
    AppMaterialModule,
    ReactiveFormsModule,
    SharedModule,
  ],
})
export class BooksModule {}
