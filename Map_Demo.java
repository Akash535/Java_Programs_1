package Collection_Framework;

import java.util.Map.Entry;
import java.util.*;

// ##########################################     Map      #################################################
/*public class Map_Demo {
    public static void main(String []argu) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>      Map      <<<<<<<<<<<<<<<<<<<<<<<<");
        Map<String ,Integer> m1=new HashMap<>();
        m1.put("one",14);
        m1.put("two",29);
        m1.put("three",31);
        m1.put("four",46);
        m1.put("five",53);

        m1.put("one",11);                   //  ## 1. m1.put(key,value);

        m1.putIfAbsent("two",20);           //  ## 2. m1.putIfAbsent(key,value);
        System.out.println("\nMap m1 :"+m1);

        System.out.println("\nget id three :"+m1.get("three"));   //  ## 3. m1.get(Key);

        System.out.println("\ncontainsKey five :"+m1.containsKey("five"));   //  ## 4. m1.containsKey(Key);

        System.out.println("\ncontainsValue 23 :"+m1.containsValue(23));   //  ## 5. m1.containsValue(value);

        System.out.println("\nreplace Value four :"+m1.replace("four",44));   //  ## 6. m1.replace(key,newvalue);

        System.out.println("\nremove key four :"+m1.remove("four"));   //  ## 7. m1.remove(key);
        System.out.println(m1);

        System.out.println("\nkey set :"+m1.keySet());      //  ## 8. m1.keySet();

        System.out.println("\nvalues set :"+m1.values());      //  ## 9. m1.values();

        System.out.println("\nentry set :"+m1.entrySet());      //  ## 10. m1.entrySet();

        Set<Entry<String ,Integer>> entries=m1.entrySet();
        for(Entry<String , Integer> entry: m1.entrySet()){
            entry.setValue(entry.getValue()*10);
        }
        System.out.println("m1 *10 :"+m1);
    }
}
 */



// ##########################################     HashMap      #################################################
/*public class Map {
    public static void main(String []argu){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>      HashMap      <<<<<<<<<<<<<<<<<<<<<<<<");
        HashMap m2=new HashMap();
        m2.put(6,"ZZZZ");
        HashMap m1=new HashMap();           // $$$$$$ HashMap();  $$$$$$
        m1.put(4,"Akash");                                                  // $$ 1. m1.put(Key,Value);
        m1.put(null,null);
        m1.put(2,"Dipak");
        m1.put(1,"Sachin");
        m1.put(5,"Rajesh");
        m1.put(3,"Sachin");
        m1.putAll(m2);                                                      // $$ 2. m1.putAll(Map m2);
        System.out.println("m1 :"+m1);

        System.out.println("\nremove object key 3 :"+m1.remove(3));     // $$ 3. m1.remove(Key);
        System.out.println("m1 :"+m1);

        System.out.println("\nget object kye 3 :"+m1.get(3));               // $$ 4. m1.get(key);
        System.out.println("get object kye 2 :"+m1.get(2));
        System.out.println("m1 :"+m1);

        System.out.println("\ncontains kye 3 :"+m1.containsKey(3));               // $$ 5. m1.containsKey(key);
        System.out.println("contains kye 5 :"+m1.containsKey(5));
        System.out.println("m1 :"+m1);

        System.out.println("\nkyeSet 3 :"+m1.keySet());                           // $$ 6. m1.keySet();
        System.out.println("m1 :"+m1);

        System.out.println("\nentrySet 3 :"+m1.entrySet());                        // $$ 7. m1.entrySet();
        System.out.println("m1 :"+m1);
    }
}
 */




// ##########################################     Hashtable      #################################################
/*public class Map {
    public static void main(String[] argu) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>      Hashtable      <<<<<<<<<<<<<<<<<<<<<<<<");
        Hashtable m1 = new Hashtable();                     // $$$$$$ Hashtable();  $$$$$$
        m1.put(4,"Akash");                                                  // $$ 1. m1.put(Key,Value);
        //m1.put(null,null);
        m1.put(2,"Dipak");
        m1.put(1,"Sachin");
        m1.put(5,"Rajesh");
        m1.put(3,"Sachin");
                                                                            // $$ 2. m1.putAll(Map m2);
        System.out.println("m1 :"+m1);

        System.out.println("\nremove object key 3 :"+m1.remove(3));     // $$ 3. m1.remove(Key);
        System.out.println("m1 :"+m1);

        System.out.println("\nget object kye 3 :"+m1.get(3));               // $$ 4. m1.get(key);
        System.out.println("get object kye 2 :"+m1.get(2));
        System.out.println("m1 :"+m1);

        System.out.println("\ncontains kye 3 :"+m1.containsKey(3));         // $$ 5. m1.containsKey(key);
        System.out.println("contains kye 5 :"+m1.containsKey(5));
        System.out.println("m1 :"+m1);

        System.out.println("\nkyeSet 3 :"+m1.keySet());                     // $$ 6. m1.keySet();
        System.out.println("m1 :"+m1);

        System.out.println("\nentrySet 3 :"+m1.entrySet());                 // $$ 7. m1.entrySet();
        System.out.println("m1 :"+m1);
    }
}
 */


// ##########################################     TreeSet      #################################################
/*public class Map {
    public static void main(String[] argu) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>      TreeSet      <<<<<<<<<<<<<<<<<<<<<<<<");
        TreeSet m1=new TreeSet();
        m1.add("akash");                                                  // $$ 1. m1.add(Value);
        //m1.add(null);
        m1.add("Dipak");
        m1.add("Sachin");
        m1.add("Rajesh");
        m1.add("Sachin");
        // $$ 2. m1.putAll(Map m2);
        System.out.println("m1 :"+m1);
    }
}
 */