import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent 
{
  constructor(
    private http:HttpClient,
    private httpmodule:HttpClientModule,
    private router:Router
    ){

     }

     onresult()
     {
      this.http.get('http://localhost:8080/api/medicare/login').subscribe( (signin:any)=>{ 
        alert("Signup Sucessfully")
        this.router.navigate(['/login'])
      })
     }
  onsubmit(data:any)
  {
    console.log(data)
    this.http.post('http://localhost:8080/api/medicare/signup',data).subscribe((data)=>{},
    error=>console.log(error));
    this.onresult();
  }

}
