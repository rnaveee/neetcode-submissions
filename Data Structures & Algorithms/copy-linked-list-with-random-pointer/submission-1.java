/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node curr = head;
        HashMap<Node, Node> map = new HashMap<>();

        while(curr != null){
            Node copy = getOrCreateCopy(curr, map);
            copy.next = getOrCreateCopy(curr.next, map);
            copy.random = getOrCreateCopy(curr.random, map);
            curr = curr.next;
        }

        return map.get(head);
        
    }

    public Node getOrCreateCopy(Node copyNode, HashMap<Node, Node> map){
        if(copyNode == null) return null;

        if(map.containsKey(copyNode)){
            return map.get(copyNode);
        }

        Node newNode = new Node(copyNode.val);
        map.put(copyNode, newNode);
        return newNode;
    }
}
