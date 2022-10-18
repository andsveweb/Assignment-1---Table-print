/**
This program calculate charging time for electric car with different current and volatage.
* 1. setting variables.
* 2. Calculating effect for 230v in variable.
* 3. Calculating effect for 400v in variable.
* 4. Printing out text and battery power.
* 5. Printing out different columns with the right effect and rounding to two decimals.
* @author Andreas Svensson, sevane-2
*/

import java.lang.Math;
class Main {
    public static void main(String[] args) {
        // Setting variables
        double battery = 35.8;
    
        double currentA = 10;
        double currentB = 16;
        double currentC = 32;
    
        double voltageA = 230;
        double voltageB = 400;
    
        double effectA = currentA * voltageA / 1000;
        double effectB = currentB * voltageA / 1000;
        double effectC = Math.sqrt(3) * (currentA * voltageB / 1000);
        double effectD = Math.sqrt(3) * (currentB * voltageB / 1000);
        double effectE = Math.sqrt(3) * (currentC * voltageB / 1000);

        // Printing out table name (kwh)
        System.out.print("Battery " + battery + "(kWh)");
        // Printing table head names
        System.out.print("\n\nStröm(A)\t" + "Spänning(V)\t\t" + "Laddeffekt(kW)\t\t" + "Laddningstid(h) ");
        // Printing out line
        System.out.print("\n===============================================================");
        // Printing out different section in table
        System.out.print("\n" + Math.round(currentA) + "\t\t\t" + Math.round(voltageA) + "\t\t\t\t" + 
                effectA + "\t\t\t\t\t" + Math.round(battery / ((currentA *     
                voltageA / 1000))* 100.0) / 100.0);
        System.out.print("\n" + Math.round(currentB) + "\t\t\t" + Math.round(voltageA) + "\t\t\t\t" + 
                effectB + "\t\t\t\t" + Math.round(battery / ((currentB * 
                voltageA / 1000))* 100.0) / 100.0);
        System.out.print("\n" + Math.round(currentA) + "\t\t\t" + Math.round(voltageB) + "\t\t\t\t" + 
                Math.round(effectC * 100) / 100.0 + "\t\t\t\t" + 
                Math.round((battery / effectC) * 100) / 100.0);
        System.out.print("\n" + Math.round(currentB) + "\t\t\t" + Math.round(voltageB) + "\t\t\t\t" + 
                Math.round(effectD * 100) / 100.0 + "\t\t\t\t" + 
                Math.round((battery / effectD) * 100) / 100.0);
        System.out.print("\n" + Math.round(currentC) + "\t\t\t" + Math.round(voltageB) + "\t\t\t\t" + 
                Math.round(effectE * 100) / 100.0 + "\t\t\t\t" + 
                Math.round((battery / effectE) * 100) / 100.0);
    }
}