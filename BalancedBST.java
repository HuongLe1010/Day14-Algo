
public class BalancedBST {
	public static void main(String[] args) {
		MyTree tree = new MyTree();
		
		tree.addNode(new Node(8));
		tree.addNode(new Node(4));
		tree.addNode(new Node(7));
		tree.addNode(new Node(2));
		tree.addNode(new Node(6));
		tree.addNode(new Node(5));
		tree.addNode(new Node(3));
		
		Node searchedNode = tree.getNode(11);
		if (searchedNode != null) {
			System.out.println("Node found with value: " + searchedNode.value);
		} else {
			System.out.println("Node not found");
		}
		
		Node deletedNode = tree.getNode(3);
		if (deletedNode != null) {
			tree.deleteNode(deletedNode);
			System.out.println("Node with value 3 deleted");
		} else {
			System.out.println("Node with value 3 not found");
		}
	}
}
