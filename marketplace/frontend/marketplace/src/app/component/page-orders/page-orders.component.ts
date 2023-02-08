import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from "@angular/material/table";
import { OrderService } from 'src/app/service/order.service';
import { Order } from "../../model/order";
import {DialogOrderStatusComponent} from "../dialog-order-status/dialog-order-status.component";
import {MatDialog} from "@angular/material/dialog";
import {RegistriesService} from "../../service/registries.service";

@Component({
  selector: 'app-page-orders',
  templateUrl: './page-orders.component.html',
  styleUrls: ['./page-orders.component.css']
})
export class PageOrdersComponent implements OnInit {

  isActive = false;

  displayedColumns: string[] = [
    'orderNumber',
    'description',
    'orderStatus',
    'action'
  ];

  dataSource: MatTableDataSource<Order> = new MatTableDataSource(
      [] as Order[]
  );

  constructor(private orderService: OrderService,
              public dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.getAllOrders();
  }

  getAllOrders(): void {
      this.orderService.getAllOrders()
      .subscribe((data: Order[]) => {
        this.dataSource.data = data;
    })
  };

  addData() {}

  removeData() {}

  setNewStatus(): void {
    const dialogRef = this.dialog.open(DialogOrderStatusComponent);
    dialogRef.afterClosed().subscribe((data: string) => {
      if (data) {
        this.orderService.setOrderStatus(data);
        this.ngOnInit();
      }
    });
  }
}
