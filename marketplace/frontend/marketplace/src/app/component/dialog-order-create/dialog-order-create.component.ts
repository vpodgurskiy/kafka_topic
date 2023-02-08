import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {getNewOrder, Order} from "../../model/order";

@Component({
  selector: 'app-page-order-create',
  templateUrl: './dialog-order-create.component.html',
  styleUrls: ['./dialog-order-create.component.css']
})
export class DialogOrderCreateComponent implements OnInit {

  order: Order;

  constructor(public dialogRef: MatDialogRef<DialogOrderCreateComponent>)
  {
    this.order = getNewOrder();
  }

  ngOnInit(): void {
  }

  onSaveClick(): Order {
    return this.order;
  }
}
