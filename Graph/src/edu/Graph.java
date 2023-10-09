/*
@author Hi
@date Oct 8, 2023
*/
package edu;

public class Graph {
	int [][] a;
	int n;
	char[] v;
	
	public Graph() {
		v = "ABCDEFGHIJK".toCharArray();
	}
	
	public void setData(int[][] b) {
		n = b.length;
		a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = b[i][j];
			}
		}
	}
	
	public void dispAdj() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%5d" , a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public void visit(int i) {
		System.out.println(v[i] + " ");
	}
	
	public void breadth(boolean[] en, int start) {
		MyQueue q = new MyQueue();
		int r;
		q.enqueue(start);
		en[start] = true;
		while(!q.isEmpty()) {
			r = q.dequeue();
			visit(r);
			for (int i = 0; i < n; i++) {
				if(!en[i] && a[r][i] > 0) {
					q.enqueue(i);
					en[i] = true;
				}
			}
		}
	}
	
	public void breadth(int k) {
		boolean[] en = new boolean[n];
		for (int i = 0; i < n; i++) {
			en[i] = false;
		}
		breadth(en, k);
		
		for (int i = 0; i < n; i++) {
			
			if(!en[i]) {
				breadth(en,i);
			}
		}
	}
	
	public void depth(boolean[] vis, int start) {
		visit(start);
		vis[start] = true;
		for (int i = 0; i < n; i++) {
			if(!vis[i] && a[start][i] > 0) {
				depth(vis, i);
			}
		}
	}
	public void depth(int k) {
		boolean[] vis = new boolean[n];
		for (int i = 0; i < n; i++) {
			vis[i] = false;
		}
		depth(vis,k);
		
		for (int i = 0; i < n; i++) {
			if(!vis[i]) {
				depth(vis,i);
			}
		}
	}
}