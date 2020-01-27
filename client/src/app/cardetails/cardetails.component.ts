import { Component, OnInit } from '@angular/core';
import { CarDetails } from '../cardetails'
import { DataService } from '../data.service'
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router'

@Component({
  selector: 'app-cardetails',
  templateUrl: './cardetails.component.html',
  styleUrls: ['./cardetails.component.css']
})
export class CardetailsComponent implements OnInit {
  carDetails: CarDetails = null;

  constructor(private dataService: DataService, private activeRoute: ActivatedRoute, private router:Router) { }

  ngOnInit() {
    this.getCarDetails();
  }

  getCarDetails(): void {
    this.activeRoute.params.subscribe(routeParams => {

      this.dataService.getCarDetails(routeParams.id).subscribe(

        (carDetails: CarDetails) => {
          this.carDetails = carDetails;
          console.log(carDetails);
        });

    });

  }

  goToCarPage() : void {
      this.router.navigateByUrl("/cars");
  }

}
