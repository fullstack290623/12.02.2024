package com.company;

import com.company.mynodes.MyNodeInt;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        MyNodeInt root_short = new MyNodeInt(1, new MyNodeInt(2, new MyNodeInt(3, new MyNodeInt(4, null))));
        //MyNodeInt root_short = new MyNodeInt(1, new MyNodeInt(2, null));
        //root_short.

        MyNodeInt node = root_short;
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }

        MyNodeInt root = new MyNodeInt(1, null);
        MyNodeInt node2 = new MyNodeInt(2, null);
        MyNodeInt node3 = new MyNodeInt(3, null);
        MyNodeInt node4 = new MyNodeInt(4, null);

        MyNodeInt node2_5 = new MyNodeInt(22, null);

        root.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null); // can skip this line

        node2.setNext(node2_5);
        node2_5.setNext(node3);

        node3.setNext(null);

        node4.setNext(root_short);
    }
    /*
        reverse the list and returns the new root
     */
    static MyNodeInt reverseList(MyNodeInt root) {
        return null;
    }
}
