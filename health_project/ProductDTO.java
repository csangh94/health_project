package 프로젝트;

public class ProductDTO {
String num;
int choice;
int pt;
int cloth;
int locker;
int lockernum;
int sum;
int month;

public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getSum() {
	return sum;
}
public void setSum(int sum) {
	this.sum = sum;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public int getChoice() {
	return choice;
}
public void setChoice(int choice) {
	this.choice = choice;
}
public int getPt() {
	return pt;
}
public void setPt(int pt) {
	this.pt = pt;
}
public int getCloth() {
	return cloth;
}
public void setCloth(int cloth) {
	this.cloth = cloth;
}
public int getLocker() {
	return locker;
}
public void setLocker(int locker) {
	this.locker = locker;
}
public int getLockernum() {
	return lockernum;
}
public void setLockernum(int lockernum) {
	this.lockernum = lockernum;
}
@Override
public String toString() {
	return "ProductDTO [num=" + num + ", choice=" + choice + ", pt=" + pt + ", cloth=" + cloth + ", locker=" + locker
			+ ", lockernum=" + lockernum + "]";
}

}
