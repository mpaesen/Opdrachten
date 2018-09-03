

import javax.swing.*;

public class TestIntrest {
    public static void main(String[] args){
        SamengesteldeIntrest samengesteldeIntrest;
        String input;
         double principal;
         double intrest;
         int years;

        do{
            principal= getValue("Principal: ");
            intrest= getValue("Intrest: ");
            years = (int) getValue("Years: ");
            samengesteldeIntrest = new SamengesteldeIntrest(principal, intrest, years);
            JOptionPane.showMessageDialog(null, samengesteldeIntrest.toString());
            input = JOptionPane.showInputDialog("Nieuwe berekening? (J/N): ");
        }while(Character.toUpperCase(input.charAt(0))=='J');
    }
    private static double getValue(String input){

        String localInput;
        boolean correctGetal = false;
        do{
            localInput = JOptionPane.showInputDialog(input);
            try{
                Double.parseDouble(localInput);
                correctGetal = true;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Geef een getal aub!");
                correctGetal = false;
            }

        }while (!correctGetal);
        return Double.parseDouble(localInput);
    }

}
