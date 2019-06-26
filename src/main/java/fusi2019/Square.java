package fusi2019;

public class Square extends Shape {
	
	protected double side;
	
	public Square () {
		
	}
	
	public Square (double side, String color, boolean filled) {
		this.side= side;
		this.color = color;
		this.filled = filled;
	}
	 
	
	
	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2 * this.side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square [side="+this.side+","
		+ " color ="+this.color+", filled="+this.filled+","
				+ "perimeter = "+this.getPerimeter()+"]";
	}

}
