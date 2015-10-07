package collectionsandbox;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class Hashmap_Collection {

   public static void main(String[] args) {
	   
	   //HashMap
      Map map = new HashMap(); 

      map.put("Gibson", "Grabber");
      map.put("Epiphone", "Semi-hollow");
      map.put("Fender", "Jazz");
//      map.put("Fender", "Precision");
      map.put(null, null);
      
      System.out.println(" Map Items:");
      System.out.print(map);
      System.out.println();
      System.out.println(map.get("Fender"));

      //TreeMap
      TreeMap tm = new TreeMap();
      tm.put("Andrew", new Double(3434.34));
      tm.put("Piera", new Double(123.22));
      tm.put("Mike", new Double(1378.00));

      Set set = tm.entrySet();

      Iterator i = set.iterator();

      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      double balance = ((Double)tm.get("Andrew")).doubleValue();
      tm.put("Andrew", new Double(balance + 1000));
      System.out.println("Andrew's new balance: " +
      tm.get("Andrew"));
      System.out.println(tm.higherKey("Andrew"));

   }

}