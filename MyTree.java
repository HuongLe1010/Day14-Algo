
public class MyTree {
	Node root;
	
	public void addNode(Node node) {
		root = insert(root, node);
	}
	
	public void deleteNode(Node node) {
		root = delete(root, node);
	}
	
	public Node getNode(int value) {
		return search(root, value);
	}
	
	private Node insert(Node current, Node node) {
		if(current == null) {
			return node;
		}
		
		if (node.value < current.value) {
			current.left = insert(current.left, node);
		} else if (node.value > current.value) {
			current.right = insert(current.right, node);
		}
		return current;
	}
	
	private Node delete(Node current, Node node) {
		if (current == null) {
			return current;
		}
		
		if (node.value < current.value) {
			current.left = delete(current.left, node);
		} else if (node.value > current.value) {
			current.right = delete (current.right, node);
		} else {
			if (current.left == null) {
				return current.right;
			} else if (current.right == null) {
				return current.left;
			}
			
			current.value = minimumValue(current.right);
			current.right = delete(current.right, new Node(current.value));
		}
		
		return current;
	}
	
	private int minimumValue(Node node) {
		int minimumValue = node.value;
		while (node.left != null) {
			minimumValue = node.left.value;
			node = node.left;
		}
		return minimumValue;
	}
	
	private Node search(Node current, int value) {
		if (current == null || current.value == value) {
			return current;
		}
		
		if (value < current.value) {
			return search(current.left, value);
		}
		
		return search(current.right, value);
	}
}

