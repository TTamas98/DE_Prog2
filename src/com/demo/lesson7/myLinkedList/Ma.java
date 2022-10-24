package com.demo.lesson7.myLinkedList;

public class Ma {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>("asd");
        MyLinkedList<String> myLinkedList1 = new MyLinkedList<>("assd");
        myLinkedList.setKövetkezö(myLinkedList1);
        myLinkedList1.setElözö(myLinkedList);
    }
}
