package collectionsandbox;

import java.util.*;

public class List_Collection {
   public static void main(String args[]) {
	   //Array List
	  ArrayList<String> list = new ArrayList<String>();

	  list.add("Fender");
	  list.add("Squier");
	  list.add("Gibson");
	  list.add("Orange");
	  list.add("Ampeg");

	  System.out.println("Array:"+list);

	  list.add(0, "Guitar");
	  list.add(1, null);

	  System.out.println("Items added; new list:"+list);

	  list.remove("Orange");
	  list.remove(1);

	  System.out.println("Items deleted; new list"+list);
   }
}