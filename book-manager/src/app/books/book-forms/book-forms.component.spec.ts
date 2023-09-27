import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookFormsComponent } from './book-forms.component';

describe('BookFormsComponent', () => {
  let component: BookFormsComponent;
  let fixture: ComponentFixture<BookFormsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BookFormsComponent]
    });
    fixture = TestBed.createComponent(BookFormsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
