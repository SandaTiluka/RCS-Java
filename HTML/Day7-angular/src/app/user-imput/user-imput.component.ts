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

  constructor() {}
  ngOnInit(): void{

  }

  demoOut(): void{
    console.log(this.inputValue);
  }

}
