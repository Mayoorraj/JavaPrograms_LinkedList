package com.bridgelabz.assignment14.LinkedList;

class Node {
    public int data;
    public Node next;

    //Node Constructor for Creating New Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Data {
    //Insert Data in New Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
    }
}
public class LinkedList {

    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Welcome to LinkedList Data Structures Problems.");

        Data linkedList = new Data();
        //Insert 70, 50, 36 in Linked List Nodes
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
    }
}