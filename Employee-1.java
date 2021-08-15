package employeeLinkedList;

public class Employee {
	int salary;
	int age;
	int employeeId;
	Employee next;
	static int counterID = 0;
	public Employee(int salary, int age){
		counterID++;
		this.salary = salary;
		this.age = age;
		next = null;
		employeeId = counterID;
	}

}
