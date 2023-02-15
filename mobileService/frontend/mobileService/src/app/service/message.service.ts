import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs/internal/Observable";
import { Message } from '../model/message';
// @ts-ignore
import config from '../app.config.json';
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root',
})
export class MessageService {

  constructor(private http: HttpClient) {
  }

  getAllMessages(): Observable<Message[]> {
    return this.http.get<Message[]>(`${config.apiPath}text_messages`, {});
  }

  deleteAllMessages(): Observable<any> {
    return this.http.delete<any>(`${config.apiPath}text_messages`, {});
  }
}
