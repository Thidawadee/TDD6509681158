package core;

public interface IStack {
	boolean isEmty();

	int getSize();

	boolean isFull();

	void push(Object elm);

	Object top();

	Object pop(Object elm);
}