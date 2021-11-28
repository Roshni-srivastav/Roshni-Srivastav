package roshni.demo;

public class CalculateEggs {

	private int totalNoOfEggs;
	private int eggs;
	public void setTotalNoOfEggs(int totalNoOfEggs) {
		this.totalNoOfEggs=totalNoOfEggs;
	}
	public String getTotalNoOfEggs() {
		String answer = cal();
		return answer;
	}
	private String cal() {
		EggUnit e = new EggUnit();
		String answer = "" ;
		int g = e.getGross();
		int d = e.getDozen();
		int r = e.getRemaining();
		eggs = 120;
		g = eggs /144;
		int aboveGross = eggs % 144;
		d = aboveGross / 12;
		r = aboveGross %12;
		answer = "Gross is :"+ Integer.toString(g) + " Dozen is: "+ Integer.toString(d)+ " Remaining is: "+ Integer.toString(r);
		return answer;
	}

}
