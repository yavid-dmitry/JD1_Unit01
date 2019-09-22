package by.htp.task08.main.task07;
/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {
private double ax, ay;
private double bx, by;
private double cx, cy;
private double ab;
private double bc;
private double ac;

public double getAb() {
	return ab;
}

public double getBc() {
	return bc;
}

public double getAc() {
	return ac;
}

public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
	super();
	this.ax = ax;
	this.ay = ay;
	this.bx = bx;
	this.by = by;
	this.cx = cx;
	this.cy = cy;
	this.ab = Math.hypot(ax - bx, ay - by);
	this.ac = Math.hypot(ax - cx, ay - cy);
	this.bc = Math.hypot(bx - cx, by - cy);
}
public double getAx() {
	return ax;
}
public void setAx(double ax) {
	this.ax = ax;
}
public double getAy() {
	return ay;
}
public void setAy(double ay) {
	this.ay = ay;
}
public double getBx() {
	return bx;
}
public void setBx(double bx) {
	this.bx = bx;
}
public double getBy() {
	return by;
}
public void setBy(double by) {
	this.by = by;
}
public double getCx() {
	return cx;
}
public void setCx(double cx) {
	this.cx = cx;
}
public double getCy() {
	return cy;
}
public void setCy(double cy) {
	this.cy = cy;
}

}
