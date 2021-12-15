class Tree<T> {
	static class Node {
		Node<T> left;
		Node<T> right;
		T data;

		Node(T data) {
			this.data = data;
		}
	}

	Node<T> createNewNode(T data) {
		return new Node<>(data);
	}


	Node<T> addToLeft(Node<T> root, T data) {
		if (isNull(root)) throw new IllegalArgumentException("Cannot add to an empty node");
		root.left = new Node<>(data);
		return root.left;
	}

	Node<T> addToRight(Node<T> root, T data) {
		if (isNull(root)) throw new IllegalArgumentException("Cannot add to an empty node");
		root.right = new Node<>(data);
		return root.right
	}

	private boolean isNull(Object obj){
		obj == null;
	}
}