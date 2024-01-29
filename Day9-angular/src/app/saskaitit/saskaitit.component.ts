import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-saskaitit',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './saskaitit.component.html',
  styleUrl: './saskaitit.component.css'
})
export class SaskaititComponent {
  NumInput1: number = 0;
  NumInput2: number = 0;
  result: number = 0;

  perform(): void {
    this.result= this.NumInput1 + this.NumInput2;
  }

}
