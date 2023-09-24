import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category',
})
export class CategoryPipe implements PipeTransform {
  transform(value: string): string {
    switch (value) {
      case 'fantasia':
        return 'assets/icons/wizard.svg';
      case 'ficção':
        return 'assets/icons/science-fiction.svg';
    }
    return 'code';
  }
}
