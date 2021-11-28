package worker;

public class Worker {
	String name;
	int empno;
	
	Worker(int no,String n) { 
		empno=no; name=n; 
	}
	
	void show() {
		System.out.println("\n=============================");
		System.out.println("Employee Number : "+empno);
		System.out.println("Employee Name : "+name);
	}
}

class DailyWorker  extends Worker {
	int rate;
	
	DailyWorker (int no,String n,int r) {
		super(no,n);
		rate=r;
	}
	
	void compay(int h) {
		show();
		System.out.println("Salary : "+rate*h);
	}
}
	
class SalariedWorker extends Worker {

	int rate;
	
	SalariedWorker(int no,String n,int r) {
		super(no,n);
		rate=r;
	}
	
	int hour=40;
	
	void compay() {
		show();
		System.out.println("Salary : "+rate*hour);
	}

}
