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

4.// finding length without using length() funciton 
 import java.io.*;
class len{
public static void main(String args[])throws Exception{
DataInputStream s = new DataInputStream(System.in);
String a , b ;
a= s.readLine();
b=new String ( );
int len = a.compareTo(b);

System.out.println(len);
}
}

5. // finding largest palindrome in a string 
 import java.io.*;
class Pali{
public static void main(String args[])throws Exception{
DataInputStream s = new DataInputStream(System.in);
String a , b ;

a= s.readLine();
int len = a.length();
int flag =0;
for(int i =len;i>=1 ; i--){ // i is to keep track of the length of string in which we look for being palindrome
for(int y = 0;y<=len-i;y++){// first index
 int t = 0 ;
  for(int m=0;m<i ; m++){
     if(a.charAt(y+m)==a.charAt(y+i-m-1)){ t++;}
    }
if(t==i ) { System.out.println(a.substring(y, i+y));flag=1;}
}
if(flag==1) break;
}

}}


//6. third largest element in a array using collections 
import java.util.*;
public class Third{
public static int third (Integer arr[],int total){
List<Integer> list = Arrays.asList(arr);
Collections.sort(list);
int element =list.get(total-3);
return element ;

}
public static void main(String args[]){
Integer arr[] ={1,2,5,3,8,1,3,4};
System.out.println(" third largest element is :" + third(arr,8));
}
}


// 7. removing duplicate elements from a array 
//1. using a temprory array 

//8. seprating odd and even indexed elements from a string 
import java.io.*;
import java.util.*;

public class Solution{
 private static void printEvenOddIndices(String[] words){
 for(String word: words ){
  boolean even=true ;
  StringBuilder oddchars = new StringBuilder(); // size ant fixed and so is the content 
  for(char c :word.toCharArray()){
   if(even){System.out.print(c);
   }else{oddchars.append(c);}
   even=!even;}
   System.out.print(" " +oddchars);
 }
 
}

 public static void main(String[] args)throws Exception{
 DataInputStream s = new DataInputStream(System.in);
 String a = s.readLine();
 a= a.trim();
 
 printEvenOddIndices(new String[]{a});
 }}


