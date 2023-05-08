package newJavaPrograms;

public class lastDigitisEvenOrOdd {
	
	private String ename;
	private int eid;
	private double sal;
	private String org;
	
	private String getEname() {
		return ename;
	}
	private void setEname(String ename) {
		this.ename = ename;
	}
	private int getEid() {
		return eid;
	}
	private void setEid(int eid) {
		this.eid = eid;
	}
	private double getSal() {
		return sal;
	}
	private void setSal(double sal) {
		this.sal = sal;
	}
	private String getOrg() {
		return org;
	}
	private void setOrg(String org) {
		this.org = org;
	}
	public lastDigitisEvenOrOdd(String ename, int eid, double sal, String org) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
		this.org = org;
	}

}
