package FizzBuzz;

public class Count100 {

	static public boolean isBlank(String value) {
		if (value == null || value.length() == 0) {
			return true;
		}
		return false;
	}

	static public boolean isInt(String value) {
		if (isBlank(value)) {
			return false;
		}
		try {
			Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	static public String FizzBuzz(String value) {
		if (isInt(value)) {
			int valueInt = Integer.parseInt(value);
			if (((valueInt % 15) == 0)) {
				return "FizzBuzz";
			} else {
				if ((valueInt % 5) == 0) {
					return "Buzz";
				} else {
					if ((valueInt % 3) == 0) {
						return "Fizz";
					}
				}
			}
		}
		if (!(isInt(value))){
			return "error";
		}
		return value;
	}

//	static public void Count100(String value) {
//
//		int valueInt = Integer.parseInt(value);
//		for (valueInt = 1; valueInt <= 100; valueInt++) {
//			if (FizzBuzz(value) == "FizzBuzz") {
//				System.out.println("FizzBuzz");
//			} else {
//				if (FizzBuzz(value) == "Fizz") {
//					System.out.println("Fizz");
//				} else {
//					if (FizzBuzz(value) == "Buzz") {
//						System.out.println("Buzz");
//					} else {
//						System.out.println(valueInt);
//					}
//				}
//			}
//		}
//	}


}