import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {
  // items = [];

  // constructor() { }

  // ngOnInit(): void {
  // }

  // addItem(productName: string, price: number) {
  //   this.items.push({ productName, price, quantity: 1 });
  // }

  // removeItem(item) {
  //   this.items = this.items.filter(i => i !== item);
  // }

  // getTotal() {
  //   return this.items.reduce((acc, item) => acc + item.price * item.quantity, 0);
  // }

  // checkout() {
  //   alert(`Checking out - total cost: ${this.getTotal()}`);
  // }

  // items=[];

  // Produ

  ProductArray : any;
  isResultLoaded = false;

  constructor(private http:HttpClient, private router:Router)
  {
    
    // this.getAllCustomer();
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
    });
  }

  setUpdate(data:any)
  {

  }
// onCreate(){
//   this.router.navigate(['/product'])
// }

}

