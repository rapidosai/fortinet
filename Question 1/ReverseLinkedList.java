package fortinet;

public class ReverseLinkedList {

	
		// Your resolution 
		// Time complexity: O(n) 
		// Space complexity: O(1)
		public static Node reverse(Node head){
		        if (head==null)
		            return null;
		        Node prev = null;
		        Node next = null;
		        while (head!=null) {
		            next = head.next;
		            head.next = prev;
		            prev = head;
		            head = next;
		        }
		        return prev;
		}
		
		public static void main(String[] args) {
		}

}
