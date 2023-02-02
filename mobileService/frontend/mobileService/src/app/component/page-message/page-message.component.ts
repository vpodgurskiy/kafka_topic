import {Component, OnInit} from '@angular/core';
import { MatTableDataSource } from "@angular/material/table";
import {MessageService} from "../../service/message.service";
import {Message} from "../../model/message";

@Component({
  selector: 'app-page-message',
  templateUrl: './page-message.component.html',
  styleUrls: ['./page-message.component.css']
})
export class PageMessageComponent implements OnInit {

  constructor(private messageService: MessageService) {
  }

  displayedColumns: string[] = [
    'sender',
    'messageText'
  ];

  dataSource: MatTableDataSource<Message> = new MatTableDataSource(
    [] as Message[]
  );

  ngOnInit(): void {
    this.getAllOrders();
  }

  getAllOrders(): void {
    this.messageService.getAllMessages()
    .subscribe((data: Message[]) => {
      this.dataSource.data = data;
    })
  };
}
