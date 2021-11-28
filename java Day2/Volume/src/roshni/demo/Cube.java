package roshni.demo;

public class Cube {
private double side,volume, sA;
	
	public Cube(int e) {
		this.side = e;
		}

	public double getVolume() {
		return volume;
	}

	public double getsA() {
		return sA;
	}



	public void volume() {
		volume = side*side*side;
	}


	public void surfaceArea() {
		sA = 6*side*side;
	}

}
