//1.linear search 
public class Linear{
public static void linear(int[] arr,int key){
int n = arr.length;int flag = 0;
for(int i = 0 ; i < n;i++){
  if(arr[i]==key) {System.out.println("yeah");break;}
       
      }
      if(flag==n)System.out.println("nah");
     }
      
      

public static void main(String[] args){
	int arr[] = { 5,2,8,3,9};
	 int key = 2;
	 linear(arr,key);
                }
                }
//2.binary search : searching a sorted array by repeatedly divide the array into halfs 
import java.io.*;
class Binary{
public static int binary (int arr[] , int l , int r , int x){
 if(r>=l){
 int  mid = l + (r-l)/2;
 if (arr[mid]==x)return x;
 if(arr[mid]>x)return binary(arr , l , mid-1 ,x);
 if(arr[mid]<x)return binary(arr,mid+1,r,x);
 }return -1;
 }
 public static void main(String[] args){
 Binary ob = new Binary() ; 
 int arr[] = {29,9,23 ,1999,12,13,14 } ;
 int n = arr.length;
 int x =1999 ;
 int result = binary (arr , 0 , n-1 , x);
 if(result== -1 ) {System.out.println("not present ");}
 else System.out.println("element found " + result);
 }}
