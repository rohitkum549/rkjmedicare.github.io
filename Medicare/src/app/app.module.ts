import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { MedicarehomeComponent } from './medicarehome/medicarehome.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { AdminComponent } from './admin/admin.component';
import { CartComponent } from './cart/cart.component';
import { InsertproductComponent } from './insertproduct/insertproduct.component';
import { HttpClientModule } from '@angular/common/http';
import { AfteradminloginComponent } from './afteradminlogin/afteradminlogin.component';
import { ViewmedicineComponent } from './viewmedicine/viewmedicine.component';
import { MedicineComponent } from './medicine/medicine.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    MedicarehomeComponent,
    SignupComponent,
    LoginComponent,
    AdminComponent,
    CartComponent,
    InsertproductComponent,
    AfteradminloginComponent,
    ViewmedicineComponent,
    MedicineComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
