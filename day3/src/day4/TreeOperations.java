package day4;

 class Node {
	int data;
	int count;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class TreeOperations {
	Node root;
	static int count;

	void createTree() {
		root = null;
	}

	void insert(Node r, Node n) {
		if (root == null)
			root = n;
		else {
			if (n.data < r.data) {
				if (r.left == null)
					r.left = n;
				else
					insert(r.left, n);

			} else {
				if (r.right == null)
					r.right = n;
				else
					insert(r.right, n);
			}
		}

	}

	void inorder(Node r) {
		if (r != null) {
			inorder(r.left);// L
			System.out.print(r.data + ",");// P
			inorder(r.right);// R
		}
	}

	void preorder(Node r) {
		if (r != null) {
			System.out.print(r.data + ",");// P
			inorder(r.left);// L
			inorder(r.right);// R
		}
	}
	
	void postorder(Node r) {
		if (r != null) {
			inorder(r.left);// L
			inorder(r.right);// R
			System.out.println(r.data + ",");// P
		}
	}
		void countNode(Node r) {
			if(r!=null) {
				countNode(r.left);
				TreeOperations.count++;
				countNode(r.right);
			}
		}

		void countLeafNode(Node r) {
			if(r!=null) {
				countLeafNode(r.left);
				if(r.left==null && r.right==null)
					TreeOperations.count++;
				countLeafNode(r.right);

		}
	}
	
		public static void main(String[] args) {
			TreeOperations obj=new TreeOperations();
			obj.createTree();
			Node n=new Node(50);
			obj.insert(obj.root, n);
			n=new Node(100);
			obj.insert(obj.root, n);
			n=new Node(30);
			obj.insert(obj.root, n);
			System.out.println("Inorder data");
			obj.inorder(obj.root);
			System.out.println("preorder data");
			obj.preorder(obj.root);
			System.out.println("postorder data");
			obj.postorder(obj.root);
			TreeOperations.count=0;
			System.out.println("total Nodes are");
			obj.countNode(obj.root);
			
			
		}

	}