package sorting;
import java.util.*;
public class Bubble_Sort {
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	
	}
	public static void Reverse(int arr[],int i,int j) {
		while(i<=j) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Reverse(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
