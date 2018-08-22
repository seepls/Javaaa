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

//3. insertion sort : good with small number of elements only 
// go along the array and create a partion making a  sorted array as you traverse along the path . adding the next element u approah at right place .
public class Insertion{
public static void insertion(int[] arr){
int n = arr.length;
for(int i = 0 ; i < n;i++){
  for(int j = 0 ; j < i ; j++){
   if(arr[j]>arr[i]){
    int temp = arr[i];
     for(int k = i ;k>j;k--)
      {arr[k]=arr[k-1];}
      arr[j]=temp;
      }
      }
      }
      }
      
      

public static void main(String[] args){
	int arr[] = { 5,2,8,3,9};
	 System.out.println("Array Before Insertion Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
    insertion(arr);
    System.out.println("Array After Insertion Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                }
                }


//4. merge sort 
// based on divide and conquere , divides into halfs : till the base then sorts at each level while merging 
import java.io.*;
import java.lang.*;
class MergeSort{
	void merge (int arr[] , int l , int m , int r)
	{
		int n1 = m-l+1 ;
		int n2 = r-m ;
		// temprory arrays 
		int L[] = new int [n1] ;
		int R[] = new int [n2 ]; 
		//copy data in temprory arrays 
		for(int i = 0 ; i < n1 ;i ++)
			L[i] = arr[l+i];
		for(int j =0 ;j<n2;j++)
			R[j] = arr[m+1+j];
	         int i = 0 , j = 0 ;
		int k = l ;
		while(i < n1 && j < n2 )
		{
			if(L[i]<=R[j]){
				arr[k]= L[i];i++;}
			else {arr[k] = R[j]; j++;}
		k++;
		}
		 while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    } 
	void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}

//5.quick sort 
// picks and element as pivot and partitions the array about the fixed pivot 
// different versions of quick sort that pick pivot in different ways : first element , last element , ransom element , median;
//key process is partition 
//given an array and an element x of array as pivot , put it at its correct place in sorted array 
// put all smaller elements before x ,and  put all greater elements after x  // do all this in linear time 
import java.io.*;
import java.lang.*;
class QuickSort {
	int partition (int arr[] , int low ,int high ){
		int pivot = arr[high] ;
		int i = low -1 ;
		for (int j=low; j<high; j++)
       		 {
            		// If current element is smaller than or
            		// equal to pivot
           		 if (arr[j] <= pivot)
           		 {
              		  i++;
 
               		 // swap arr[i] and arr[j]
               		 int temp = arr[i];
               		 arr[i] = arr[j];
               		 arr[j] = temp;
           		 }	
        	  }
		int temp = arr[i+1];
       		 arr[i+1] = arr[high];
        	arr[high] = temp;
 
       		 return i+1;
    }
	
	void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
	 static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
    }
}





		
		




























