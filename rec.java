package sorting;
import java.util.Scanner;
public class rec { 
     
    static void bS(int arr[], int n) 
    { 
         
        if (n == 1) 
            return; 
        
        for (int i=0; i<n-1; i++) 
            if (arr[i] > arr[i+1]) 
            {  
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
       
        bS(arr, n-1); 
    } 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
   
    public static void main(String[] args) 
    {  
    	Scanner sc = new Scanner(System.in);
    	rec obj = new rec ();  
        int arr[] = {4, 34, 25,6, 12, 22, 11, 90}; 
        System.out.println("Unsorted array :");
        obj.printArray(arr);
        bS(arr, arr.length); 
        System.out.println("Sorted array :"); 
        obj.printArray(arr); 
    } 
}
