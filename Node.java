/**
 * Represents a node in the Binary Search Tree.

By Banga Dennis 
p15/1475/2012
 */

public class Node<T> {
  //value present in the node.
  public int value;

  //Reference to the left subtree.
  public Node left;

  //Reference to the right subtree.
  public Node right;
  public Node(int value) {

    this.value = value;
  }

}
