package hospital;

import java.util.*;

public class Health_Info {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<String> Symptoms = new ArrayList<String>();
		List<Allergy> listOfAllergies = new ArrayList<Allergy>();
		Symptoms.add("Hives");
		Symptoms.add("rash");
		Allergy A1 = new Allergy("Drug_Allergy", AllergySeverity.MEDIUM, Symptoms);
		listOfAllergies.add(A1);
		Symptoms.clear();
		Symptoms.add("Hives");
		Symptoms.add("Digestive-Problems");
		Symptoms.add("Swollen-airways");
		Allergy A2 = new Allergy("Food_Allergy", AllergySeverity.SEVERE, Symptoms);
		listOfAllergies.add(A2);
		Boolean flag = true;
		System.out.println("Patient's Allergy Test");
		while(flag){
			System.out.println("Enter the Patient Details:");
			System.out.print("Patient Name: ");
			String name = sc.next();
			System.out.print("\nPatient Age: ");
			int age = sc.nextInt();
			System.out.print("\nPatient Gender: ");
			String gender = sc.next();
			Gender Gend ;
			switch(gender.toUpperCase()){
			case "MALE" : Gend = Gender.MALE;
							break;
			case "FEMALE" : Gend = Gender.FEMALE;
							break;
			default : Gend = Gender.UNKNOWN;
					
			}
			System.out.print("\nTemperature: ");
			int temp = sc.nextInt();
			System.out.print("\nReadAt: ");
			String readAt= sc.next();
			ReadingLocation rA;
			switch(readAt.toUpperCase()){
			case "MOUTH" : rA = ReadingLocation.MOUTH;
							break;
			case "EAR" : rA = ReadingLocation.EAR;
							break;
			default : rA = ReadingLocation.UNKNOWN;
			}
			System.out.print("Patient Symptom: ");
			String Sympt = sc.next();
			
			Temperature P1 = new Temperature(name, age, Gend, temp, rA);
			for (Allergy allergy : listOfAllergies) {
				if(allergy.getSymptoms().contains(Sympt)){
					System.out.println(P1.getPatientName()+" of age "+P1.getPatientAge()+" have "+allergy.getAllergyName());
				}
				else{
					System.out.println(P1.getPatientName()+" of age "+P1.getPatientAge()+" do not have any allergies");
				}
			}
			System.out.println("Want to test one more Patient : YES - 1 NO - 0");
			if(sc.nextInt()!=1){
				flag=false;
			}
		}
		sc.close();
	}
}
