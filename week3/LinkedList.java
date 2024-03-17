/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author sozcu
 */
public class LinkedList<T> {

    private Node<T> head;

    public void addFirst(T data) {

        Node<T> newnode = new Node<T>(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;

        }

    }

    public void addLast(T data) {
        Node<T> newnode = new Node<T>(data);
        if (head == null) {
            head = newnode;

        } else {
            Node<T> temp = head;
            while (temp.next != null) { // Iterate pointer until the next element is not equal to null
                temp = temp.next;
            }
            temp.next = newnode;

        }
    }
 void insertAfter(T data, T search) {
        Node<T> temp = head; // Assign head pointer to temp node

        // Iterate each node until the next of this node is not equal to null and data is not equal to searched data
        while (temp != null && !temp.data.equals(search)) {
            temp = temp.next;
        }

        if (temp != null) {
            Node<T> newNode = new Node<>(data); // Create new node with data
            newNode.next = temp.next; // Point next of the newNode to next of the search node
            temp.next = newNode; // Point next of the search to newNode
        } else {
            addLast(data); // If we did not find the search data, insert given data to end of the linked list
        }
    }
   

    boolean remove(T data) {
        if (head == null) {
            System.out.println("empty list !");
        } else {
            if (head.data.equals(data)) { // If removed item is equal to head Change head with next of the head
                head = head.next;
                return true;
            } else {
                Node<T> temp = head.next; // Store next point
                Node<T> prev = head; // Store current point

                //Find the node with its value equal to data
                while (temp != null && !temp.data.equals(data)) {
                     prev = temp; // Point to the current node
                    temp = temp.next;// Point to the next node

                    // In each step we need to keep pred
                }

                if (temp != null) { // If temp is not equal to zero, we found searched node
                    prev.next = temp.next; // Point next of the prev to next of the temp
                    return true;
                } else {
                    System.out.println(data + " not found !");
                }
            }
        }
        return false;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    
    
    int  size(){
        Node <T> temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

}
