/*
BinarySearchTreeDemo class 
demonstrates the 
InOder Traversal, Preorder traversal and PostOrder traversal
of the BinarySearchTree

Program by Banga Dennis Muiruri
p15/1475/2012
*/

import java.util.Scanner;

public class BinarySearchTreeDemo {
 

  public static void main(String[] args) {


    BinarySearchTree binarySearchTree = new BinarySearchTree();

    System.out.println("Enter a  value to the BST, input -1 to terminate\n");
    int count=1;
    int value=0;
    Scanner input = new Scanner( System.in );
    while (count>0)
    {
        System.out.print("Enter The Node Value>>\n" );
        value=input.nextInt();
        if(value==-1)
        {
            break;
        }
        binarySearchTree.insert(value);
        count=count+1;


    }


    System.out.println("Inorder traversal");

     binarySearchTree.printInorder();

    System.out.println("Preorder Traversal");

     binarySearchTree.printPreorder();

    System.out.println("Postorder Traversal");

     binarySearchTree.printPostorder();

  }
}
