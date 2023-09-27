import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent {
  displayedColumns = ['title', 'category', 'actions'];

  onAdd() {
    this.router.navigate(['books/new']);
    //this.router.navigate(['new'], { relativeTo: this.route });
  }

  constructor(private router: Router, private route: ActivatedRoute) {}
}
