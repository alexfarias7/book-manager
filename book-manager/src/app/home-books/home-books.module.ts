import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeBooksRoutingModule } from './home-books-routing.module';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule,
    HomeBooksRoutingModule
  ]
})
export class HomeBooksModule { }
