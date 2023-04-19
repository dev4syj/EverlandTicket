package everlandTicket;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateClass {
	
	LocalDate getValidBirthDate() throws NumberFormatException {
	    LocalDate now = LocalDate.now();
	    boolean isValidInput = false;
	    LocalDate birthDate = null;

	    while (!isValidInput) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("\nPlease enter your birth date in the format yyyy-mm-dd: ");
	        String birthDayNumbers = scanner.nextLine();
	        String[] birthDayNumbersSplit = birthDayNumbers.split("-");
	        
	        if (!birthDayNumbers.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
	            System.out.println("Invalid input. Birth date should be in the format yyyy-mm-dd");
	            continue;
	        }
	        try {	        
	            int birthYear = Integer.parseInt(birthDayNumbersSplit[0]);
	            int birthMonth = Integer.parseInt(birthDayNumbersSplit[1]);
	            int birthDay = Integer.parseInt(birthDayNumbersSplit[2]);

	            birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

	            if (birthDate.isAfter(now)) {
	                throw new IllegalArgumentException("Birthdate is in the future");
	            }
	            isValidInput = true;
	        } catch (DateTimeException | IllegalArgumentException e) {
	            System.out.println("Invalid input. " + e.getMessage());
	        }
	    }

	    return birthDate;
	}

	int calculateAge(LocalDate birthDate) {		
	    LocalDate now = LocalDate.now();
	    int age = Period.between(birthDate, now).getYears();
	    //calculated result type is American age
	    return age;
	}
	int calculatePrice(int discountType, int totalPrice) {	
		if (discountType == 2) {
			totalPrice = (int)((double)totalPrice * ConstantClass.DISABLE_DISCOUNT_RATE);
		} else if(discountType == 3) {
			totalPrice = (int)((double)totalPrice * ConstantClass.MERIT_DISCOUNT_RATE);
		} else if(discountType == 4) {
			totalPrice = (int)((double)totalPrice * ConstantClass.MULTICHILD_DISCOUNT_RATE);
		} else if(discountType == 5) {
			totalPrice = (int)((double)totalPrice * ConstantClass.PREGNANT_DISCOUNT_RATE);
		}	
		return totalPrice;
	}
	int checkPrice(int type, int group) {
		int result = 0;	
		if (group == ConstantClass.BABY) {
			result= ConstantClass.BABY_PRICE;
		} else if (group == ConstantClass.SOIN) {
			if (type == 1) {
				result = ConstantClass.SOIN_A_PRICE;
			} else if (type == 2) {
				result = ConstantClass.SOIN_B_PRICE;
			} else if (type == 3) {
				result = ConstantClass.SOIN_C_PRICE;
			} else if (type == 4) {
				result = ConstantClass.SOIN_D_PRICE;
			}	
		} else if (group == ConstantClass.DAEIN) {
			if (type == 1) {
				result = ConstantClass.DAEIN_A_PRICE;
			} else if (type == 2) {
				result = ConstantClass.DAEIN_B_PRICE;
			} else if (type == 3) {
				result = ConstantClass.DAEIN_C_PRICE;
			} else if (type == 4) {
				result = ConstantClass.DAEIN_D_PRICE;
			}
		} 	
		return result;
	}
	int checkAgeGroup(int age) {
		int result = 0;
		if (age < ConstantClass.MIN_SOIN) {
			result = ConstantClass.BABY;
		} else if (age >= ConstantClass.MIN_SOIN && age <= ConstantClass.MAX_SOIN) {
			result = ConstantClass.SOIN;
		} else if (age >= ConstantClass.MIN_DAEIN && age <= ConstantClass.MAX_DAEIN) {
			result = ConstantClass.DAEIN;
		} else if (age >= ConstantClass.MIN_OLD){
			result = ConstantClass.SOIN;
		}
		return result;
	}

}
