import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { AtnemsanaComponent } from './atnemsana/atnemsana.component';
import { DalisanaComponent } from './dalisana/dalisana.component';
import { SaskaititComponent } from './saskaitit/saskaitit.component';
import { ReizinasanaComponent } from './reizinasana/reizinasana.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, 
    AtnemsanaComponent, DalisanaComponent, SaskaititComponent, ReizinasanaComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Day9-angular';
}
