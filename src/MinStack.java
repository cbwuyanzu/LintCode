import java.util.Stack;

public class MinStack {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();

	public MinStack() {
		// do initialize if necessary
	}

	public int pop() {
		// write your code here
		int a;
		if (stack.peek().intValue() == minStack.peek().intValue()) {
			a = stack.pop();
			minStack.pop();
		} else {
			a = stack.pop();
		}
		return a;
	}

	public int min() {
		// write your code here
		return minStack.peek();
	}

	public void push(int number) {
		// write your code here
		stack.push(number);
		if (minStack.empty()) {
			minStack.push(number);
		} else if (number <= minStack.peek()) {
			minStack.push(number);
		}
	}
}
