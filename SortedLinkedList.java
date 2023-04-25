package com.bridgelabz.linkedlist;
public class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;
    public void pushAndSort(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }

        //sorting start here
        Node<T> current = head, index;
        T temp;
        if(head != null){
            while(current != null){
                index = current.next;
                while (index != null) {
                    if ((current.data.compareTo(index.data)) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void display() {
        if(calculateSize() > 0) {
            System.out.print("Elements are: ");
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked list is empty. Cannot Display");
        }
    }

    public int calculateSize(){
        Node temp = head;
        Integer elementCount = 0;
        if (head == tail && head != null && tail != null){
            elementCount = 1;
        }else {
            while (temp != null) {
                elementCount = elementCount + 1;
                temp = temp.next;
            }
        }
        return elementCount;
    }
}
