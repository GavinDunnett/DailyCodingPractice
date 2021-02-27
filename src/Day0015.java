import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates a generic queue data structure.
 * 
 * @author Gavin Dunnett
 * @version 1.0
 */

public class Day0015 {

	public static void main(String[] args) {
		Queue<StringNode> queue = new Queue<>();
	}

	// queue generic data structure inner-class
	private static class Queue<T> {
		private int front = 0;
		private int numOfNodes = 0;
		T node;
		List<T> queue = new ArrayList<>();

		public Queue() {
			this.node = node;
		}

		public void enqueue(T newNode) {
			queue.add(newNode);
			numOfNodes++;
		}

		public T dequeue() {
			if (numOfNodes == 0)
				return null; // underflow
			numOfNodes--;
			return queue.get(front++);
		}
	}

	// node inner-class
	public static class StringNode {
		String field = "";

		public StringNode(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return field;
		}

		public StringNode deepCopy() {
			StringNode clone = new StringNode(field);
			return clone;
		}
	}
}
