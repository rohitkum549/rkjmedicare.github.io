import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-medicine',
  templateUrl: './medicine.component.html',
  styleUrls: ['./medicine.component.css']
})
export class MedicineComponent 
{

  constructor(private http:HttpClient,private Router:Router)
  {
    this.getAllproduct();
  }


  ProductArray : any[] = [];
  isResultLoaded = false;
  getAllproduct()
  {
    this.http.get("http://localhost:8080/api/medicare/viewcart")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.ProductArray = resultData;
    });
  }

  setBuy(data:any)
  {

  }
  setCart(data:any)
  {
    
  }
}
