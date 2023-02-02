import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {PageMessageComponent} from "./component/page-message/page-message.component";
import {HttpClientModule} from "@angular/common/http";
import { MaterialModule } from "./material.module";

@NgModule({
  declarations: [
    AppComponent,
    PageMessageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
