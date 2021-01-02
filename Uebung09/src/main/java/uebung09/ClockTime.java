package uebung09;

public class ClockTime {

	private int h;
	private int m;
	private int s;

	public ClockTime() {
		h = 0;
		m = 0;
		s = 0;
	}

	public ClockTime(int h) {
		this.h = h;
		m = 0;
		s = 0;
	}

	public ClockTime(int h, int m) {
		this.h = h;
		this.m = m;
		s = 0;
	}

	public ClockTime(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	public ClockTime(ClockTime ct) {
	}

	public void output() {
		System.out.println(String.format("%s:%s:%s", h, m, s));
	}

	public boolean same(ClockTime secondCt) {
		return false;
	}

	public void add(int i) {
	}

	public int diff(ClockTime secondCt) {
		return -1;
	}

	public int getSeconds() {
		return -1;
	}

	public int getMinutes() {
		return -1;
	}

	public int getHours() {
		return -1;
	}

}
