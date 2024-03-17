/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author sozcu
 */
public class Test {
    public static void main(String[] args) {
        
        LinkedList<Integer> liste = new LinkedList<>();

        System.out.println("size : " + liste.size());
        liste.print();

        liste.addLast(5);
        liste.addLast(4);
        liste.addFirst(8);

        liste.print();

        liste.insertAfter(3, 7);
        liste.insertAfter(2, 5);

        liste.print();
        System.out.println("size : " + liste.size());

        liste.remove(8);
        liste.remove(3);
        liste.print();
        System.out.println("size : " + liste.size());
    }
    
}
