package by.runets.binarytree.service;

import by.runets.binarytree.domain.Node;

public interface Tree <T extends Node, V> {
	T add(T root, V value);
	T delete(T root, V value);
	T read(T root, V value);
}