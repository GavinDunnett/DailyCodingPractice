import java.util.Objects;

/**
 * This program demonstrates a stack data structure.
 *
 * @author Gavin Dunnett
 * @version 1.0
 */
public class Day0013 {

	public static void main(String[] args) {
		Stack FIFO = new Stack(10);

		Node gavin = new Node("Gavin", "3086079");
		Node david = new Node("David", "7349740");

		FIFO.push(gavin);
		FIFO.push(david);
		FIFO.showAll();

		Node pop1 = FIFO.pop();
		System.out.println(pop1.toString());

		Node pop2 = FIFO.pop();
		System.out.println(pop2.toString());

		FIFO.pop();


	}

	// Stack data structure inner-class
	private static class Stack {
		private Node[] data;
		private int top;
		private int size;

		public Stack(int size) {
			data = new Node[size];
			top = -1;
			this.size = size;
		}

		public boolean push(Node newNode){
			if(top <= size-1) {
				data[++top] = newNode.deepCopy(); // pre-increments top then pushes node
				return true; // successful push
			}
			else return false; // overflow
		}

		public Node pop() {
			if(top > -1 ) {
				return data[top--]; // returns a shallow copy then post decrements top
			}
			else return null; // underflow
		}

		public void showAll() {
			for(Node node : data) {
				if(!Objects.isNull(node)) System.out.println(node.toString());
			}
		}

		public void init() {
			top = -1; // reinitialize the stack to empty
		}

		public boolean isEmpty() {
			if(top>-1) return false;
			else return true;
		}

		public boolean isFull() {
			if(top <= size-1) return false;
			else return true;
		}

		public Node peek() {
			if(top > -1 ) {
				return data[top]; // returns a shallow copy of this node
			}
			else return null; // underflow
		}
	}

	// node inner-class
	private static class Node {
		private String name;
		private String id;

		public Node() {
		this.name = "";
		this.id = "";
		}

		public Node(String name, String id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Node{" +
							"name='" + name + '\'' +
							", id='" + id + '\'' +
							'}';
		}

		public Node deepCopy() {
			Node clone = new Node(name, id);
			return clone;
		}
	}
}
