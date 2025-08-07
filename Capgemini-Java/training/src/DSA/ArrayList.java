
  package DSA;

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    // 1. Insert at Beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at End
    void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 3. Insert at Position (0-based index)
    void insertAtPosition(int value, int position) {
        if (position == 0) {
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // 4. Delete from Beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // 5. Delete from End
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // 6. Delete from Position (0-based index)
    void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 0) {
            deleteFromBeginning();
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        current.next = current.next.next;
    }

    // 7. Search for a value
    boolean search(int key) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == key) {
                System.out.println(key + " found at index " + index);
                return true;
            }
            current = current.next;
            index++;
        }
        System.out.println(key + " not found in the list");
        return false;
    }

    // 8. Traverse the list
    void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyLinkedList list = new MyLinkedList();

	        // Insertions
	        list.insertAtBeginning(30);
	        list.insertAtEnd(50);
	        list.insertAtPosition(40, 1); // 30 -> 40 -> 50

	        System.out.println("After insertions:");
	        list.traverse();

	        // Search
	        list.search(40); // should find
	        list.search(100); // should not find

	        // Deletions
	        list.deleteFromBeginning(); // remove 30
	        list.deleteFromEnd();       // remove 50
	        list.deleteFromPosition(0); // remove 40

	        System.out.println("After deletions:");
	        list.traverse();
	}

}
