package br.com.hagar.utils;

public final class Utils {

	public static Double convertToDouble(String strNumber) {
		String number = numRep(strNumber);
		if (isNumeric(number)) {
			return Double.parseDouble(number);
		}
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) {
			return false;
		}
		return numRep(strNumber).matches("[-+]?[0-9]*\\.?[0-9]+");
	}

	private static String numRep(String strNumber) {
		return strNumber.replaceAll(",", ".");
	}

}
