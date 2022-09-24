import { Component, OnInit } from '@angular/core';
//import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router'; 
import { EmployeeService } from '../employee.service';
import {FormGroup,FormControl} from '@angular/forms';
@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  employeeeditRef=new FormGroup({
    
    first_name:new FormControl(' '),
    last_name: new FormControl(),
    email: new FormControl()
  
    })
  constructor(public es:EmployeeService,public router:ActivatedRoute) { }

  ngOnInit(): void {
    //console.log(this.router.snapshot.params['id']);
    this.es.getCurrentEmp(this.router.snapshot.params['id']).subscribe((result )=>{
      console.log(result);
      this.employeeeditRef=new FormGroup({
    
        first_name:new FormControl(),
        last_name: new FormControl(),
        email: new FormControl()
      
        })
    });
  }
  updateemployee(){
    console.log("employee",this.employeeeditRef.value)
    this.es.updateCurrentEmp(this.router.snapshot.params['id'],this.employeeeditRef.value).subscribe((result)=>{
      console.log("result",result);
    })
  }
}
