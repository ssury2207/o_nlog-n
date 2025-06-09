import java.util.*;
public class MergeSort{
    public static void merge(int arr[], int start, int end){
        int mid = start + ((end-start)/2);
        int temp[] = new int[end-start + 1];
        int i = start; //left half
        int j = mid+1; //right half
        int ptr = 0;//pointer for the tempArray
        while(i<=mid && j<=end){
            if( arr[i]<=arr[j] ){
                //good case 
                temp[ptr] = arr[i];
                i++; ptr++;
            }
            else {
                temp[ptr] = arr[j];
                j++; ptr++;
            }
        }
        while(i<=mid){
            temp[ptr] = arr[i]; ptr++; i++;
        }

        while(j<=end){
            temp[ptr] = arr[j]; ptr++; j++;
        }
        int num=start;
        for(int k = 0 ; k<temp.length; k++){
            arr[num] = temp[k];num++;
        }
    }

    public static void sort(int arr[], int start, int end){
        if( start>= end) return;
        int mid = (start) + ((end-start)/2);

        sort( arr, start, mid);
        sort( arr, mid+1 , end);
        merge( arr, start , end);
         
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me number of element you want to sort");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the element");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your original Array was");
        System.out.println("-----------------------");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sort(arr,0, n-1);
        System.out.println("\n" +"-----------------------");
        System.out.print("\n" +"Sorted Array is"+"\n");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n" +"-----------------------");


    }
}