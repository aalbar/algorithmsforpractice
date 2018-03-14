package tree;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private int id;
    private List<Node> subNodes = new ArrayList<Node>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Node> getSubNodes() {
        return subNodes;
    }

    public void setSubNodes(List<Node> subNodes) {
        this.subNodes = subNodes;
    }
}
