package finserv.dayfour.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapAndSet {
   public static void main(String []args){
        myHashMap();
        myTreeMap();
   }

   public static void myHashMap(){
	    System.out.println("HashMap");
        Map<Integer,String> map = new HashMap<Integer,String>();
        //Map<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(101,"pune");
        map.put(102,"chennai");
        map.put(103,"hyderabad");
        map.put(102, "Goaq");
        System.out.println(map);
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
   }
   public static void myTreeMap(){
	    System.out.println("TreeMap");
        Map<Integer,String> map = new TreeMap<Integer,String>();

        map.put(101,"Pune");
        map.put(102,"Chennai");
        map.put(103,"Hyderabad");
        map.put(102,"Jabalpur");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
   }
   public static void MyLinkedMap() {
	   System.out.println("LinkedHashMap");
       Map<Integer,String> map = new LinkedHashMap<Integer,String>();

       map.put(101,"pune");
       map.put(102,"chennai");
       map.put(103,"hyderabad");
       map.put(102, "Goaq");
       System.out.println(map);
       Set set = map.entrySet();
       Iterator itr = set.iterator();
       while(itr.hasNext()){
           Map.Entry entry = (Map.Entry)itr.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
       for(Map.Entry m: map.entrySet()){
           System.out.println(m.getKey()+" "+m.getValue());
       }
   }
   public static void myKeyMap(){
       Map<Integer,String> map = new TreeMap<Integer,String>();

       map.put(101,"Pune");
       map.put(102,"Chennai");
       map.put(103,"Hyderabad");
       map.put(102,"Jabalpur");
       Set<Integer> set = map.keySet();
       for(Integer key : set){
           System.out.println(key+" "+map.get(key));
       }
  }
}