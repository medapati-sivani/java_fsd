import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeOperationsComponent } from './employee-operations/employee-operations.component'
import {HttpClientModule} from '@angular/common/http';
import { UpdateComponent } from './update/update.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    EmployeeComponent,
    EmployeeOperationsComponent,
    UpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, ReactiveFormsModule,HttpClientModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
