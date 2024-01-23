import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import path from 'path';
import { SaskaititComponent } from './saskaitit/saskaitit.component';
import { AtnemsanaComponent } from './atnemsana/atnemsana.component';
import { ReizinasanaComponent } from './reizinasana/reizinasana.component';
import { DalisanaComponent } from './dalisana/dalisana.component';
import { HeaderComponent } from './header/header.component';


export const routes: Routes = [
    {path: 'saskaitit', component: SaskaititComponent},
    {path: 'atnemt', component: AtnemsanaComponent},
    {path: 'reizinat', component: ReizinasanaComponent},
    {path: 'dalit', component: DalisanaComponent},
    
    
];
