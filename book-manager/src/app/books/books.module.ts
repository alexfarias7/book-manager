import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BooksRoutingModule } from './books-routing.module';
import { BooksComponent } from './books/books.component';
import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { SharedModule } from '../shared/shared.module';
import { AngularSvgIconModule } from 'angular-svg-icon';

@NgModule({
  declarations: [BooksComponent],
  imports: [
    AngularSvgIconModule,
    CommonModule,
    BooksRoutingModule,
    AppMaterialModule,
    SharedModule,
  ],
})
export class BooksModule {}
