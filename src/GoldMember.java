/*
 * Author: Megh Godbole
 * Date: December 08, 2024
 * Purpose: This is a GoldMember class with few private properties, constructor utiliy, getter & setter methods.
 */

import java.util.Scanner;

public class GoldMember extends SilverMember implements VIPPrivilege {

    // Declear private class properties.
    private boolean validCredentials;

    // Created constructor with single param.
    GoldMember(String memberName) {
        super(memberName, 0.25, 2.0);
        validCredentials = false;
        addPoints(50);
    }

    // Created constructor with six param.
    GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack, 0.25, 2.0);
        validCredentials = false;
        addPoints(50);
    }

    // This method will return the member ship rank.  
    public String returnMembershipRank() {
        return "Gold";
    }

    // This method will override and append membership details to the parent method which return the member details.
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + " and VIP privileges.";
    }

    // This abstract method will verify the VIP lounge access from user with provide password. 
    @Override
    public void accessVIPLounge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");
        int password = input.hasNextInt() ? input.nextInt() : 0;
        if (PASSWORD == password) {
            validCredentials = true;
            System.out.println("Access granted!");
        } else {
            validCredentials = false;
            input.nextLine(); // Buffer;
        }
        input.close();
    }

    // This abstract method will allow to alcohol if credentials matchs. 
    @Override
    public String purchaseAlcohol() {
        if (validCredentials) {
            setSnack("alcohol");
            return "Enjoy your beverage";
        } else {
            return "Beverage cannot be purchased because no valid password has been entered.";
        }
    }
}
