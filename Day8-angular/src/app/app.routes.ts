import { Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import path from 'path';
import { Component } from '@angular/core';
import { MainComponent } from './main/main.component';
import { FooterComponent } from './footer/footer.component';
import { GalvenaComponent } from './galvena/galvena.component';
import { ParmaniComponent } from './parmani/parmani.component';
import { SmiekligaComponent } from './smiekliga/smiekliga.component';

export const routes: Routes = [
    {path: 'galvena', component: GalvenaComponent},
    {path: 'parmani', component: ParmaniComponent},
    {path: 'smiekligabilde', component: SmiekligaComponent},
];

