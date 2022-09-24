import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeOperationsComponent } from './employee-operations/employee-operations.component';
import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './login/login.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"employee",component:EmployeeComponent},
  {path:"employee-operations",component:EmployeeOperationsComponent},
  {path:"update/:id",component:UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
