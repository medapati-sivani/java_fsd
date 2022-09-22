let num1=[];
let num2=new Array();
document.write("<br>size of array is "+num1.length);
document.write("<br>size of array is "+num2.length);
let num3=[10,20,30];
document.write("<br>size of array is "+num3.length);
document.write("<br>Elements are "+num3)
num3.push(100);
num3.push(200);
num3.unshift(1);
num3.unshift(2);
document.write("<br>Elements are "+num3)
num3.pop();
num3.shift();
document.write("<br>Elements are "+num3)
let num4=[10,20,30,40];
document.write("<br>Elements are "+num4);
document.write("<br>element at 0 position is "+num4[0]);
document.write("<br>elements at 1 position is "+num4[1]);
//num4.splice(1,2);
//num4.splice(1,1,111,122,133);
//num4.splice(0,0,444)
num4.splice(0,0,666)
document.write("<br>Elements are "+num4);