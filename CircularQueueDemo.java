package CircularQueue;

import java.io.*;

class CircularQueueDemo {

	public static void main(String[] args) throws Exception {

		LinkListQueue queueImpl = new LinkListQueue();

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		String input = "";

		System.out.println("The following is a list of commands:");
		System.out.println("cq.insert : inserts a new node into the queue");
		System.out.println("cq.delete : deletes a node from the queue");
		System.out.println("cq.print  : prints the queue to the screen");
		System.out.println("cq.isempty   : prints the number of nodes in the queue");

		while (!input.toUpperCase().equals("EXIT")) {
			System.out.println("Enter exit to Terminate this program. ");
			System.out.println("Enter a command: ");
			input = br.readLine();

			if (input.toUpperCase().equals("CQ.INSERT")) {
				System.out.println("Enter the data: ");
				input = br.readLine();
				queueImpl.enqueue(input);
			} else if (input.toUpperCase().equals("CQ.DELETE")) {
				if(queueImpl.isEmpty()){
					System.out.println("The Queue is already empty");
				}else{
					queueImpl.dequeue();
					System.out.println("A Node has been DELETED: ");
				}

			} else if (input.toUpperCase().equals("CQ.PRINT")) {
				queueImpl.displayQueue();
			} else if (input.toUpperCase().equals("CQ.ISEMPTY")) {
				System.out.println(queueImpl.isEmpty());
			} else if (input.toUpperCase().equals("EXIT")) {
				System.out.println("Are you sure you want to Terminate this program? y/n");
				input = br.readLine();
				if (input.toUpperCase().equals("Y")) {
					System.exit(0);
				}
			}
		}


		System.exit(0);
	}
}
