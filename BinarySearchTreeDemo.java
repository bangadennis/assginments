import java.util.Scanner;

public class BinarySearchTreeDemo {
 

  public static void main(String[] args) {

    BinarySearchTree bst = new BinarySearchTree();

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
        bst.insert(value);
        count=count+1;


    }


    System.out.println("Inorder traversal");

    bst.printInorder();

 
    System.out.println("Preorder Traversal");

    bst.printPreorder();

    System.out.println("Postorder Traversal");

    bst.printPostorder();

    System.out.println("The minimum value in the BST: " + bst.findMinimum());

    System.out.println("The maximum value in the BST: " + bst.findMaximum());
 
  }
}
