package core;

import java.util.ArrayList;

public class Stack implements IStack {
private ArrayList<Object> a = new ArrayList<Object>();

	@Override
	public boolean isEmty() {
		return true;
		
	}

	@Override
	public int getSize() {
		if(a!=null) {
			return a.size();
		}else return 0;
	}

	@Override
	public boolean isFull() {
		
		return false;
	}

	@Override
	public void push(Object elm) {
		a.add(elm);
		
	}

	@Override
	public Object top() {
		
		return a.get(getSize()-1);
	}

	@Override
	public Object pop(Object elm) {
		return this.a.remove(elm);
	}

	

}