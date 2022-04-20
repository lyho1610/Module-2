package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printList();
        System.out.println();
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
