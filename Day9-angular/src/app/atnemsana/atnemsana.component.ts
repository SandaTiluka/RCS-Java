import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-atnemsana',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './atnemsana.component.html',
  styleUrl: './atnemsana.component.css'
})
export class AtnemsanaComponent {
  NumInput1: number = 0;
  NumInput2: number = 0;
  result: number = 0;

  perform(): void {
    this.result= this.NumInput1 - this.NumInput2;
  }

}
