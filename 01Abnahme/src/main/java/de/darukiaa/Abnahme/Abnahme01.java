package de.darukiaa.Abnahme;

import java.util.ArrayList;
import java.util.List;

/**
 * Berechne A-B=C, wobei A,B & C jeweils 3 stellige Zahlen sind, und alle Zahlen
 * von 1-9 nur einmal vorkommen dürfen. Gib alle mathematisch korrekten
 * berechnungen in der Konsole aus.
 *
 * @author marcel
 *
 */
public class Abnahme01 {

	int[] allNumbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	List<Integer> usedVariations = new ArrayList<>();

	public Abnahme01() {
		System.out.println("Test");
		for (int i = 400000000; i < 700000000; i++) {
			List<Character> usedNumbers = new ArrayList<>();
			String numberAsString = Integer.toString(i);
			if (numberAsString.contains("0")) {
				continue;
			}
			boolean singleton = true;
			for (int j = 0; j < numberAsString.length(); j++) {
				char c = numberAsString.charAt(j);
				if (usedNumbers.contains(c)) {
					singleton = false;
					break;
				} else {
					usedNumbers.add(c);
				}
			}
			if (singleton) {
				String aString = (String) numberAsString.subSequence(0, 3);
				String bString = (String) numberAsString.subSequence(3, 6);
				String cString = (String) numberAsString.subSequence(6, 9);
				int a = Integer.parseInt(aString);
				int b = Integer.parseInt(bString);
				int c = Integer.parseInt(cString);
				if (a - b == c) {
					System.out.println(String.format("%s - %s = %s", aString, bString, cString));
				}
			}
		}
	}
}
