package tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeFinderTest {

    @Test
    public void should_find_id_1_with_empty_tree() {


        assertThat(NodeFinder.findById(null, 1)).isNull();

    }


    @Test
    public void should_find_id_1_with_one_tree_having_id_1() {

        Node root = new Node();
        root.setId(1);
        Node result = NodeFinder.findById(root, 1);

        assertThat(result).isEqualTo(root);

    }


    @Test
    public void should_find_id_1_with_one_tree_having_id_5() {

        Node root = new Node();
        root.setId(5);
        Node result = NodeFinder.findById(root, 1);

        assertThat(result).isNotEqualTo(root);

    }


    @Test
    public void should_find_id_15_with_tree_having_one_node_with_id_15() {

        Node root = new Node();
        root.setId(1);
        Node node1 = new Node();
        node1.setId(2);
        Node node2 = new Node();
        node2.setId(5);


        root.getSubNodes().add(node1);
        root.getSubNodes().add(node2);

        Node node3 = new Node();
        node3.setId(12);
        Node node4 = new Node();
        node4.setId(13);

        node1.getSubNodes().add(node3);
        node1.getSubNodes().add(node4);

        Node node5 = new Node();
        node5.setId(8);

        node2.getSubNodes().add(node5);

        Node node6 = new Node();
        node5.setId(11);

        Node node7 = new Node();
        node5.setId(15);

        node5.getSubNodes().add(node6);
        node5.getSubNodes().add(node7);


        Node result = NodeFinder.findById(root, 15);

        assertThat(result).isEqualTo(node5);

    }


    @Test
    public void should_find_id_15_with_tree_not_having_id_15() {

        Node root = new Node();
        root.setId(1);
        Node node1 = new Node();
        node1.setId(2);
        Node node2 = new Node();
        node2.setId(5);

        root.getSubNodes().add(node1);
        root.getSubNodes().add(node2);

        Node node3 = new Node();
        node3.setId(12);
        Node node4 = new Node();
        node4.setId(18);

        node1.getSubNodes().add(node3);
        node1.getSubNodes().add(node4);

        Node node5 = new Node();
        node5.setId(8);

        node2.getSubNodes().add(node5);


        Node result = NodeFinder.findById(root, 15);

        assertThat(result).isNull();

    }
}
