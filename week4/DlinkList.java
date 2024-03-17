/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author sozcu
 */
public class DlinkList<T> {

    Node<T> head;
    int size = 0;

    void addFirst(T data) {
        Node<T> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;

        } else {
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    void addLast(T data) {
        Node<T> newnode = new Node<>(data);
        Node<T> temp = head;
        if (head == null) {
            head = newnode;

        } else {
            while (temp.next != null) {
                temp = temp.next;
                temp.next = newnode;
                newnode.prev = temp;

            }
            size++;
        }
    }

    void insertAfter(T data, T search) {
        Node<T> temp = head;
        Node<T> newnode = new Node<>(data);

        while (temp != null && !temp.data.equals(search)) {
            temp = temp.next;

        }
        if (temp != null) {
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next.prev = newnode;
            temp.next = newnode;

            size++;
        } else {
            System.out.println("Data not found: ");
        }

    }

    public boolean remove(T data) {

        if (head == null) {
            System.out.println("Empty list:");
        } else {
            if (head.data.equals(data)) {
                head = head.next;
                head.prev = null;
                size--;
                return true;
            } else {
                Node<T> temp = head.next;
                while (temp != null && !temp.data.equals(data)) {
                    temp = temp.next;

                }
                if (temp != null) {
                    temp.prev.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public void print(T data) {
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.data+ "->");
            temp=temp.next; //OLMAZSA HEP ILK ELEMANI BASAR
            
        }
        System.out.println("null");

    }
}
