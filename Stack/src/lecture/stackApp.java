package lecture;

public class stackApp {

	public static void main(String[] args) {
		
		stackX theStack = new stackX(10);
		
		theStack.push(30);
		theStack.push(80);
		theStack.push(100);
		theStack.push(25);
		
		while ( !theStack.isEmty() ) {
			double val = theStack.pop();
			System.out.print( val + " ");
		}

	}

}
