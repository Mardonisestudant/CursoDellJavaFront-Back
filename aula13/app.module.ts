import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AutorComponent } from './autor/autor.component';
import {FilmeComponent} from './filmes/filme.component';
@NgModule({
  declarations: [
    AppComponent,
    FilmeComponent,
    AutorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

