/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package week4;

/**
 *
 * @author sozcu
 */
public class ClinkList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addFirst(T data) {

        Node<T> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;

        } else {
            newnode.next = head;
            head = newnode;
        }
        tail.next = head;
        size++;
    }

    public void addLast(T data) {
        Node<T> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;

        } else {
            tail.next = newnode;
        }
        tail = newnode;
        tail.next = head;
        size++;

    }

    public void insertAfter(T data, T search) {
        Node<T> newnode = new Node<>(data);
        Node<T> temp = head;

        while (temp != null && temp.data.equals(search)) {
            temp = temp.next;
            if (head == temp) {
                break;
            }
        }
        if (temp != null && temp.data.equals(search)) {
            newnode.next = temp.next;
            temp.next = newnode;

            if (temp == tail) {
                tail = newnode;

            }

        }
    }
    
    void print(){
                Node<T> temp= head;
                for (int i = 0; i < size; i++) {
                    System.out.println(temp.data);
                    temp=temp.next;
                    
        }
                System.out.println("null");
                
                

    }
    
   public boolean remove(T data) {
    if (head == null) {
        System.out.println("Empty list");
    } else {
        if (head.equals(data) && size == 1) {
            head = null;
            tail = null;
            size--;
            return true;
        } else if (head.equals(data)) {
            head = head.next;
            tail.next = head;
            size--;
            return true;
        } else {
            Node<T> temp = head.next;
            Node<T> prev = head;

            while (temp != null && !temp.data.equals(data)) {
                prev = temp;
                temp = temp.next;
            }
            if (temp != null) {
                prev.next = temp.next;
            }
            if (temp == tail) {
                tail = prev;
            }
        }
        size--;
        return true;
    }
    return false;
}
 
}
