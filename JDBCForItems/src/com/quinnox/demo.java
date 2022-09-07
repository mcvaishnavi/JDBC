package com.quinnox;


import java.util.LinkedList;
import java.util.Scanner;



public class demo {

	
	public static void main(String[] args)throws Exception {
		
		
		
		
	
		//LinkedList<fashion_details> allfashion = vDAO.getAllfashion();
		//System.out.println(allfashion);
		
	
		//String message=vDAO.addProduct();
		//System.out.println(message);
			
			int choice = 0;
			while(choice <6) {
			System.out.println("1. display all \n2. addproducts \n3. retrieve product based on id \n4. retrieve product based on type \n5. retrive product based on price filtered in low -> high");
			System.out.println("Enter your choice :\n");
			Scanner in = new Scanner(System.in);
			choice = in.nextInt();
			
			switch(choice)
			{
				case 1 : System.out.println("display all");
						 LinkedList<fashion_details> allfashion = vDAO.getAllfashion();
						 System.out.println(allfashion);
						 break;
						 
				case 2 : System.out.println("addproducts");
						 String message=vDAO.addProduct();
						 System.out.println(message);
						 break;
						 
				case 3 : System.out.println("retrieve product based on id");
						 Scanner sc = new Scanner(System.in);
						 System.out.println("Please enter the ID to be searched by");
						 int idNo = sc.nextInt();
						 LinkedList<fashion_details> Id = vDAO.byID(idNo);
						 System.out.println(Id);
						 break;
						 
				case 4 : System.out.println("retrieve product based on type");
						 Scanner sc1 = new Scanner(System.in);
						 System.out.println("Please enter the Type to be searched by");
						 String type = sc1.next().toString(); 
						 LinkedList<fashion_details> Type = vDAO.byType(type);
						 System.out.println(Type);
						 break;
						 
			   case 5 : System.out.println("retrive product based on price filtered in low -> high");
						
						LinkedList<fashion_details> Price = vDAO.Price();
			   			System.out.println(Price);
			   			break;
			   			
			   default : System.out.println("invalid input");
			   			 
			}
		
			}
		
				
		
		

	}

}
