/*
This programs represents  Binary Search tree,
Data can be inserted in the binary tree
and represents traversal through the tree 
using preorder, postorder and inorder. 

Program by Banga Dennis Muiruri
p15/1475/2012
*/


// Represents the Binary Search Tree.
public class BinarySearchTree {
 
  //Refrence for the root of the tree.
  public Node root;

  public BinarySearchTree insert(int value) {

    Node node = new Node<>(value);

 
    if (root == null) {

      root = node;
      return this;

    }

 

    insertRec(root, node);
    return this;
  }


 //Method to insert recursively 
  private void insertRec(Node latestRoot, Node node) {

 

    if (latestRoot.value > node.value) {

 

      if (latestRoot.left == null) {

        latestRoot.left = node;

        return;

      } else {

        insertRec(latestRoot.left, node);

      }

    } else {

      if (latestRoot.right == null) {
        latestRoot.right = node;

        return;
      } else {
        insertRec(latestRoot.right, node);

      }
    }

  }

 //Printing the contents of the binary search tree in an inorder way.
 
  public void printInorder() {
    printInOrderRec(root);
    System.out.println("");
  }
 

  //Method to recursively print the contents in an inorder way

  private void printInOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }

    printInOrderRec(currRoot.left);
    System.out.print(currRoot.value + " ,");
    printInOrderRec(currRoot.right);
  }


 // Printing the contents of the tree in a Preorder way.

  public void printPreorder() {
    printPreOrderRec(root);
    System.out.println("");

  }

  //Method to recursively print the contents in a Preorder way
  private void printPreOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;

    }
    System.out.print(currRoot.value + ", ");
    printPreOrderRec(currRoot.left);
    printPreOrderRec(currRoot.right);
  }

  
 //Printing the contents of the tree in a Postorder way.

  public void printPostorder() {

    printPostOrderRec(root);

    System.out.println("");

  }

  // Method to recursively print the contents in a Postorder way

  private void printPostOrderRec(Node currRoot) {
    if (currRoot == null) {

      return;
    }

    printPostOrderRec(currRoot.left);

    printPostOrderRec(currRoot.right);

    System.out.print(currRoot.value + ", ");

  }

}

