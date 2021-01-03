package aufgabe3;

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
		if (h < 0) {
			this.h = 24 + h;
		} else {
			if (h >= 24) {
				this.h = 0 + h - 24;
			} else {
				this.h = h;
			}
		}
		m = 0;
		s = 0;

	}

	public ClockTime(int h, int m) {
		if (h < 0) {
			this.h = 24 + h;
		} else {
			if (h >= 24) {
				this.h = 0 + h - 24;
			} else {
				this.h = h;
			}
			if (m < 0) {
				this.m = 60 + m;
				this.h = h - 1;
			} else {
				if (m >= 60) {
					this.m = m - 60;
					this.h = h + 1;
				} else {
					this.m = m;
				}
			}
		}
		s = 0;

	}

	public ClockTime(int h, int m, int s) {
		if (h < 0) {
			this.h = 24 + h;
		} else {
			if (h >= 24) {
				this.h = 0 + h - 24;
			} else {
				this.h = h;
			}
			if (m < 0) {
				this.m = 60 + m;
				this.h = h - 1;
			} else {
				if (m >= 60) {
					this.m = m - 60;
					this.h = h + 1;
				} else {
					this.m = m;
				}
			}
		}
		if (s < 0) {
			this.s = 60 + s;
			this.m = m - 1;
		} else {
			if (s >= 60) {
				this.s = s - 60;
				this.m = m + 1;
			} else {
				this.s = s;
			}
		}
	}

	public ClockTime(ClockTime ct) {
		h = ct.h;
		m = ct.m;
		s = ct.s;
	}

	public boolean same(ClockTime secondCt) {
		if (getHours() == secondCt.getHours() && getMinutes() == secondCt.getMinutes()
				&& getSeconds() == secondCt.getSeconds()) {
			return true;
		} else {
			return false;
		}
	}

	public void add(int x) {
	
		int sec = 0;
		int min = 0;
		int hour = 0;
		
		if (x > 3600 || x < -3600) {
			hour = x / 3600;
			min = x % 3600 / 60;
			sec = x % 3600 % 60;
		}
		else {
			sec = x % 60;
			min = x / 60;
		}
		if (x > 0) {
			if ((s+sec)>=60) {
				m+=1;
				s=s+sec-60;
			}
			else {
				s=s+sec;
			}
			if ((m+min)>=60) {
				h+=1;
				m=m+min-60;
			}
			else {
				m=m+min;
			}
		}
		else {
			if ((s+sec)<0) {
				m-=1;
				s = s + sec + 60;
			}
			else {
				s = s + sec;
			}
			if ((m + min) < 0) {
				if (h - 1 < 0) {
					h =+ 24;
				}
				h -= 1;
				m = m + min + 60;
			}
			else {
				m = m + min;
			}
		}
		h = (h + hour) % 24;
	}

	public int diff(ClockTime secondCt) {
		
		int result = (secondCt.getHours() - getHours()) * 3600 + (secondCt.getMinutes() - getMinutes()) * 60 + (secondCt.getSeconds() - getSeconds());
		if (result < 0) {
			result += 24 * 3600;
		}
		return result;
	}

	public int getSeconds() {
	
		return s;
	}

	public int getMinutes() {

		return m;
	}

	public int getHours() {
	
		return h;
	}

	public void output() {
		System.out.println(String.format("%02d:%02d:%02d", h, m, s));
	}

}
