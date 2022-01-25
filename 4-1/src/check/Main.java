package check;

import constants.Constants;

public class Main {

	static private String firstName;
	static private String lastName;

	private static void printName( String firstName,String lastName) {

		firstName = "大熊";
		lastName = "泰世";

		System.out.println("printNameメソッド → " + firstName + lastName);

	}

	public static void main(String[] args) {

		printName(firstName,lastName);
		
		Pet Pet= new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE); 

		Pet.introduce();
	
		RobotPet RobotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		RobotPet.introduce();

	}

}
