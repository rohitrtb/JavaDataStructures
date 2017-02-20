/**
 * Created by Rohit on 2/19/2017.
 */
public class Node {
    private String name;
    private Node nextNode;

    Node(String Name) {
        name = Name;
        nextNode = null;
    }

    Node (String Name, Node newNode) {
        name = Name;
        nextNode = newNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node newNode) {
        nextNode = newNode;
    }
}
