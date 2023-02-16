import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {
  tprice:number=0;
  ProductArray : any;
  isResultLoaded = false;

  constructor(private http:HttpClient, private router:Router)
  {
    
    this.getAllproduct();
  }

  getAllproduct()
  {
    
    this.http.get("http://localhost:8080/api/medicare/showCart")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.ProductArray = resultData;
        this.ProductArray.forEach((item: any)=> this.tprice+=Number(item.price))
    });
  }

  setUpdate(data:any)
  {

  }


  buy()
  {

  }
// onCreate(){
//   this.router.navigate(['/product'])
// }

}

