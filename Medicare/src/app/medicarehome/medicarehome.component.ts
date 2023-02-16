import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-medicarehome',
  templateUrl: './medicarehome.component.html',
  styleUrls: ['./medicarehome.component.css']
})
export class MedicarehomeComponent {
  // amount:any
  amount =500;
  constructor(private http:HttpClient, private router:Router)
  {
    
    // this.getAllCustomer();
    this.getAllproduct();
  }


searchIt(data:any)
{
 console.log(data)
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


  

  addToCart(data :any)
  {
    this.http.post("http://localhost:8080/api/medicare/addToCart"+ "/"+ data,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);

    });
  }
}
