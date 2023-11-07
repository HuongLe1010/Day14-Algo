
public class MyLinkedList {
	Node head;
	Node tail;
	int size = 0;
	
	public static void main(String[] args) {
		MyLinkedList linkedlist = new MyLinkedList();
		
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		
		linkedlist.printList();
	}
	
	class Node {
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value = value;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}
	
	public void printList() {
		Node current = head;
		while (current!= null) {
			System.out.print(current.value + " => ");
			current = current.next;
		}
		System.out.println("null");
	}
}
