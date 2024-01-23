import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-atnemsana',
  standalone: true,
  imports: [],
  templateUrl: './atnemsana.component.html',
  styleUrl: './atnemsana.component.css'
})
export class AtnemsanaComponent implements OnInit {
  userInput1: number;
  userInput2: number;
  result: number;

  calculateSum(){
    this.result= this.userInput1 - this.userInput2;
  }

}
