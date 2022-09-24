import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
url="http://localhost:3000/employees";
  constructor(public http:HttpClient) { }
loademployeeData():Observable<Employee[]>{
return this.http.get<Employee[]>("http://localhost:3000/employees");
}

storeemployeeData(employee:any):Observable<Employee>{
  return this.http.post<Employee>("http://localhost:3000/employees",employee);
}

delete(id:any):Observable<any>{
  return this.http.delete<any>("http://localhost:3000/employees/"+id);
}
updateemployeeData(employee:any):Observable<Employee>{
  return this.http.put<Employee>("http://localhost:3000/employees",employee);
}
getCurrentEmp(id:any){
  return this.http.get("http://localhost:3000/employees/"+id);
}

updateCurrentEmp(id:any,data:any){
  return this.http.put("http://localhost:3000/employees/"+id,data);
}
}
