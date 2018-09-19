import java.util.Objects;

/**
 * This application demonstrates the evaluation of a postfix expression using
 * a stack data structure.
 */
public class Day0014 {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		String[] tokens = {"2", "3", "2","*","-"};

		for(String sToken: tokens) {
			char cToken = sToken.charAt(0);
			System.out.print(cToken + " ");
			Node n = new Node(sToken);

			if(cToken >= '0' && cToken <= '9') stack.push(n); // push operands
			switch(cToken) {
				case '*': case '/': case '+': case '-' :
					int x = Integer.parseInt(stack.pop().toString());
					int y = Integer.parseInt(stack.pop().toString());
					switch(cToken) {
						case '*':
							stack.push(new Node(Integer.toString(x * y))); // push result
							break;
						case '/':
							stack.push(new Node(Integer.toString(x / y))); // push result
							break;
						case '+':
							stack.push(new Node(Integer.toString(x + y))); // push result
							break;
						case '-':
							stack.push(new Node(Integer.toString(x - y))); // push result
							break;
					}
			}
		}
		Node result = stack.pop();
		System.out.println("\nResult:");
		System.out.println(result.toString());
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

		public boolean push(Node n){
			if(top <= size-1) {
				data[++top] = n.deepCopy(); // pre-increments top then pushes
				return true; // successful push
			}
			else return false; // overflow
		}

		public Node pop() {
			if(top > -1 ) {
				return data[top--]; // returns a shallow copy then post decrements
			}
			else return null; // underflow
		}

		public void showAll() {
			for(int i = 0; i <= top; i++) {
				System.out.println(data[i].toString());
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
			if(top > -1 ) return data[top]; // returns a shallow copy of this node
			else return null; // underflow
		}
	}

	// node inner-class
	private static class Node {
		private String token;

		public Node(String t) {
			this.token = t;
		}

		@Override
		public String toString() {
			return token;
		}

		public Node deepCopy() {
			Node clone = new Node(token);
			return clone;
		}
	}
}
