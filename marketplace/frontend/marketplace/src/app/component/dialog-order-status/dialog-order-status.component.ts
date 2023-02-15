import {Component, Inject, OnInit} from '@angular/core';
import {MatTableDataSource} from "@angular/material/table";
import {RegistriesService} from "../../service/registries.service";
import {OrderStatus} from "../../model/registries";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {MatListOption} from "@angular/material/list";

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

  onSaveClick(): string | null {
    if (this.orderStatus != "") {
      return this.orderStatus;
    } else {
      return null;
    }
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

  selectedRow(selected: MatListOption[]) {
    if (selected.length > 0) {
      this.orderStatus = selected[0].value.statusName;
    } else {
      this.orderStatus = "";
    }
  }
}
