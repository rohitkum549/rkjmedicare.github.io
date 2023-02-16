import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
//   onadminlogin(data:any){
// console.log(data)
// }

constructor(
  private http:HttpClient,
  private httpmodule:HttpClientModule,
  private route:Router
  ){

   }
vali:any
onloginfailed()
{
  this.http.get('http://localhost:8080/api/medicare/login').subscribe( (signin:any)=>{ 
    this.vali=signin;
    console.log(this.vali);
    if(this.vali==true)
    {
      alert("Login SucessFully")
      this.route.navigate(['/afteradminlogin'])
    }
    else
    {
      alert(" Wrong -- Email Or Password")
      this.route.navigate(['/login'])
    }
  })
}
onadminlogin(data:any)
{
  console.log(data)
  this.http.post('http://localhost:8080/api/medicare/login',data).subscribe((data)=>{
    console.log(data)
},
  error=>console.log(error));
  this.onloginfailed();

}
}
