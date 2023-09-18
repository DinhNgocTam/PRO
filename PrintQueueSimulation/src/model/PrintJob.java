/*
@author Hi
@date Sep 16, 2023
*/
package model;

public class PrintJob {
	private String[] arr; // array to store queue elements
	private int front; // front points to the front element in the queue
	private int rear; // rear points to the last element in the queue
	private int capacity; // maximum capacity of the queue
	private int count; // current size of the queue

	
	public PrintJob() {
		
	}
	public PrintJob(int size) {
		arr = new String[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// function to return the size of the queue
	public int size() {
		return count;
	}

	// function to check if the queue is full or not
	public boolean isFull() {
		return (size() == capacity);
	}

	// function to check if the queue is empty or not
	public boolean isEmpty() {
		return (size() == 0);
	}

	public void  addPrintJob(String item) {
		// check for queue overflow
		if (isFull()) {
			
			System.out.println("Overflow\nProgram Terminated");
			System.exit(-1);
			
		}

		System.out.println("Inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	public void deleteJob() {
		// check for queue underflow
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		String x = arr[front];

		System.out.println("Removing " + x);

		front = (front + 1) % capacity;
		count--;

		
		
	}
	
	public void processPrintJobs() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			for (int i = front; i <= rear; i++) {
				System.out.println("Processing print job: " + arr[i]);
			}
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}
	
	
}
