//1.bubble sort
public class Bubble{


static void bubble(int[] arr){
	int n = arr.length;
	int temp=0 ;
	for(int i=0 ;i <n;i++){
	 for( int j = 1 ;j<(n-i);j++){ //-i cause after i rounds i elements from end for sure sorted .
	    if(arr[j-1]> arr[j])
	    { temp = arr[j-1];
	      arr[j-1]=arr[j];
	      arr[j]=temp;
	      }
	      }}}
	      
public static void main(String[] args){
int arr[] = {3,2,7,4,5,8};
 System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
bubble(arr);
System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
}
}

//2.selection sort 
// locate the min from the rest and place the element in right position .swap the current element with the next lower element 
import java.io.*;
import java.lang.*;
public class Selection{
public static void selection (int[] arr){
int j = 0 ;
for(int i = 0; i<arr.length-1 ; i++)
{
int index =i; 
int min=arr[i];
for(j =i+1;j<arr.length ;j++){
 
if(arr[j] <arr[index] ){
 index=j;
 }}
 min=arr[index];
 arr[index]=arr[i];
 arr[i]=min;
 }
}
	      
public static void main(String[] args){
int arr[] = {3,2,7,4,5,8};
 System.out.println("Array Before selection Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
selection(arr);
System.out.println("Array After selection Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
}
}
