import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs/internal/Observable";
// @ts-ignore
import config from '../app.config.json';
import {Injectable} from "@angular/core";
import { Message } from '../model/message';

@Injectable({
  providedIn: 'root',
})
export class MessageService {

  constructor(private http: HttpClient) {
  }

  getAllMessages(): Observable<Message[]> {
    return this.http.get<Message[]>(`${config.apiPath}text_messages`, {});
  }
}
