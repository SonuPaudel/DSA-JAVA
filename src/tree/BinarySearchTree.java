/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author sonu
 */
public class BinarySearchTree {
    TreeNode root;

    public boolean searchBST(int data) {
        TreeNode t=root;
        if (t!= null) {
            while(t!=null){
            if (data == t.data) {
                System.out.println(data + "is found");
                return true;
            } else if (data < t.data) {
                t=t.left;
            } else if (data > t.data) {
                t=t.right;
            }
            }
        } else {
            System.out.println("Tree is empty");
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(10);
        tree.root.right = new TreeNode(40);
        tree.root.left.left = new TreeNode(5);
        tree.root.left.right = new TreeNode(8);
        System.out.println("Is 10 in the tree?" + tree.searchBST(10));
        System.out.println("Is 60 in the tree?" + tree.searchBST(60));
        System.out.println("Is 5 in the tree?" + tree.searchBST(5));
    }
}
