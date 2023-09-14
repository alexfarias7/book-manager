import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeBooksRoutingModule } from './home-books-routing.module';
import { HomeComponent } from './home/home.component';
import { AngularSvgIconModule } from 'angular-svg-icon';

@NgModule({
  declarations: [HomeComponent],
  imports: [AngularSvgIconModule, CommonModule, HomeBooksRoutingModule],
})
export class HomeBooksModule {}
