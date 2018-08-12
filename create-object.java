// anonymous object
class Calculation{  
 void fact(int  n){  
  int fact=1;  
  for(int i=1;i<=n;i++){  
   fact=fact*i;  
  }  
 System.out.println("factorial is "+fact);  
}  
public static void main(String args[]){  
 new Calculation().fact(5);//calling method with anonymous object  
}  
}  

//creating multiple objects by one type only 
// initialization of primitive e.i : int a=10, b=20;  
//initialization of refrence variables Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects  
