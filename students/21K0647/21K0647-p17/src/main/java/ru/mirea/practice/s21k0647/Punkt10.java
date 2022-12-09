package ru.mirea.practice.s21k0647;

public class Punkt10 {
    public Node head = null;
    public Node tail = null;

    class Node {
        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addobject(String data) {
        Node newNode = new Node(data);


        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortList() {
        Node current = head;
        Node index = null;
        String temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data.charAt(0) < index.data.charAt(0)) {
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

    public void output() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println('\n');
    }

    public static void main(String[] args) {

        Punkt10 sList = new Punkt10();

        sList.addobject("With");
        sList.addobject("the");
        sList.addobject("lights");
        sList.addobject("out");
        sList.addobject("it's");
        sList.addobject("less");
        sList.addobject("dangerous");

        System.out.println("initial list: ");
        sList.output();
        sList.sortList();

        System.out.println("Sorted list: ");
        sList.output();
    }
}
