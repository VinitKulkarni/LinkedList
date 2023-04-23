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

        System.out.println("----------------------------------");

        MyLinkedList<Integer> linkedList2 = new MyLinkedList<>();
        linkedList2.push(70);
        linkedList2.push(30);
        linkedList2.push(56);
        linkedList2.display();
        linkedList2.valuesOfPointers();

        linkedList2.deleteLast();

        linkedList2.display();
        linkedList2.valuesOfPointers();

        Integer result = linkedList2.searchElement(30);
        if(result == -1){
            System.out.println("Not found");
        }else{
            System.out.println(result + " found");
            linkedList2.insertAfterValue(result,40);
        }
        linkedList2.display();

        System.out.println("----------------------------------");

        MyLinkedList<Integer> linkedList3 = new MyLinkedList<>();
        linkedList3.append(56);
        linkedList3.append(30);
        linkedList3.append(70);
        linkedList3.display();
        linkedList3.valuesOfPointers();

    }
}
