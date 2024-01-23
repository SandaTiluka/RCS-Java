import { Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import path from 'path';
import { Component } from '@angular/core';
import { MainComponent } from './main/main.component';
import { FooterComponent } from './footer/footer.component';

export const routes: Routes = [
    {path: 'header', component: HeaderComponent},
    {path: 'main', component: MainComponent},
    {path: 'footer', component: FooterComponent},
];

