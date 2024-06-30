
//www.geeksforgeeks.org/problems/identical-linked-lists/1

// Simply traverse on both list and check that values are equal or not.
// ❌ TC: O(n), SC: O(1) ❌

import org.w3c.dom.Node;

public class Identical_Linked_Lists {

    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean areIdentical(Node head1, Node head2) {
        // initialise two pinters pointing to  head1 and head2;
        Node temp1 = head1;
        Node temp2 = head2;
        
        // keep traversing till size of list is equal.
        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data){// if value is not equal, then just return false;
                return false;
            }
            
            // keep shifting temp pointers
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // if any pointer is not equal to null, that means size is different or any one of them is null., so return false;
        
        if(temp1 != null  || temp2 != null){
            return false;
        }
        
        return true;
    }
}
