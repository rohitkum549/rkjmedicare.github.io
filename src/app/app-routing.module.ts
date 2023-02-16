import { MedicineComponent } from './medicine/medicine.component';
import { ViewmedicineComponent } from './viewmedicine/viewmedicine.component';
import { AfteradminloginComponent } from './afteradminlogin/afteradminlogin.component';
import { InsertproductComponent } from './insertproduct/insertproduct.component';
import { CartComponent } from './cart/cart.component';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { MedicarehomeComponent } from './medicarehome/medicarehome.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'medicare',component:MedicarehomeComponent}
  ,{path:'signup',component:SignupComponent},
  {path:'login',component:LoginComponent},
  {path:'admin',component:AdminComponent},
  {path:'cart',component:CartComponent},
  {path:'insert',component:InsertproductComponent},
  {path:'afteradminlogin',component:AfteradminloginComponent},
  {path:'viewproduct',component:ViewmedicineComponent},
  {path:'viewmedicine',component:MedicineComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
