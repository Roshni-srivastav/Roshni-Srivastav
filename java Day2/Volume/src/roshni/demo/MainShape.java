package roshni.demo;

public class MainShape {
	public static void main(String[] args) {
		
		Cyclinder cOb = new Cyclinder(1,5);
		Sphere sOb = new Sphere(40);
		Cube ccOb = new Cube(19);
		
		cOb.volume();
		cOb.surfaceArea();
		
		sOb.volume();
		sOb.surfaceArea();
		
		ccOb.volume();
		ccOb.surfaceArea();
		
		
		System.out.println("Cylinder Volume is "+cOb.getVolume());
		System.out.println("Cylinder SurfaceArea is "+cOb.getsA());
		
		System.out.println("Sphere Volume is "+sOb.getVolume());
		System.out.println("Sphere SurfaceArea is "+sOb.getsA());
		
		System.out.println("Cube Volume is "+ccOb.getVolume());
		System.out.println("Cube SurfaceArea is "+ccOb.getsA());
	}


}