

package Collection_Framework;
import java.util.*;

// ##########################################     Enumeration      ##############################################
/*public class Cursors{
    public static void main(String []argu){
        Vector v=new Vector();
        v.addElement("one");
        v.addElement("two");
        v.addElement("three");
        System.out.println(v);

        Enumeration e=v.elements();                                  //  ###########    Enumeration    ###########
        while (e.hasMoreElements())                                 // $$ 1. e.hasMoreElements();
        {
            String s=(String)e.nextElement();                       // $$ 2. e.nextElement();
            System.out.println(s+" : length "+s.length());
        }
    }
}
 */



// ################################################     Iterator     ##############################################
/*public class Cursors{
    public static void main(String []argu){
        ArrayList a=new ArrayList();
        for(int i=1;i<=10;i++){
            a.add(i);
        }
        System.out.println("a :"+a);
        Iterator it=a.iterator();                              //  ###########    Iterator     #############
        while (it.hasNext())                                  //  $$  1. it.hasNext();
        {
            Integer I=(Integer)it.next();                    //  $$  2. it.next();
            if(I>3 && I<8){
                it.remove();                                //  $$  3. it.remove();
            }
        }
        System.out.println("a :"+a);
    }
}
 */



//  ############################################      ListIterator      #########################################
/*public class Cursors {
    public static void main(String []argu) {
        LinkedList l=new LinkedList();
        l.addFirst("AKASH");
        l.add("PYTHON");
        l.add("ADV JAVA");
        l.add("JAVA");
        l.add("C++");
        l.addLast("CPP");
        System.out.println("l :"+l);

        ListIterator lt=l.listIterator();                           // ###########    ListIterator    ###########

        while (lt.hasNext())                                        // $$ 1. lt.hasNext();
        {
            String s=(String) lt.next();                            // $$ 2. lt.next();
            if(s.equals("JAVA")){                                   // $$ s.equels(Str);
                lt.set("XXX");                                      // $$ 3. lt.set(Str);
                System.out.println("set XXX :"+l);
            }
            else if(s.equals("PYTHON")) {
                lt.add("ZZZ");                                      // $$ 4. lt.add(str);
                System.out.println("add ZZZ :"+l);
            }
            else if(s.equals("C++")){
                lt.remove();                                        // $$ 5. lt.remove();
                System.out.println("remove C++ :"+l);
            }
        }
        System.out.println("l :"+l);
    }
}
 */