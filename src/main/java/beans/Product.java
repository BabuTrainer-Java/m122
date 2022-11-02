package beans;

import java.io.Serializable;

public class Product implements Serializable {
int pid;
String pname;
double  price;



public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


public Product() {
}
public Product(int pid, String pname, double price) {

	this.pid = pid;
	this.pname = pname;
	this.price = price;
}	
}
