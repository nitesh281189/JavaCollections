package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		//Normal Array 
		int a[]=new int[3];
		// This is static array. The size of array is fixed at the time of creation 
		//We cannot modify the size the array once the array is created 
		//If we try to modify it will ArrayIndexOut of bound Exception 
		//We cannot use these types of array in dynamic applications and for that we have ArrayList
		
		//dynamic array-Array List : It is an Object 
		//Size doesnt matter in Array list concept 
		//It maintains insertion order 
		//It is not synchronised : It is not thread safe 
		// It is slow as compared to other collections 
		// It allows random access to fetch the values as works on basis of index 
		//we can add any type of value in Array list 
		
		
		ArrayList ar=new ArrayList();//Non generic type of the ArrayList
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size()); //Length of the array list 
		
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());
		//It is dynamic in nature and uselful 
		//duplicate vales-can Store duplicate values also  
		ar.add(50);
		
		ar.add("nitesh");
		ar.add(true);
		ar.add('s');
		
		//We can store primitive as well as non primitive data types 
		//This is called non generic array list 
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		//Generic type in java 
		ar1.add(100);
		//ar1.add("selenium")--Not allowed . This is called generic in Java
		
		ArrayList<String> ar2=new ArrayList<String>(); 
		//Generic for String values 
		ar2.add("Agrawal");

		System.out.println(ar.get(0));
		
		//To print all the values of array list we have to use for Loop 
		
		//1. For loop
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		
		//Non-Generic and Generic  in Java 
		ArrayList<E> ar3=new ArrayList<E>(); 
		//We dont know about the data type going to stored in the ArrayList then we defined this as E 
											
		// The Objects of Class Employee is made by using Constructor 
		
		Employee e1=new Employee("Nitesh",31,"TAC");
		Employee e2=new Employee("TOM",31,"Dev");
		Employee e3=new Employee("Peter",31,"QA");
		
		//Create the ArrayList of Objects
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		
		// Three objects Stored in ArrayList.All three objects in Array List 
		
			
		//2.Iterator (Second method to access the array list)
		// It is used to traverse the values of the  Array List 
		// It does not work based on the index.
		
		Iterator<Employee> it=ar4.iterator();
		
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);	
		}
		//So in generic ArrayList we can Store primitive,non primitive as well as Objects also 
		// For traversing Object We use iterator 
		
		/****************************
		 add all 
		 */
		ArrayList ar5=new ArrayList();

		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");

		ArrayList<String> ar6=new ArrayList<String>();
		
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		
		ar5.removeAll(ar6);
		
		//for (int i=0;i<ar5.size();i++)
		//	System.out.println(ar5.get(i));
		
		//Retain All 
		// Common Part need to be checked and printed 
		
		ArrayList ar7=new ArrayList();
		
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QTP");

		ArrayList<String> ar8=new ArrayList<String>();
		
		ar8.add("test");
		ar8.add("Java");
		ar8.add("JavaScript");	
		
		ar7.retainAll(ar8);

		for (int i=0;i<ar7.size();i++)
		System.out.println(ar7.get(i));
	}
}
