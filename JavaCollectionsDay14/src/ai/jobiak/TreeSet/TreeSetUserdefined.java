package ai.jobiak.TreeSet;

import java.util.TreeSet;
import java.util.*;

public class TreeSetUserdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet tree=new TreeSet();
		tree.add(10);
		tree.add(20);
		tree.add(30);
		tree.add(40);
		tree.add(50);
		System.out.println(tree);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(15);
		myList.add(25);
		myList.add(35);
		tree.addAll(myList);
		Iterator iter=tree.iterator();
		while(iter.hasNext()) {
				System.out.print(iter.next());
		        
		}
		System.out.println(tree.size());
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.size());
		System.out.println(tree.contains(30));
		System.out.println(tree.ceiling(35));
		System.out.println(tree.floor(35));
		tree.clear();
		System.out.println(tree);
	}

}
