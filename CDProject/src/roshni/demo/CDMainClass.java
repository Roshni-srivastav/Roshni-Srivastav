package roshni.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import roshni.demo.CD;
import roshni.demo.SortAsPerTitle;
import roshni.demo.SortAsPerSinger;


public class CDMainClass {

	public static void main(String[] args, TreeSet CD) {
		Set<CD> collection=new TreeSet<CD>(new SortAsPerTitle());
		collection.add(new CD("Tarun","DTSP"));
		collection.add(new CD("bahubali","Std"));
		collection.add(new CD("ASVR","ihaman"));
		collection.add(new CD("24","AR rahman"));
		System.out.println(collection);
		Set<CD> collection2=new TreeSet<CD>(new SortAsPerSinger());
		collection2.add(new CD("kevvukeka","DSP"));
		collection2.add(new CD("bahubali","Erty"));
		collection2.add(new CD("ASVR","Thaman"));
		collection2.add(new CD("24","ART SonuNigam"));
		Iterator<CD> iterator=collection2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
