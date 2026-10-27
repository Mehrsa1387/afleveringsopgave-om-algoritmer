package org.example;

public class Node {
    // each node contains a data value, in this instance it called nodeValue
    // each node contains a reference to other nodes via the left and right notation
    // notice a node have either 0, 1 or 2 'children', so either a Node consist of no references (both left and right contains null)
    // 1 reference = 1 child, which means one either left or right contains another node, while the other left or right conatins null.
    // Or 2 references, both left and right contains Nodes.
    public int nodeValue;
    public String action;
    public Node left;
    public Node right;

    public Node(int value, String doing) {
        nodeValue = value;
        action = doing;
        left = null;
        right = null;
    }

    // This method adds new nodes added to the tree using recursive function calls!
    public void AddChildNode(int newValue, String newAction)
    {
        if (newValue < nodeValue)
        {
            if (left == null)
            {
                left = new Node(newValue, newAction);
            }
            else
            {
                // AddChildNode is now a recursive method, which means the method calls itself inside the method!
                left.AddChildNode(newValue, newAction);
            }
        }
        else
        {
            if (right == null)
            {
                right = new Node(newValue, newAction);
            }
            else
            {
                right.AddChildNode(newValue, newAction);
            }
        }
    }
}
