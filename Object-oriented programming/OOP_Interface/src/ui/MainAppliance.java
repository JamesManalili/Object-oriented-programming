package ui;

import java.util.Scanner;

import domain.Appliance;
import domain.ElectricFan;
import domain.Printer;
import domain.Tv;
public class MainAppliance {

	public static void main(String[] args) {
		while(true){
            Scanner option = new Scanner(System.in);
            System.out.print( "Choose your appliance\n" +
                    "\t[1] Electric fan\n" +
                    "\t[2] TV\n" +
                    "\t[3] Printer\n" +
                    "Input your choice here: ") ;
            Integer choice = Integer.parseInt(option.next());

            Appliance appliance = new Appliance();
            switch(choice) {
                case 1 :  ElectricFan fan = new ElectricFan();
                               appliance.setApplianceID("A001");
                               fan.setNoOfSpeeds(5);
                               appliance.setSw(fan);
                                break;
                case 2:   Tv tv  =  new Tv();
                               appliance.setApplianceID("A002");
                               tv.setWithNetflix(true);
                               appliance.setSw(tv);
                                break;
                case 3:  Printer printer =  new Printer();
                              appliance.setApplianceID("A003");
                              appliance.setAppName(appliance.getClass().getSimpleName());
                              printer.setNoOfPrints(1000);
                              appliance.setSw(printer);
                              break;
                default: System.exit(0);
            }
            appliance.setAppName(appliance.getSw().getClass().getSimpleName());
            System.out.println(appliance.getAppName() + appliance.getSw().switchOn());
            turnOff(appliance);
        }
    }

    public static void turnOff(Appliance appliance){
        Scanner answer = new Scanner(System.in);
        System.out.print("Turn off? [y/n]");
        String yn = answer.next();
        if(yn.toUpperCase().equals("Y")) {
            System.out.println(appliance.getAppName()+ appliance.getSw().switchOff());
            System.exit(0);
        }
    }

	

}
