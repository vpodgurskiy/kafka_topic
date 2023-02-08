import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageOrdersComponent } from './component/page-orders/page-orders.component';
import { MaterialModule } from "./material.module";
import { HttpClientModule } from "@angular/common/http";
import {DialogOrderStatusComponent} from "./component/dialog-order-status/dialog-order-status.component";
import {DialogOrderCreateComponent} from "./component/dialog-order-create/dialog-order-create.component";

@NgModule({
  declarations: [
    AppComponent,
    PageOrdersComponent,
    DialogOrderStatusComponent,
    DialogOrderCreateComponent
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
