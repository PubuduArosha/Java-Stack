package lecture;

public class stackX {

	private int maxSize;//size of stack array
	private int top;//top of the stack
	private double[] stackArray;
	
	//constructor
	public stackX(int s) {
		maxSize = s;
		stackArray = new double[maxSize];
		top = -1;
	}
	
	public void push(double j) {
		if (top == maxSize-1)
			System.out.println("Stack is full!");
		else
			stackArray[++top] = j;
	}
	
	public double pop() {
		if( top == -1 )
			return -99;
		else 
			return stackArray[top--];
	}
	
	public double peek() {
		if ( top == -1 )
			return -99;
		else 
			return stackArray[top];
	}
	
	public boolean isEmty() {
		if ( top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if ( top == maxSize-1)
			return true;
		else
			return false;
	}
}
