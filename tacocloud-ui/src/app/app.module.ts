import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RecentsComponent } from './recents/recents.component';
import { DesignComponent } from './design/design.component';

@NgModule({
  declarations: [
    AppComponent,
    RecentsComponent,
    DesignComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
