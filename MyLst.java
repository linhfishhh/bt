package Arraylst;
import java.util.ArrayList;
public class MyLst<E> {
	private int size=0;
	static final int DEFAUL_CAPACITY=10;
	 ArrayList<E> arr = new ArrayList<E>(DEFAUL_CAPACITY);
	public MyLst() {
	}
	public MyLst(int capacity) {
	}
	public void add(int index, E element) {
		this.arr.add(index,element);
	}
	public E remove(int index) {
		return this.arr.remove(index);
	}
	public int size() {
		return this.arr.size();
	}
	public void show() {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
}
