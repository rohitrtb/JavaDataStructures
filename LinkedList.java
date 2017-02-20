/**
 * Created by Rohit on 2/19/2017.
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int count;

    /** Linked list constructor. */
    LinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adding a name to the linked list
     * @param name
     */
    public void add(String name) {
        /* create a new node */
        Node node = new Node (name);
        node.setNextNode(head);
        head = node;
        if (count == 0) {
            tail = node;
        }
        incrementCount();
    }

    /**
     *
     * @param name
     */
    public void addAtTail(String name) {
        Node node = new Node(name);
        node.setNextNode(tail);
        tail = node;
        if (count == 0) {
            head = node;
        }
        incrementCount();
    }

    /**
     * Printing the entire linked list by iterating over all the elements
     */
    public void print() {
        for (Node node = head; node != null; node = node.getNextNode()) {
            System.out.print(node.getName() + " ");
        }
    }

    /**
     *
     */
    private void incrementCount() {
        count++;
    }

    /**
     *
     * @return Node:
     */
    public Node getFirstNode() {
        return head;
    }

    /**
     *
     * @return Node:
     */
    public Node getLastNode() {
        return tail;
    }

    /**
     *
     */
    public void remove() {
        head = head.getNextNode();
    }

    /**
     *
     */
    public void removeFromTail() {
        Node prevNode = null ;
        Node currNode ;
        for (currNode = head; currNode != tail;) {
            prevNode = currNode;
            currNode = currNode.getNextNode();
        }
        tail = prevNode;
    }
    // custom commit
}
