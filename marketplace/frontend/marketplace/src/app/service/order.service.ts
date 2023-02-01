import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs/internal/Observable";
import { Order } from "../model/order";
// @ts-ignore
import config from '../app.config.json';
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root',
})
export class OrderService {

  constructor(private http: HttpClient) {
  }

  getAllOrders(): Observable<Order[]> {
    return this.http.get<Order[]>(`${config.apiPath}orders`, {});
    // .pipe(
    //   retry(2),
    //   catchError(this._errorHandler)
    // );
  }
}
