package com;

public class QueueX {
	//declare variables
	private int maxSize;
	private int front;
	private int rear;
	private int nItem;
	private int[] queueArr;
	
	public QueueX(int s) {
		//initialization
		maxSize = s;
		queueArr = new int[maxSize];
		front = 0;//keep in track of the element which is insert at first 
		rear = -1;//keep in track of the element which is insert at last
		nItem = 0;//no of items
	}
	
	//isFull Method
	public boolean isFull() {
		//check the queue is full or not
		return (nItem == maxSize);
	}
	
	//isEmpty Method
	public boolean isEmpty() {
		//check the queue is empty or not
		return (nItem == 0);
	}
	
	//insert Method
	public void insert(int j) {
		//check the queue is full or not
		if(!isFull()) {
			/*rear++;
			queueArr[rear] = j;*/
			queueArr[++rear] = j;//increment the rear and initialization to the variable
			nItem++;//increment nItem 
		}
		else {
			System.out.println("Queue array is full");//prompt error message
		}
	}
	
	//delete Method
	public int remove() {
		//check the queue is empty or not
		if(!isEmpty()) {
			nItem--;//decrement the nItem 
			/*front++;
			return queueArr[front];*/
			return queueArr[front++];//increment front and return the value of front
		}
		else {
			System.out.println("Queue Array is Empty");//prompt error message
			return -99;
		}
	}
	
	//peek Method
	public int peekFront() {
		//check the queue is empty or not
		if(!isEmpty()) {
			return queueArr[front];
		}
		else {
			System.out.println("Queue Array is Empty");//prompt error message
			return -99;
		}
	}

}
