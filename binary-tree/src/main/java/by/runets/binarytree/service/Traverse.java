package by.runets.binarytree.service;

import by.runets.binarytree.domain.Node;

import java.util.List;

public interface Traverse <T extends Node, V> {
	List<V> inOrder(T root);
	List<V> preOrder(T root);
	List<V> postOrder(T root);
}