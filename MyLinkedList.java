package com.bridgelabz.linkedlist;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
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
    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    void valuesOfPointers(){
        if(calculateSize() > 0) {
            System.out.println("head-->" + head.data + " & " + "tail-->" + tail.data);
        }else{
            System.out.println("Linked list is empty. Cannot display head & tail");
        }
    }

    public T deleteFirst(){
        T value = null;
        Node<T> temp = head;
        if(calculateSize() > 0) {
            if (head == tail && head != null) {
                value = head.data;
                head = null;
                tail = null;
                System.out.println("Removed element is: "+value);
            } else {
                while (temp.next != tail && head != null) {
                    temp = temp.next;
                }
                value = tail.data;
                tail = temp;
                tail.next = null;
                System.out.println("Removed element is: "+value);
            }
        }
        else{
            System.out.println("linked list is empty. Cannot remove elements");
        }
        return value;
    }

}
