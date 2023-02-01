import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from "@angular/material/table";
import { OrderService } from 'src/app/service/order.service';
import { Order } from "../../model/order";

@Component({
  selector: 'app-page-orders',
  templateUrl: './page-orders.component.html',
  styleUrls: ['./page-orders.component.css']
})
export class PageOrdersComponent implements OnInit {

  constructor(private orderService: OrderService) {
  }

  displayedColumns: string[] = [
    'orderNumber',
    'description',
    'orderStatus',
  ];

  dataSource: MatTableDataSource<Order> = new MatTableDataSource(
    [] as Order[]
  );

  ngOnInit(): void {
    this.getAllOrders();
  }

  getAllOrders(): void {
      this.orderService.getAllOrders()
      .subscribe((data: Order[]) => {
        this.dataSource.data = data;
    })
  };
}
