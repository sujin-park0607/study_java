package homwork;

import java.util.Arrays;
import java.util.Scanner;

interface Stack{
	
	public boolean isEmpty();
	public boolean isFull();
	public void push(char item);
	public char pop();
	public char peek();
	public void clear();

}

class StackCheck implements Stack{
	private char arr[];
	private int length;
	private int idx;
	
	public StackCheck(int length){
		this.length = length;
		arr = new char[length];
		idx = -1;
	}
	
	@Override
	public boolean isEmpty() {
		if(idx == -1)
			return true;
		else return false;
	}

	@Override
	public boolean isFull() {
		if(idx == length)
			return true;
		else return false;
	}

	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("꽉차있습니다");
		}
		else {
			///스택의 최 상위에 새로운 자료를 삽입한다
			arr[++idx] = item;
			System.out.println("입력된 문자: "+item);
		}
	}

	@Override
	public char pop() {
		//가장 최 상위에 위치한 자료를 추출한 후에 스택에서 제거한다		
		if(isEmpty()) {
			System.out.println("비어있습니다");
			return 0;
		}
		else {
			System.out.println("삭제된 문자: "+arr[idx]);
			return arr[idx--];
		}
	}

	@Override
	public char peek() {
		//가장 최 상위에 위치한 자료를 추출한다
		//pop 메소드와는 달리 스택에서 제거하지는 않는다.
		System.out.println("최상단 문자: "+ arr[idx]);
		return arr[idx];
	}

	@Override
	public void clear() {
		//스택에 존재하는 모든 자료들을 삭제한다.
		if(isEmpty()) {
			System.out.println("이미 비어있습니다");
		}
		else {
			idx = -1;
			this.length = length;
			arr = new char[this.length];
			System.out.println("Stack is empty");
		}
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(arr));
	}
}

public class StackTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("스택의 크기를 입력하시오: ");
		int length = sc.nextInt();
		
		StackCheck stack = new StackCheck(length);
		
		stack.push('A');
		stack.printStack();

		stack.push('B');
		stack.printStack();

		stack.push('C');
		stack.printStack();

		stack.pop();
		stack.printStack();

		stack.pop();
		stack.printStack();

		stack.peek();
		stack.printStack();

		stack.clear();
		stack.printStack();
		

	}

}
