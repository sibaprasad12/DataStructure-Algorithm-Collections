package codingPrograms.nagarro;import java.util.Scanner;public class SecondThirdLargestNumber {	static int num;	static int[] array;		public static void main(String args[]){		System.out.println("Please enter number of element in array:");		Scanner sc=new Scanner(System.in);		num=sc.nextInt();		array=new int[num];		for(int i=0;i<num;i++){			array[i]=sc.nextInt();		} 		thirdLargest(array,num);			}	 		static void thirdLargest(int arr[],int size){		if(size<3){			System.out.println("Enter correct length");			return;		}		int largest=arr[0];		for(int i=0;i<size;i++){			if(arr[i]>largest)				largest=arr[i];		}				int secondLargest=arr[0];		for(int i=0;i<size;i++){			if(arr[i]>secondLargest && arr[i]<largest){				secondLargest=arr[i];			}		}				int thirdLargest=arr[0];		for(int i=0;i<size;i++){			if(arr[i]>thirdLargest && arr[i]<secondLargest){				thirdLargest=arr[i];			}		}				System.out.println("First Largest="+largest);		System.out.println("Second Largest="+secondLargest);		System.out.println("Third Largest"+thirdLargest); 			}}