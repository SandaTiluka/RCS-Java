import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ParmaniComponent } from './parmani/parmani.component';
import { SmiekligaComponent } from './smiekliga/smiekliga.component';
import { GalvenaComponent } from './galvena/galvena.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule,
     RouterOutlet, 
     FormsModule,
     HeaderComponent, 
     FooterComponent,
     ParmaniComponent,
     SmiekligaComponent,
     GalvenaComponent,
    ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Day8-angular';
}
