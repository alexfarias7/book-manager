import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category',
})
export class CategoryPipe implements PipeTransform {
  transform(value: string): string {
    switch (value) {
      case 'fantasia':
        return 'code';
      case 'ficção científca':
        return 'computer';
    }
    return 'code';
  }
}
