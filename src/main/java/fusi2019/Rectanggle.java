package fusi2019;

public class Rectanggle extends Shape {
	protected double width;
	protected double lenght;
	
	public Rectanggle() {
		
	}
	public Rectanggle (double width, double lenght, String color, boolean filled) {
		this.width = width;
		this.lenght = lenght;
		this.color = color;
		this.filled = filled;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public double getArea() {
		return this.width * this.lenght;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.lenght);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectanggle[lenght="+this.lenght+","
		+ " color ="+this.color+", filled="+this.filled+","
				+ "perimeter = "+this.getPerimeter()+"]";
	}
}
