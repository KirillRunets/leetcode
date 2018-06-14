package by.runets.binarytree.service.impl;

import by.runets.binarytree.domain.Node;
import by.runets.binarytree.service.Traverse;
import by.runets.binarytree.service.Tree;

import java.util.List;

public class BinaryTree implements Tree<Node<Integer>, Integer>, Traverse<Node<Integer>, Integer>{
	@Override
	public Node<Integer> add (Node<Integer> root, Integer value) {
		if (root == null) {
			return null;
		}
		
		if (value < root.getValue()) {
			Node left = add(root.getLeft(), value);
			root.setLeft(left);
		} else if (value > root.getValue()) {
			Node right = add(root.getRight(), value);
			root.setRight(right);
		} else {
			return root;
		}
		
		return root;
	}
	
	@Override
	public Node<Integer> delete (Node<Integer> root, Integer value) {
		if (root == null) {
			return null;
		}
		
		
		
		return null;
	}
	
	@Override
	public Node<Integer> read (Node<Integer> root, Integer value) {
		return null;
	}
	
	@Override
	public List<Integer> inOrder (Node<Integer> root) {
		return null;
	}
	
	@Override
	public List<Integer> preOrder (Node<Integer> root) {
		return null;
	}
	
	@Override
	public List<Integer> postOrder (Node<Integer> root) {
		return null;
	}
}
