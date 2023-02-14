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
  }

  setOrderStatus(status: string, orderId?: string | null): Observable<any> {
    if (orderId != null) {
      return this.http.patch<any>(`${config.apiPath}orders/${orderId}/setStatus`,
        status
      );
    }
    return new Observable<any>;
  }

  createOrder(data: Order): void {
    this.http.post<Order[]>(`${config.apiPath}orders/create`, {
      data
    }).subscribe();
  }
}
