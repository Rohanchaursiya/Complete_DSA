package sorting;

import java.util.Scanner;

public class BubbleSort {
	//Bubble Sort
	public static void Bubble_Sort(int n,int arr[]) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//Optimized Bubble Sort
	public static void Optimized_Bubble_Sort(int n,int arr[]){
		for(int i=0;i<n-1;i++) {
			int swapped=0;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=1;
				}
			}
			if(swapped==0) {
				break;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Bubble_Sort(n,arr);
		
		Optimized_Bubble_Sort(n,arr);

	}

}
