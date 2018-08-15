// inheritance is a mechanism : by which object acuires all behaviours and properties from parent class
// idea : can create new class built upon old class 
syntax :
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  

// three kinds. 1. single 2.multilevel 3. hierarchical 

// 1.

class Animal {
void eat(){
System.out.println("eating... " );}
}
class Dog extends Animal {
void bark(){System.out.println("barking " );}
}
class TestInheritance{
public static void main(String args[]){
Dog d = new Dog() ;
d.bark();
d.eat();
}
}

// 2. multilevel 
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  

//3. heirarcheil 
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  

// why multilevel inheritance not supported ?
// if methods have same name if 2 diffrent class u inherit from then ambiguity 
