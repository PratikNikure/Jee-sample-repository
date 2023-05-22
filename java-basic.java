package collections;
import java.util.*;

public class Collection {
	
	public static void main(String[] args) {
//		ArrayList<String> s= new ArrayList<String>();
//		LinkedList<String> al=new LinkedList<String>();
		
//		HashSet<String> set=new HashSet<String>();  
//		set.add("Ravi");  
//		set.add("Vijay");  
//		set.add("Ravi");  
//		set.add("Ajay");  
//		//Traversing elements  
//		Iterator<String> itr=set.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
//		s.add("Pratik");
//		s.add("Nikure");
//		s.add("himal");
//		s.add("akash");
//		s.add("Rakul");
//		s.add("Niket");
//		s
//		HashSet<String> set = new HashSet<>();
//		
//		set.add("Pratik");
//		set.add("Akash");
//		set.add("nishant");
//		set.add("aniket");
//		
//		Iterator<String> itr = set.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		TreeSet<String> set=new TreeSet<String>();  
//        set.add("Ravi");  
//        set.add("Vijay");  
//        set.add("Ajay");  
//        System.out.println("Traversing element through Iterator in descending order");  
//        Iterator i=set.iterator();  
//        while(i.hasNext())  
//        {  
//            System.out.println(i.next());  
//        }  
		
//		System.out.println(s.get(0));
//		
//		System.out.println("prqtik");
		
//		Iterator<String> itr =s.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println("\n"+itr.next());
//		}
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(9);
		list.add(93);
		list.add(1);
		list.add(9);
		
		System.out.println(list.get(2));
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
		
	}
	
	
	
}
