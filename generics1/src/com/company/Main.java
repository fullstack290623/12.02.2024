package com.company;

import com.company.mynodes.MyDictionary;
import com.company.mynodes.MyNode;
import com.company.mynodes.MyNodeInt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        MyNodeInt root_short = new MyNodeInt(1, new MyNodeInt(2, new MyNodeInt(3, new MyNodeInt(4, null))));

        MyNode<Integer> root_short_int = new MyNode(1, new MyNode(2,
                            new MyNode(3, new MyNode(4, null))));

        MyNode<Double> root_short_double = new MyNode(1.899, new MyNode(2.222,
                new MyNode(3.777, new MyNode(4.5559, null))));

        MyNode<String> root_short_string = new MyNode("1.899a", new MyNode("2.222b",
                new MyNode("3.777c", new MyNode("4.5559d", null))));

        printLineGen(root_short_string);

        //MyNodeInt root_short = new MyNodeInt(1, new MyNodeInt(2, null));
        //root_short.

        MyNodeInt node = root_short;

        MyNodeInt root = new MyNodeInt(1, null);
        MyNodeInt node2 = new MyNodeInt(2, null);
        MyNodeInt node3 = new MyNodeInt(3, null);
        MyNodeInt node4 = new MyNodeInt(4, null);

        MyNodeInt node2_5 = new MyNodeInt(22, null);

        root.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null); // can skip this line

//        node2.setNext(node2_5);
//        node2_5.setNext(node3);
//
//        node3.setNext(null);
//
//        node4.setNext(root_short);

        printLine(root);
        System.out.println("========== reverse ===============");
        printLine(reverseList(root));

        List<Integer> numbers = new ArrayList<>();

        MyDictionary<Integer, String> code = new MyDictionary<>(555, "Baloon!");
        System.out.println(code.getValue(554));
        System.out.println(code.getValue(557));
        System.out.println(code.getValue(555));

        MyDictionary<String, Integer> code2 = new MyDictionary<>("xyz", 1000000);
        System.out.println(code2.getValue("xzz"));
        System.out.println(String.format("$%,d", code2.getValue("xyz")));
    }

    static void printLineGen(MyNode<?> root) {
        while (root != null) {
            System.out.println(root);
            root = root.getNext();
        }
    }

    static void printLine(MyNodeInt root) {
        while (root != null) {
            System.out.println(root);
            root = root.getNext();
        }
    }

    /*
        reverse the list and returns the new root
     */
    static MyNodeInt reverseList(MyNodeInt root) {
        MyNodeInt prev = null;
        MyNodeInt node = root;
        while (node != null) {
            MyNodeInt next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }
        return prev;
    }
}
