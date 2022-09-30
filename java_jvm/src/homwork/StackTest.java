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
			System.out.println("�����ֽ��ϴ�");
		}
		else {
			///������ �� ������ ���ο� �ڷḦ �����Ѵ�
			arr[++idx] = item;
			System.out.println("�Էµ� ����: "+item);
		}
	}

	@Override
	public char pop() {
		//���� �� ������ ��ġ�� �ڷḦ ������ �Ŀ� ���ÿ��� �����Ѵ�		
		if(isEmpty()) {
			System.out.println("����ֽ��ϴ�");
			return 0;
		}
		else {
			System.out.println("������ ����: "+arr[idx]);
			return arr[idx--];
		}
	}

	@Override
	public char peek() {
		//���� �� ������ ��ġ�� �ڷḦ �����Ѵ�
		//pop �޼ҵ�ʹ� �޸� ���ÿ��� ���������� �ʴ´�.
		System.out.println("�ֻ�� ����: "+ arr[idx]);
		return arr[idx];
	}

	@Override
	public void clear() {
		//���ÿ� �����ϴ� ��� �ڷ���� �����Ѵ�.
		if(isEmpty()) {
			System.out.println("�̹� ����ֽ��ϴ�");
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
		System.out.print("������ ũ�⸦ �Է��Ͻÿ�: ");
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
