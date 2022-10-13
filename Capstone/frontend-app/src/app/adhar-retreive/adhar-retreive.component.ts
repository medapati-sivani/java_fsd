import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { UserClass } from '../UserClass';

@Component({
  selector: 'app-adhar-retreive',
  templateUrl: './adhar-retreive.component.html',
  styleUrls: ['./adhar-retreive.component.css']
})
export class AdharRetreiveComponent implements OnInit {
  adhars:Array<UserClass>=[];
  constructor(public ps:ProductService) { }

  ngOnInit(): void {
    this.findAllAdhar();
  }
  findAllAdhar(){
    this.ps.findAllAdhar().subscribe({
      next:(result:any)=>this.adhars=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
  
    })
  }
}
