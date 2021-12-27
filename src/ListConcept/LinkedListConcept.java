package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	    
		
		// Creating the Object of the Linked List Class 
		//Linked List Implements List Interface
		
		LinkedList<String> ll=new LinkedList<String>(); //defining the Object of LinkedListClass 
		
		
		//Adding of the Elements in the Linked List. 
		//It also contains the address of the next node 
		
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("Contents of linked list"+ ll);
		
		
		ll.addFirst("Naveen"); //Adding the First Element in the Linked List 
		ll.addLast("Agrawal"); //Adding the Last Element in the Linked List 
		
		//Printing the Contentss of Linked List
		System.out.println("Contents of linked list"+ ll);
		
		
		//Get the value of the Linked List we used Index 
		System.out.println(ll.get(0));
		
		//Setiing the Value of at particular Index in Linked List 
		ll.set(0,"Tom");
		
		//Printing the value of the Linked list 
		System.out.println(ll.get(0));
		
			
		// Removal of Element 
		ll.removeFirst();
		ll.removeLast();
		
		// Remove from Sepecific Element from the Linked List
		ll.remove(2);
		
		//Iterate all the values of the LinkedList 
		//1.For Loop 
		for (int n=0;n<ll.size();n++)
			System.out.println(ll.get(n));
		
		
		//2. Advance For loop
		for (String Str:ll)
			System.out.println(Str);

		//3. Iterator
		Iterator<String> it= ll.iterator();
		
		while (it.hasNext())
			// It has no Increment Operator 
			System.out.println(it.next());
		
	
		//4.  while loop 
		
		int num=0;
		while (num < ll.size())
		
			System.out.println(ll.get(num));
			num++;
		}
	}


