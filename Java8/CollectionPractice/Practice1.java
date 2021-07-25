package Java8.CollectionPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // // collections
        // // ArrayList
        // int[] array = new int[5];// 1,2,3,4,5
        // // array[0]=3;
        // ArrayList al = new ArrayList();
        // al.add("krishna");
        // al.add(1);
        // al.add(1.3);
        // al.add("sample");
        // System.out.println(al);
        // System.out.println(al.get(1));
        // ArrayList rsk = new ArrayList();
        // rsk.add("sanath");
        // rsk.add(3);
        // rsk.add(4.5);
        // System.out.println(rsk);
        // al.add(rsk);
        // System.out.println(al);
        // al.addAll(rsk);
        // System.out.println(al);
        // System.out.println(al.indexOf("sample"));
        // al.removeAll(rsk);
        // System.out.println(al);
        // Object[] sample = al.toArray();
        // for (Object object : sample) {
        // System.out.println(object);
        // }
        // System.out.println(al);
        // LinkedList
        // LinkedList ll = new LinkedList();
        // ll.add("1");
        // ll.add(2);
        // ll.add("krishna");
        // System.out.println(ll.get(1));
        // arrayDeque
        // ArrayDeque ad = new ArrayDeque();
        // ad.add(1);
        // ad.add("krishna");
        // ad.add("asdasd");
        // System.out.println(ad);
        // ad.addFirst("first");
        // TreeSet<Integer> ts = new TreeSet<Integer>();
        // ts.add(100);
        // ts.add(50);
        // ts.add(150);
        // ts.add(25);
        // ts.add(75);
        // ts.add(125);
        // ts.add(175);
        // System.out.println(ts);
        // HashSet hs = new HashSet();
        // hs.add(100);
        // hs.add(50);
        // hs.add(150);
        // hs.add(25);
        // System.out.println(hs.contains(150));
        HashMap hm = new HashMap();
        hm.put(2, "krishna");
        hm.put(1, "krish");
        HashMap hm1 = new HashMap();
        hm1.put(1, "krishna");
        hm1.put(2, "krishna1");
        System.out.println(hm);
        System.out.println(hm.hashCode() == hm1.hashCode());
        TreeMap tm = new TreeMap();
        tm.put(2, "sanath");
        tm.put(1, "krishna");
        System.out.println(tm);

    }
}
