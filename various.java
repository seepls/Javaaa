//1. FIBONACI
class Fibo{
static int n1 = 0 , n2=1 , n3=0;
static void printfibo(int count){
if(count > 0){
n3 = n2+n1 ;
 n1=n2;
 n2=n3;
 System.out.print(" "+n3 );
 printfibo(count-1);
 }
 }
 public static void main(String[] args){
 int count= 10;
 System.out.print(n1 + " " +n2);
 printfibo(count-2);
 }
 }
 
  
// without using recursion one uses for loop .

//2.prime
import java.io.*;
import java.lang.*;
public class Prime{
public static void main(String[] args){
int i ,flag=0;
int n =7 ;// number to be checked .
int m = (int) Math.sqrt(n);
if(n==0||n==1){
System.out.println(n+"not a prime ");
}
else{
for(i=2;i<=m;i++)
{
 if(n%i == 0)
 {System.out.println(n+"not a prime");break;}
 else{ System.out.println(n+" a prime");}
 }
 }
 }}


//3.palindrome
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  // can also use charAt() function and compare string in reverse order .

//
