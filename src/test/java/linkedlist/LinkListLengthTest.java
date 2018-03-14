package linkedlist;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkListLengthTest {

	@Test
	public void should_count_empty_linked_list() {

		LinkList root = null;
		int length = LinkListLength.length(root);

		assertThat(0).isEqualTo(length);
	}

	@Test
	public void should_count_with_one_linked_list() {

		LinkList root = new LinkList("root");
		int length = LinkListLength.length(root);

		assertThat(1).isEqualTo(length);
	}

	@Test
	public void should_count_with_5_linked_list() {

		LinkList root = new LinkList("root");
		LinkList second = new LinkList("second", root);
		root.next=second;
		LinkList third = new LinkList("third", second);
		second.next=third;
		LinkList fourth = new LinkList("fourth", third);
		third.next=fourth;
		LinkList fifth =new LinkList("fifth", fourth);
		fourth.next=fifth;
		int length = LinkListLength.length(root);

		assertThat(5).isEqualTo(length);
	}

}
