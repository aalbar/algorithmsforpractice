package linkedlist;

public class LinkListLength {

	public static int length(LinkList root) {

		int length = 0;
		while (root != null) {
			length++;
			root = root.next;
		}
		return length;
	}

}
