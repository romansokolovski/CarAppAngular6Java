import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service'
import { Car } from '../car';
import { Router } from '@angular/router'

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
  cars: Car[] = [];
  searchText;
  constructor(private dataService: DataService, private router:Router) { }

  ngOnInit() {
    this.getCarList();
  }

  getCarList(): void {
    this.dataService.getCarList().subscribe(
      (cars: Car[]) => {
        this.cars = cars;
        console.log(cars)
      });
  }

  goToDetailsPage(id : number) : void {
      this.router.navigateByUrl("/cardetails/"+id);
  }

}
