package ui;

import java.util.Scanner;

import domain.Appliance;
import domain.ElectricFan;
import domain.Tv;
import domain.Printer;
public class MainAppliance {

	public static void main(String[] args) {
		while (true) {
			Scanner option = new Scanner(System.in);
			System.out.print("Choose your Appliance \n" + "[1] Electric fan \n" + "[2] TV\n" + "[3] Printer\n"
					+ "Input your choice here: ");
			int choice = Integer.parseInt(option.next());

			Appliance appliance = null;
			switch (choice) {
			case 1: appliance =  new ElectricFan("A001", "Electric Fan");
				//appliance.setApplianceID("A001");
				//appliance.setAppName(appliance.getClass().getSimpleName());
				((ElectricFan) appliance).setNoOfSpeed(5);//casting
				System.out.println(appliance.getClass().getSimpleName() + appliance.switchOn());
				turnoff(appliance);
				break;
			default:
				System.exit(0);

			case 2:
				appliance =  new Tv("A002", "TV");
				//appliance.setApplianceID("A002");
				//appliance.setAppName(appliance.getClass().getSimpleName());
				((Tv) appliance).setWithNetflix(true);
				System.out.println(appliance.getClass().getSimpleName() + appliance.switchOn());
				turnoff(appliance);
				break;
				
			case 3:
				appliance =  new Printer("A003", "Printer");
				//appliance.setApplianceID("A002");
				//appliance.setAppName(appliance.getClass().getSimpleName());
				((Printer) appliance).setNoOfPrints(1000);
				System.out.println(appliance.getClass().getSimpleName() + appliance.switchOn());
				turnoff(appliance);
				break;		
			}
		}
	}

	public static void turnoff(Appliance appliance) {
		Scanner answer = new Scanner(System.in);
        System.out.print("Turn off? [y/n]");
        String yn = answer.next();
        System.out.println();
        if(yn.toUpperCase().equals("Y")) {
            System.out.println(appliance.getAppName()+ appliance.switchoff());
            System.exit(0);
        }
	}

}
