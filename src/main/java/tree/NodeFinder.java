package tree;

public class NodeFinder {
    public static Node findById(Node root, int id) {

        if (root == null) {
            return null;
        }

        if (root.getId() == id) {
            return root;
        }

        Node result;
        for (Node node : root.getSubNodes()) {

            result = findById(node, id);
            if (result != null) {
                return result;
            }
        }

        return null;
    }
}
