import { Component } from '@angular/core';
import { HttpClient ,HttpClientModule} from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-insertproduct',
  templateUrl: './insertproduct.component.html',
  styleUrls: ['./insertproduct.component.css']
})
export class InsertproductComponent 
{
  constructor(
    private http:HttpClient,
    private httpmodule:HttpClientModule,
    private router:Router
    ){

     }

     done()
     {
      this.http.get('http://localhost:8080/api/medicare/viewcart').subscribe( (view:any)=>{ 
        alert("done")
        this.router.navigate(['/viewproduct'])
      })
 
     }
  onInsert(data:any)
  {
    this.http.post('http://localhost:8080/api/medicare/updatemedicine',data).subscribe((data)=>{
      
     
    },
    error=>console.log(error));
    this.done();
  }
}
