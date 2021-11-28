package worker;

public class WorkerMain {
	public static void main(String args[]) {
		DailyWorker d=new DailyWorker(22,"poonam",70);
		SalariedWorker s=new SalariedWorker(66,"Raju",99);
		d.compay(45);
		s.compay();
		}

}
