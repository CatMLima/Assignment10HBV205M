public class MoneyStack {
	private static final int THE_CAPACITY = 10;
	private Money[] theStack;
	private int nextPushLocation; // Location in theStack array, where next push
									// will insert. 0 means: stack is empty.

	public MoneyStack() {
		theStack = new Money[MoneyStack.THE_CAPACITY];
		nextPushLocation = 0;
	}

	public boolean isFull() {
		if (nextPushLocation == THE_CAPACITY) {
			return true;
		} else {
			return false;
		}
	}

	public void push(Money element) throws ArrayIndexOutOfBoundsException {
		theStack[nextPushLocation++] = element;
	}

	public Money pop() throws ArrayIndexOutOfBoundsException {
		return theStack[--nextPushLocation];
	}

	public int sum() {
		int currentSum = 0;
		for (int i = nextPushLocation-1; i >= 0; i--) {
			currentSum +=(theStack[i]).getAmount();
		}
		return currentSum;
	}
	
	// TODO: Add getCapacity() method
	
}
