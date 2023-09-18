/*
@author Hi
@date Sep 16, 2023
*/
package controller;

import common.Library;
import model.PrintJob;
import view.Menu;

public class PrintQueueSystem extends Menu<String>{
	Library library = new Library();
	
	PrintJob printJob = new PrintJob(library.getInteger("Enter size of array: "));
	
	static String[] mc = {"Add Print Job","Delete Job","Process Print Jobs","Exit"};
	
	public PrintQueueSystem() {
		super("Print Queue System", mc);
//		sizeArray = printJob.getCapacity();
//		arr = printJob.getArr();
	}
	@Override
	public void executed(int n) {
		
		switch (n) {
		case 1: 
			String nameJob = library.getValue("Enter name of job: ");
			printJob.addPrintJob(nameJob);
			break;
		case 2:
			printJob.deleteJob();
			break;
		case 3:
			printJob.processPrintJobs();
			break;
		case 4:
			System.out.println("End program");
			System.exit(0);
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}

}
