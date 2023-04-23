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

    public T deleteLast(){
        T value = null;
        if(calculateSize() > 0){
            if (head.next == null) {
                value = head.data;
                head = null;
            } else {
                Node temp = head.next;
                value = head.data;
                head = head.next;
            }
            System.out.println("Removed last element is: "+value);
        }else{
            System.out.println("linked list is empty. cannot remove element");
        }

        return value;
    }
    public int searchElement(T searchData){
        Node<T> temp = head;
        Integer value;
        while(temp.next != null) {
            if((temp.data).equals(searchData)){
                value = (int)temp.data;
                return value;
            }else {
                temp = temp.next;
            }
        }
        return -1;
    }
    public void insertAfterValue(T findData, T insertData) {
        Node<T> temp = head;
        while(temp != null){
            if(temp.data == findData)
            {
                Node<T> newNode = new Node<>(insertData);
                Node<T> current = temp.next;
                newNode.next = current;
                temp.next = newNode;
            }
            temp = temp.next;
        }
    }
    public T searchDelete(T searchData){
        Node<T> temp = head;
        Node prev = null;
        Node curr = null;
        T value = null;
        while(temp.next != null) {
            if(temp.data == searchData){
                curr = temp.next;
                prev.next = curr;
                value = temp.data;
                temp.next = null;
            }else {
                prev = temp;
                temp = temp.next;
            }
        }
        return value;
    }
}
