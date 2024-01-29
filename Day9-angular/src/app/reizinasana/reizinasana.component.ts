import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-reizinasana',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './reizinasana.component.html',
  styleUrl: './reizinasana.component.css'
})
export class ReizinasanaComponent {
  NumInput1: number = 0;
  NumInput2: number = 0;
  result: number = 0;

  perform(): void {
    this.result= this.NumInput1 * this.NumInput2;
  }
}
