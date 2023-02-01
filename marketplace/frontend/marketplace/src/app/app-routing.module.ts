import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageOrdersComponent } from "./component/page-orders/page-orders.component";

const routes: Routes = [
  {
    path: 'orders',
    component: PageOrdersComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
