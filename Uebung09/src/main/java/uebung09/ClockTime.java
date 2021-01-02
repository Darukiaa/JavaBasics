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
		if (h < 0) {
			this.h = 24 + h;
		}
			else {
				if (h >=24) {
					this.h = 0 + (h - 24);
				}
				else {
			this.h = h;
				}
		}
		m = 0;
		s = 0;
		
	}

	public ClockTime(int h, int m) {
		if (h < 0) {
			this.h = 24 + h;
			}
			else {
				if (h >=24) {
					this.h = 0 + (h - 24);
				}
				else {
			this.h = h;
				}
		if (m < 0) {
			this.m = 60 + m;
			this.h = h -1;
			}	
		else {
			this.m = m;
				}		
			}	
		s = 0;
			
	}

	public ClockTime(int h, int m, int s) {
		if (h < 0) {
			this.h = 24 + h;
			}
			else {
				if (h >=24) {
					this.h = 0 + (h - 24);
				}
				else {
			this.h = h;
				}
		if (m < 0) {
			this.m = 60 + m;
			this.h = h - 1;
			}	
		else {
			this.m = m;
				}		
			}	
		if (s < 0) {
			this.s = 60 + s;
			this.m = m - 1;
		}
		else {
			this.s = s;
		}
	}

	public ClockTime(ClockTime ct) {
	}


	public boolean same(ClockTime secondCt) {
		return false;
	}

	public void add(int x) {
		int i = 0;
		if (x>=60) {
			while (x>=60) {
				i = i + 1;
				x = x - 60;
				}
			this.m = m + i;
		}
	}
				
	public int diff(ClockTime secondCt) {
		int hs;
		int ms;
		int diff;

		hs = (h * 60) * 60;
		ms = m * 60;
		diff = hs + ms + s;
		
		
		return diff;
		
	}

	public int getSeconds() {
		if (s < 0) {
			this.s = 60 + s;
		}
		else {
			if (s >= 60) {
				this.s = s - 60;
			}
			
		}
		return s;
	}

	public int getMinutes() {
		if (m < 0) {
			this.m = 60 + m;
		}
		else {
			if (m >= 60) {
				this.m = m - 60;
			}
		}
		return m;
		
	}

	public int getHours() {
		if (h < 0) {
			this.h = 24 + h;
		}
		else {
			if (h >= 24) {
				this.h = h - 24;
			}
		}
		return h;
	}
	public void output() {
		System.out.println(String.format("%s:%s:%s", h, m, s));
	}

}
