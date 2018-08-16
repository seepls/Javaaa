//java Final keyword is used to :
// stop value change , stop method overriding  , stop inheritance
// 1. variable
class Bike9{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  
 }  
}

// Output:Compile Time Error
// 2. method 
class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}  
// Output:Compile Time Error
//3. final class
// If you make any class as final, you cannot extend it.
final class Bike{}  
  
class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run();  
  }  
}  


//final method is inherited but you cannot override it.





//A final variable that is not initialized at the time of declaration is known as blank final variable.
//If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful
// we can initialize finalblanck variable only in constructor 
class Bike10{  
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println(speedlimit);  
  }  
  
  public static void main(String args[]){  
    new Bike10();  
 }  
}  


//A static final variable that is not initialized at the time of declaration is known as static blank final variable.
//It can be initialized only in static block.
