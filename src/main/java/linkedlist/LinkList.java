package linkedlist;

public class LinkList {

	String name; // a name in the list
	LinkList next; // the next node in the list
	LinkList prev; // the previous node in the list

	/**
	 * Constructor with just a name. This form would be most useful when
	 * starting a list.
	 */
	public LinkList(String name) {
	    this.name = name;
	    next = null;
	    prev = null;
	}

	/**
	 * Constructor with a name and a reference to the previous list node. This
	 * form would be most useful when adding to the end of a list.
	 */
	public LinkList(String name, LinkList node) {
	    this.name = name;
	    next = null;
	    prev = node;
	}

}
