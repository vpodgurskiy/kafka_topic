import {Component, OnInit} from '@angular/core';
import {MatTableDataSource} from "@angular/material/table";
import {RegistriesService} from "../../service/registries.service";
import {OrderStatus} from "../../model/registries";
import {MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-dialog-order-status',
  templateUrl: './dialog-order-status.component.html',
  styleUrls: ['./dialog-order-status.component.css']
})
export class DialogOrderStatusComponent implements OnInit {

  orderStatus: string | null = "";

  displayedColumns: string[] = [
    'statusName'
  ];

  dataSource: MatTableDataSource<OrderStatus> = new MatTableDataSource(
    [] as OrderStatus[]
  );

  constructor(
    public dialogRef: MatDialogRef<DialogOrderStatusComponent>,
    private registriesService: RegistriesService
  ) {}

  onCancelClick() {
    this.dialogRef.close();
  }

  onSaveClick() {
    return this.orderStatus;
  }

  ngOnInit(): void {
    this.getOrderStatuses();
  }

  getOrderStatuses(): void {
    this.registriesService.getOrderStatuses()
    .subscribe((data: OrderStatus[]) => {
      this.dataSource.data = data;
    })
  };

  selectedRow(row: any) {
    console.log(row);
  }
}
