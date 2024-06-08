import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { AdminTemplateComponent } from './admin-template/admin-template.component';
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatButton, MatIconButton} from "@angular/material/button";
import {MatIcon, MatIconModule} from "@angular/material/icon";
import {MatChipTrailingIcon} from "@angular/material/chips";
import {MatMenu, MatMenuItem, MatMenuTrigger} from "@angular/material/menu";
import {MatDrawer, MatDrawerContainer, MatSidenav, MatSidenavModule} from "@angular/material/sidenav";
import {MatList, MatListItem} from "@angular/material/list";

@NgModule({
  declarations: [
    AppComponent,
    AdminTemplateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    MatButton,
    MatIconButton,
    MatIconModule,
    MatSidenavModule,
    MatDrawer,
    MatDrawerContainer,
    MatMenu,
    MatMenuTrigger,
    MatMenuItem,
    MatDrawerContainer,
    MatList,
    MatListItem,
    MatDrawer,
  ],
  providers: [
    provideAnimationsAsync()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
