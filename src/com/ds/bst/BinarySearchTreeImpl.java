package com.ds.bst;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeImpl {

	private BstNode root;

	public boolean isEmpty() {

		return (this.root == null);
	}

	public void insert(Integer data) {
		System.out.print("[input: " + data + "]");
		if (root == null) {
			this.root = new BstNode(data);
			System.out.println(" -> inserted: " + data);
			return;
		}
		insertNode(this.root, data);
		System.out.print(" -> inserted: " + data);
		System.out.println();
	}

	private BstNode insertNode(BstNode root, Integer data) {
		BstNode tmpNode = null;
		System.out.print(" ->" + root.getData());
		if (root.getData() >= data) {
			System.out.print(" [L]");
			if (root.getLeft() == null) {
				root.setLeft(new BstNode(data));
				return root.getLeft();
			} else {
				tmpNode = root.getLeft();
			}
		} else {
			System.out.print(" [R]");
			if (root.getRight() == null) {
				root.setRight(new BstNode(data));
				return root.getRight();
			} else {
				tmpNode = root.getRight();
			}
		}
		return insertNode(tmpNode, data);
	}

	public Integer findMinValue() {
		return minValue(this.root);
	}

	public Integer findMaxValue() {
		return maxValue(this.root);
	}

	private Integer minValue(BstNode node) {
		if (node.getLeft() != null) {
			return minValue(node.getLeft());
		}
		return node.getData();
	}

	private Integer maxValue(BstNode node) {
		if (node.getRight() != null) {
			return maxValue(node.getRight());
		}
		return node.getData();
	}
	
	public Integer findHeight(){
        return getNodeHeight(this.root);
    }
 
    private Integer getNodeHeight(BstNode node) {
        if(node == null) {
            return -1;
        }
        return Math.max(getNodeHeight(node.getLeft()), getNodeHeight(node.getRight()))+1;
    }
    
    public void levelOrderTraversal() {    	 
        Queue<BstNode> discovedNodeQueue = new LinkedList<>();
        if(this.root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        discovedNodeQueue.add(this.root);
        while (!discovedNodeQueue.isEmpty()) {
            BstNode tmpNode = discovedNodeQueue.remove();
            if(tmpNode.getLeft() != null) { 
            	discovedNodeQueue.add(tmpNode.getLeft()); 
            }
            if(tmpNode.getRight() != null) { 
            	discovedNodeQueue.add(tmpNode.getRight()); 
            }
            System.out.print(tmpNode.getData()+" ");
        }
    }
    
    public void preOrderTraversal() {
        doPreOrder(this.root);
    }
 
    private void doPreOrder(BstNode root) {
        if(root == null) return;
        System.out.print(root.getData()+" ");
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }
    
    public void inOrderTraversal() {
        doInOrder(this.root);
    }
 
    private void doInOrder(BstNode root) {
        if(root == null) return;
        doInOrder(root.getLeft());
        System.out.print(root.getData()+" ");
        doInOrder(root.getRight());
    }
    
    public void postOrderTraversal() {
        doPostOrder(this.root);
    }
 
    private void doPostOrder(BstNode root) {
        if(root == null) return;
        doPostOrder(root.getLeft());
        doPostOrder(root.getRight());
        System.out.print(root.getData()+" ");
    }
    
    public boolean isBinarySearchTree() {
        if(this.root == null) 
        	return Boolean.TRUE;
        return isBstValid(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
 
    private boolean isBstValid(BstNode root, Integer minValue, Integer maxValue) {
        if(root == null) 
        	return Boolean.TRUE;
        if(root.getData() >= minValue 
        		&& root.getData() < maxValue 
        		&& isBstValid(root.getLeft(), minValue, root.getData()) 
        		&& isBstValid(root.getRight(), root.getData(), maxValue)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
    
    public void delete(Integer data) {
    	 
        deleteNode(this.root, data);
    }
 
    private BstNode deleteNode(BstNode root, Integer data) {
 
        if(root == null) return root;
 
        if(data < root.getData()) {
            root.setLeft(deleteNode(root.getLeft(), data));
        } else if(data > root.getData()) {
            root.setRight(deleteNode(root.getRight(), data));
        } else {
            // node with no leaf nodes
            if(root.getLeft() == null && root.getRight() == null) {
                System.out.println("deleting "+data);
                return null;
            } else if(root.getLeft() == null) {
                // node with one node (no left node)
                System.out.println("deleting "+data);
                return root.getRight();
            } else if(root.getRight() == null) {
                // node with one node (no right node)
                System.out.println("deleting "+data);
                return root.getLeft();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                Integer minValue = minValue(root.getRight());
                root.setData(minValue);
                root.setRight(deleteNode(root.getRight(), minValue));
                System.out.println("deleting "+data);
            }
        }
        return root;
    }

	public static void main(String a[]) {
		BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
		bst.insert(10);
		bst.insert(20);
		bst.insert(21);
		bst.insert(8);
		bst.insert(6);
		bst.insert(16);
		bst.insert(23);
		System.out.println("-------------------");
		System.out.println("Min value: " + bst.findMinValue());
		System.out.println("Max value: " + bst.findMaxValue());
		System.out.println("-------------------");
        System.out.println("Height of the tree: "+bst.findHeight());
        System.out.println("-------------------");
        System.out.println("Level order traversal");
        bst.levelOrderTraversal();
        System.out.println("\n-------------------");
        System.out.println("Pre Order Traversal");
        bst.preOrderTraversal();
        System.out.println("\n-------------------");
        System.out.println("In Order Traversal");
        bst.inOrderTraversal();
        System.out.println("\n-------------------");
        System.out.println("Post Order Traversal");
        bst.postOrderTraversal();
        System.out.println("\n-------------------");
        System.out.println("Chack Is Binary Tree Or not.");
        System.out.println(bst.isBinarySearchTree());
        System.out.println("------- DELETE --------");
        bst.delete(21);
        bst.inOrderTraversal();
	}
}