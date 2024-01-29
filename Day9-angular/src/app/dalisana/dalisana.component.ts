import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-dalisana',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './dalisana.component.html',
  styleUrl: './dalisana.component.css'
})
export class DalisanaComponent {
  NumInput1: number = 0;
  NumInput2: number = 0;
  result: number = 0;
  

  perform(): void {
    
    this.NumInput1 + this.NumInput2

  }
}
