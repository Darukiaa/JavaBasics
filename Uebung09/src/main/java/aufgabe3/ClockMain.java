package aufgabe3;

public class ClockMain {
	public static void main(String[] args) {
		// custom constructors
		System.out.println("-------Default------");
		System.out.println("Expect: 00:00:00");
		new ClockTime().output();
		System.out.println("-------h------");
		System.out.println("Expect: 02:00:00");
		new ClockTime(26).output();
		System.out.println("-------minus h------");
		System.out.println("Expect: 14:00:00");
		new ClockTime(-10).output();
		System.out.println("-------h & m------");
		System.out.println("Expect: 10:05:00");
		new ClockTime(10, 5).output();
		System.out.println("-------h & minus m------");
		System.out.println("Expect: 09:55:00");
		new ClockTime(10, -5).output();
		System.out.println("-------h & m & s------");
		System.out.println("Expect: 10:05:45");
		new ClockTime(10, 5, 45).output();
		System.out.println("-------h & m & minus s------");
		System.out.println("Expect: 10:04:15");
		new ClockTime(10, 5, -45).output();
		// copy constructor
		System.out.println("-------copy constructor------");
		ClockTime oldCt = new ClockTime(10, 5, -45);
		ClockTime newCt = new ClockTime(oldCt);
		System.out.println("Expect: 10:04:15");
		oldCt.output();
		System.out.println("-------------");
		System.out.println("Expect: 10:04:15");
		newCt.output();
		// same method
		System.out.println("-------same method------");
		ClockTime firstCt = new ClockTime(10, 5, -45);
		ClockTime secondCt = new ClockTime(10, 4, 15);
		System.out.println("Expect: true");
		boolean result = firstCt.same(secondCt);
		System.out.println(result);
		System.out.println("-------------");
		firstCt = new ClockTime(10, 5, -45);
		secondCt = new ClockTime(10, 5, 15);
		System.out.println("Expect: false");
		result = firstCt.same(secondCt);
		System.out.println(result);
		// add method
		System.out.println("-------add method------");
		ClockTime ct = new ClockTime(0, 5, 30);
		System.out.println("Expect: 00:05:30");
		ct.output();
		System.out.println("-------plus------");
		ct.add(600);
		System.out.println("Expect: 00:15:30");
		ct.output();
		System.out.println("-------minus------");
		ct = new ClockTime(0, 5, 30);
		ct.add(-600);
		System.out.println("Expect: 23:55:30");
		ct.output();
		// diff
		firstCt = new ClockTime(10, 5, 15);
		secondCt = new ClockTime(11, 5, 15);
		System.out.println("-------diff------");
		System.out.println("Expect: 3600");
		System.out.println(firstCt.diff(secondCt));
		System.out.println("-------------");
		System.out.println("Expect: 82800");
		System.out.println(secondCt.diff(firstCt));
		// getSeconds
		System.out.println("-------getSeconds------");
		ct = new ClockTime(1, 5, 30);
		System.out.println("Expect: 30");
		System.out.println(ct.getSeconds());
		// getMinutes
		System.out.println("-------getMinutes------");
		ct = new ClockTime(1, 5, 30);
		System.out.println("Expect: 5");
		System.out.println(ct.getMinutes());
		// getHours
		System.out.println("-------getHours------");
		ct = new ClockTime(1, 5, 30);
		System.out.println("Expect: 1");
		System.out.println(ct.getHours());
	}
}
