import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Car } from './car'
import { CarDetails } from './cardetails'
import { HttpHeaders } from '@angular/common/http';
import { CarDetailsReq } from './cardetailsreq'

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
  })
};

@Injectable({
  providedIn: 'root'
})
export class DataService {


  public CAR_LIST_API : string = '/carlist';
  public CAR_DETAIL_API : string = '/cardetailsapi';

  constructor(private http: HttpClient) { }

  public getCarList(): Observable<Car[]> {
    return (this.http.get<Car[]>(this.CAR_LIST_API));
  }

  public getCarDetails(id: number): Observable<CarDetails> {
    let req : CarDetailsReq = new CarDetailsReq();
    req.id = id;
    return (this.http.post<CarDetails>(this.CAR_DETAIL_API,req,httpOptions));
  }
}
