package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Used following source to code this operation for populating a binary search tree:
        // https://tutorials.eu/binary-trees-in-c-sharp/

        boolean isUserDoneInsertingNodes = false;
        BinaryTree tree = new BinaryTree();
        List<Integer> nodeValues = new ArrayList<Integer>();
        List<String> actions = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        // Gives the user the option to insert numbers into the tree, that will sort these numbers based on the structure of the tree.
        while (!isUserDoneInsertingNodes)
        {
            System.out.println("Enter a number value to insert into a new node in the binary search tree: ");
            String userInput = reader.next();

            int numInput = 0;

            try
            {
                // for each acceptable input, we add a new node to the tree
                numInput = Integer.parseInt(userInput);
                nodeValues.add(numInput);
                System.out.println("Enter an action to help with this: ");
                String action = reader.next();
                actions.add(action);
            }
            catch (NumberFormatException e)
            {
                isUserDoneInsertingNodes = true;
            }

        }

        for (int i = 0; i < nodeValues.size(); i++)
        {
            tree.AddValue(nodeValues.get(i), actions.get(i));
        }
        System.out.println("Tree populated successfully, will now search for element 85..");

        // search through tree to find the highest score (som er 85 her) using pre-order traversal
        final int SEARCHNUM = 85;
        preOrderSearch(tree.Root, SEARCHNUM);
    }

    private static boolean preOrderSearch(Node node, int number)
    {
        if (node == null)
        {
            return false;
        }

        // besøg current node
        System.out.println("Visiting node: " + node.nodeValue
                + ", action: " + node.action);

        if (node.nodeValue == number)
        {
            System.out.println("You found the number you were searching for: "
                    + node.nodeValue + ", which represents the action: "
                    + node.action);
            return true;
        }

        // besøg left subtree
        if (preOrderSearch(node.left, number))
        {
            return true;
        }

        // besøg right subtree
        return preOrderSearch(node.right, number);
    }
}