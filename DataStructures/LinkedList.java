package DataStructures;

/**
 * Created by Rohit on 2/19/2017.
 */
class Node <Item> {
    Item item;
    Node nextNode;

    Node (Item t) {
        item = t;
        nextNode = null;
    }

}

public class LinkedList <Item> {

    private Node head ;
    private Node tail;
    private int count;

    public LinkedList () {
        head = null;
        tail = null;
        count = 0;
    }

    public void addFront (Item t) {
        Node<Item> newNode = new Node<Item>(t);
        newNode.nextNode = head;
        head = newNode;
        if (count == 0) {
            //empty linkedlist
            tail = newNode;
        }
        count++;
    }

    public void addRear (Item t) {
        Node<Item> newNode = new Node<Item> (t);

        if (count == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    public Item getFrontElement() throws NullPointerException {
        if (head != null) {
            return (Item) head.item;
        } else {
            throw new NullPointerException("Head is a null reference");
        }
    }

    public Item getRearElement() throws NullPointerException {
        if (tail != null) {
            return (Item) tail.item;
        } else {
            throw new NullPointerException("Tail is a null reference");
        }
    }

    public void removeFrontElement () {
        if (head != null) {
            head = head.nextNode;
        }
    }

    public void removeRearElement () {
        Node<Item> currNode, rearNode;
        for (currNode = head, rearNode = null; currNode != null; rearNode = currNode, currNode = currNode.nextNode) {

        }
        try {
            rearNode.nextNode = null;
            tail = rearNode;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printList () {
        for (Node<Item> node = head; node != null; node = node.nextNode) {
            System.out.print(node.item + " ");
        }
    }


}
