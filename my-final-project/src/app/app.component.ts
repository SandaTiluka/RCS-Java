import { Component, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { TitulbildeComponent } from './titulbilde/titulbilde.component';
import { IevadsComponent } from './ievads/ievads.component';

import { UserInputComponent } from './user-input/user-input.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, TitulbildeComponent, 
    IevadsComponent, UserInputComponent, ReactiveFormsModule, HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-final-project';
}



