import {Component, OnInit} from '@angular/core';
import { MatTableDataSource } from "@angular/material/table";
import {MessageService} from "../../service/message.service";
import {Message} from "../../model/message";

@Component({
  selector: 'app-page-message',
  templateUrl: './page-message.component.html',
  styleUrls: ['./page-message.component.scss']
})
export class PageMessageComponent implements OnInit {

  displayedColumns: string[] = [
    'sender',
    'messageText'
  ];

  messages: Message[] | null = [];

  constructor(private messageService: MessageService) {
  }

  ngOnInit(): void {
    this.getAllMessages();
  }

  getAllMessages(): void {
    this.messageService.getAllMessages()
    .subscribe((data: Message[]) => {
      this.messages = data;
    })
  };

  deleteAllMessages() {
    this.messageService.deleteAllMessages()
    .subscribe(() => this.ngOnInit());
  }
}
