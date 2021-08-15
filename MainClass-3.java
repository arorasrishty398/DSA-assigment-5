package employeeLinkedList;

import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("1.Add Node");
			System.out.println("2.Sort");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter salary");
				int salary = input.nextInt();
				System.out.println("Enter age");
				int age = input.nextInt();
				list.addNode(salary, age);
				break;
			case 2:
				list.sortList();
				break;
			case 3:
				list.displayList();
				break;
			default:
				input.close();
				return;
			}
		}

	}

}



