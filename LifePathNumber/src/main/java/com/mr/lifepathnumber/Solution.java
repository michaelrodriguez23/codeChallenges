/*
Given a number, return a string with dash'-'marks before and after each odd 
integer, but do not begin or end the string with a dash mark.
https://www.codewars.com/kata/58223370aef9fc03fd000071/train/java
 */
package com.mr.lifepathnumber;

/**
 *
 * @author michaelrodriguez
 */
public class Solution {
    

    public static void main(String[] args) {
        String text = "MIGUEL";

        node head = null;
        head = stringToSLL(text, head);
        print(head);

    }

    public static String DashatizeIt(int num) {

        return null;
    }

    static class node {

        char data;
        node next;
    };// add new node to the linked

    static node add(char data) {
        node newNode = new node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }

    static node stringToSLL(String text, node head) {
        head = add(text.charAt(0)); // this is the 1st node char @ Index [0]
        node curr = head; // while converting to linked list the current node = head; Because of the initialization

        // We are then iterating through the rest of the text starting @ 1 bc the head has been instantiated
        // curr.next = new node with data, and null pointer;
        // iterate til last index
        for (int i = 1; i < text.length(); i++) {
            curr.next = add(text.charAt(i));
            curr = curr.next;

        }
        return head;
    }

    static void print(node head) {
        node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " -> ");
            curr = curr.next; //once printed curr is iterated to the next linear node// prints all of the nodes
        }

    }
}
