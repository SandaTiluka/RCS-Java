import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-imput',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './user-imput.component.html',
  styleUrl: './user-imput.component.css'
})
export class UserImputComponent implements OnInit {
  inputValue: string = "";

  inputNumber1: string = "";
  convertedInputNumber1 = parseInt(this.inputNumber1);

  inputNumber2: string = "";
  convertedInputNumber2 = parseInt(this.inputNumber2);



  constructor() {}
  ngOnInit(): void{

  }

  demoOut(): void{
    console.log(this.inputValue);
    
  }

  demoOut(): void{
    
    console.log()
  }

}
