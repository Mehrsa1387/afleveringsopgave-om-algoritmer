package org.example;

public class BinaryTree {
    public Node Root;

    public BinaryTree(){
        Root = null;
    }

    public void AddValue(int value, String action)
    {
        if (Root == null)
        {
            Root = new Node(value, action);
        }
        else
        {
            Root.AddChildNode(value, action);
        }
    }
}
