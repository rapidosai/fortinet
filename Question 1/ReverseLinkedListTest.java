package fortinet;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseLinkedListTest {

	@Test
	public void reverseTest() {
		ReverseLinkedList r = new ReverseLinkedList();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node (3);
		Node  output = r.reverse(head);
		
		Node res = new Node(3);
		res.next = new Node(2);
		res.next.next = new Node(1);
		assertTrue(compareNodes(res, output ));
		
		Node head2 = null ;
		Node output3 = null; Node output2 = r.reverse(head2);
		assertTrue(compareNodes(output3, output2 ));

	}

	@Test
	public void reverseTestSingleElement() {
		ReverseLinkedList r = new ReverseLinkedList();
		Node head = new Node(1);
		Node  output = r.reverse(head);
		
		Node res = new Node(1);
		assertTrue(compareNodes(res, output ));
		
	}

	
	@Test
	public void reverseTestNull() {
		ReverseLinkedList r = new ReverseLinkedList();
		
		Node head2 = null ;
		Node output3 = null; Node output2 = r.reverse(head2);
		assertTrue(compareNodes(output3, output2 ));

	}


	private boolean compareNodes(Node head, Node output) {
		// TODO Auto-generated method stub
		while(head!=null && output !=null) {
			if(head.value != output.value) return false;
			head = head.next;
			output = output.next;
		}
		return (head ==null && output ==null);
		
	}

}
