package Queue;

public class Node {
		Node next;
		Object data;

		public Node() {
			next = null;
			data = null;
		}

		public Node(Object data) {
			next = null;
			this.data = data;
		}

		public Node(Object data, Node node) {
			this.data = data;
			this.next = node;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}
	}


