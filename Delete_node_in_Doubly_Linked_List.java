import org.w3c.dom.Node;
// https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1

// ❌TC : O(n), SC: O(1). ❌
// Logic : Just go till the desired position and then modify it. and try to think about edge cases.

public class Delete_node_in_Doubly_Linked_List {
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }
    public Node deleteNode(Node head, int x) {
        
        // If head is null or head has single element
        if(head == null || head.next == null){
            return null;
        }
        
        // if we have to remove first element, then return head ka next
        
        if(x == 1 ){
            return head.next;
        }
        Node temp = head;
        
        Node prev2 = null;
        
        // traverse till your required node.
        int cnt = 1;
        while(cnt != x){
            prev2 = temp;
            temp = temp.next;
            cnt++;
        }
        
        // if no node is required to remove
        if(temp == null){
            return head;
        }
        
        
        // if last node is about to delete
        else if(temp.next == null){
            prev2.next = null;
            return head;
        }
        
        
        // you have to delete any n0de apart from first, second and last node
        else{
            prev2.next  = temp.next;
            temp.next.prev = prev2;
            
            return head;
        }
        
    
    }
}
