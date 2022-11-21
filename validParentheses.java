package leetCode;

public class validParentheses {
	static class MyStack{
		class Node{
			Node next;
			char value;
			Node(char v){
				value = v;
				next = null;
			}
			
		}
		Node topNode;
		public void push(char value) {
			Node newNode = new Node(value);
			if(!isEmpty())
				newNode.next = topNode;
			topNode = newNode;
		}
		public  boolean isEmpty() {
			return topNode == null;
		}
		public char pop() {
			char value = topNode.value;
			topNode= topNode.next;
			return value;
		}
		
		
	}
	public static boolean isValid(String s) {
		MyStack stack = new MyStack();
		int n = s.length();
		for(int i=0; i< n;i++) {
			char curChar = s.charAt(i);
			if(curChar=='('|| curChar=='[' || curChar == '{') {
				stack.push(curChar);
			}else{
				if(stack.isEmpty())
					return false;
				char prevChar = stack.pop();
				if((prevChar=='(' && curChar ==')')
				|| (prevChar =='[' && curChar ==']')
				|| (prevChar ==']')||(prevChar=='{' && curChar=='}')) {
					
				}
				else {
					return false;
				}
					
			}
		}
		return stack.isEmpty();
	}

}
