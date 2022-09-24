import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-operations',
  templateUrl: './employee-operations.component.html',
  styleUrls: ['./employee-operations.component.css']
})
export class EmployeeOperationsComponent implements OnInit {
  msg:string=" "
  constructor(public router:Router, public es:EmployeeService ) { }
  employee:any;
  ngOnInit(): void {
    let obj=sessionStorage.getItem("employeeInfo");
    if(obj!=null){
      this.employee=JSON.parse(obj);
    }
  }
  viewAll(){
    this.router.navigate(["employee"]);
  }
  Delete(id:any){
    this.es.delete(id).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
    
    this.msg="Record deleted succesfully";
    
  }
  updateemp(){
    this.router.navigate(["update"]);
  }
}
