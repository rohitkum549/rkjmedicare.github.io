import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-viewmedicine',
  templateUrl: './viewmedicine.component.html',
  styleUrls: ['./viewmedicine.component.css']
})
export class ViewmedicineComponent {

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


  setDelete(data :any)
  {
    this.http.delete("http://localhost:8080/api/medicare/deleteproduct"+ "/"+ data.id,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Medicine Deleted")
        this.getAllproduct();

      //   this.id='';
      //   this.foodname = '';
      // this.category = '';
      //   this.price  = 0;

  
    });
  }

  setUpdate(data: any)
  {
  //  this.foodname = data.foodname;
  //  this.category = data.category;
  //  this.price = data.price;
  //  this.image = data.image;
  //  this.UpdateRecords();
  }

}
