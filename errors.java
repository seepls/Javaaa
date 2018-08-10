// posible set of errors 

//1.
class Simple{  
public static void main(String[] args){  
byte a=10;  
byte b=10;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
byte c=(byte)(a+b);  
System.out.println(c);  
}}  

//2.
class OperatorExample{  
public static void main(String args[]){  
short a=10;  
short b=10;  
//a+=b;//a=a+b internally so fine  
a=a+b;//Compile time error because 10+10=20 now int  
System.out.println(a);  
}}  

//3. if u initialize m = 0 ; fuck all ! -_-
public class Fact{
public static void main(String[] args){
int n= 5,m=1 ;// number to be checked .

for(int i =1 ; i <= n ; i++ ) {

 m *=i;
 }
 System.out.println(n+"factorial is " + m);
 }
 }
