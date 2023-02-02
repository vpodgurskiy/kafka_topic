import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {PageMessageComponent} from "./component/page-message/page-message.component";

const routes: Routes = [
  {
    path: 'messages',
    component: PageMessageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
