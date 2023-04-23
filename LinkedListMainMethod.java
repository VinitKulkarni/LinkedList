package com.bridgelabz.linkedlist;

public class LinkedListMainMethod {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList1 = new MyLinkedList<>();

        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();
        linkedList1.valuesOfPointers();
        linkedList1.deleteFirst();
        linkedList1.display();
        linkedList1.valuesOfPointers();

        MyLinkedList<Integer> linkedList2 = new MyLinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();
        linkedList2.valuesOfPointers();

    }
}
