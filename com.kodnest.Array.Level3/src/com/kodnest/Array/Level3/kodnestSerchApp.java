package com.kodnest.Array.Level3;

import java.util.Scanner;

public class kodnestSerchApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter " + arr.length + "Elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		while (true) {
			System.out.println("Press1 for Serch");
			System.out.println("Press2 for Sorting");
			System.out.println("Press3 for Finding the Maximum and Minimum in the Array");
			System.out.println("Press anr other  for Tata bye bye......");
			int choise1 = sc.nextInt();
			switch (choise1) {
			case 1:
				System.out.println("Enter 1 for Lenear Search and 2 for Binary Search");
				int choice2 = sc.nextInt();
				if (choice2 == 1) {
					System.out.println("Enter the Key to Search");
					int key = sc.nextInt();
					KodnestSearchSort kod = new KodnestSearchSort();
					int res = kod.lenearSearch(arr, key);
					if (res >= 0) {
						System.out.println("Key found at Index" + res);
					} else if (choice2 == 2) {
						System.out.println("Key Not found");
					} else {
						return;
					}
				}

				else if (choice2 == 2) {

					System.out.println("Enter the Key to search");
					int key = sc.nextInt();
					KodnestSearchSort kod = new KodnestSearchSort();
					kod.bobbleSortAssending(arr);
					int res1 = kod.binarySearch(arr, key);
					if (res1 >= 0) {
						System.out.println("Key found at index" + res1);
					}
				} else {
					System.out.println("Key not Found");
				}
				break;
			case 2:
				System.out.println("Press 1 for BobbleSort,Press 2 for SelectionSort and 3 for InsertionSort");
				int Choice3 = sc.nextInt();
				System.out.println("Press 1 for BobbleSort Assending 2 For Bobble SortDessending");
				if (Choice3 == 1) {
					int choice4 = sc.nextInt();
					if (choice4 == 1) {
						KodnestSearchSort kod = new KodnestSearchSort();
						kod.bobbleSortAssending(arr);
                        System.out.println("Array After Bobble Sort Assending");

						for (int i = 0; i <= arr.length - 1; i++) {
							System.out.print(arr[i] + " ");
						}
						System.out.println();
					}

					 else if (choice4 == 2) {
						KodnestSearchSort kod = new KodnestSearchSort();
                         kod.bobbleSortDesending(arr);
                         System.out.println("Array After Bobble Sort Dessending");
                         for (int i = 0; i <= arr.length - 1; i++) {
 							System.out.print(arr[i] + " ");
 						}
 						System.out.println();
					 }
				}
					
                    if(Choice3==2) {
                    	System.out.println("Enter 1 for selectionAssending sort or 2 for Dessending");
                    	int Choice5=sc.nextInt();
                    	if(Choice5==1) {
                    	KodnestSearchSort kod1=new KodnestSearchSort();
                    	kod1.selectionSortAssending(arr);
                    	System.out.println("Array after the SelectionSort Assending");
                    	for(int i=0;i<=arr.length-1;i++) {
                    		System.out.print(arr[i]+" ");
                    	}
                    	}
                    	System.out.println();
                    	 if(Choice5==2) {
                    		 KodnestSearchSort kod1=new KodnestSearchSort();
                         	kod1.selectionSortDessending(arr);
                         	System.out.println("Array after the SelectionSort Dessending");
                         	for(int i=0;i<=arr.length-1;i++) {
                         		System.out.print(arr[i]+" ");
                         	}
                    	}
                         	System.out.println();
                    }
	
                    	break;
                    	
                    
               	 case 3:
               		 System.out.println("Press 1 for Finding Maximum value or press 2 for finding Minimum value");
               		 int Choice6=sc.nextInt();
               		KodnestSearchSort kod=new KodnestSearchSort();
               		 if(Choice6==1) {
               		 
               		 int maximum=kod.maxArray(arr);
               		 System.out.println("Maximum value in the Array is"+maximum);
               		 
               		 }
               		 else if(Choice6==2) {
               			int min= kod.minArray(arr);
               			System.out.println("Minimum value in the Array is"+min);
               		 }
               		 break;
               		 
               		 

                    
			default:
				System.out.println("Go to Vasan Eye care..");
				break;
				
				
			}
            return;

					}
					
		
				
			
			}
			

		
	}


