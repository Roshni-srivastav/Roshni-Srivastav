package roshni.demo;

public class Cyclinder extends Shape3D {
	
	private double radius, height,volume, sA;

	public Cyclinder(int r, int h) {
		this.radius = r;
		this.height = h;
	}


	public double getVolume() {
		return volume;
	}

	public double getsA() {
		return sA;
	}

	
	public void volume() {
		volume = PI*(radius*radius)*height;
	}

	public void surfaceArea() {
		sA = 2*PI*radius*height + 2*PI*(radius*radius);
	}

}
