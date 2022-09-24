import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { Router } from '@angular/router';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employeeRef=new FormGroup({
  id:new FormControl(),
  first_name:new FormControl(),
  last_name: new FormControl(),
  email: new FormControl()

  })
  constructor(public es:EmployeeService, public router:Router) { }
  employees:Array<Employee>=[]
  ngOnInit(): void {
    this.loademployeedetails();
  }
  loademployeedetails(){
    this.es.loademployeeData().subscribe({
      next:(data:any)=>this.employees=data,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("Completed")
    })
  }
  storeemployee(){
    let Employee=this.employeeRef.value;
    this.es.storeemployeeData(Employee).subscribe({
      next:(data:any)=>console.log(data),
      error:(error:any)=>console.log(error),
      complete:()=>this.loademployeedetails()

    })
  }

  viewDetails(employee:any){
    sessionStorage.setItem("employeeInfo",JSON.stringify(employee));
    this.router.navigate(["employee-operations"])
  }
}
