import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs/internal/Observable";
import { Order } from "../model/order";
// @ts-ignore
import config from '../app.config.json';
import {Injectable} from "@angular/core";
import {OrderStatus} from "../model/registries";

@Injectable({
  providedIn: 'root',
})
export class RegistriesService {

  constructor(private http: HttpClient) {
  }

  getOrderStatuses(): Observable<OrderStatus[]> {
    return this.http.get<OrderStatus[]>(`${config.apiPath}registries/orders/status`, {});
  }
}
