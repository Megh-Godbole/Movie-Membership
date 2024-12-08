import java.util.Scanner;

public class GoldMember extends SilverMember implements VIPPrivilege {
    private boolean validCredentials;
    
    GoldMember(String memberName){
        super(memberName, 0.25, 2.0);
        validCredentials = false;
    }
    
    GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack){
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        validCredentials = false;
    }

    public String returnMembershipRank() {
        return "Gold";
    }

    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + " They have " + returnMembershipRank() + " membership. and VIP privileges.";
    }

    @Override
    public void accessVIPLounge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");
        int password = input.hasNextInt() ? input.nextInt() : 0;
        if(PASSWORD == password){
            validCredentials = true;
            System.out.println("Access granted!");
        } else{
            validCredentials = false;
            input.nextLine(); // Buffer;
        }
        input.close();
    }

    @Override
    public String purchaseAlcohol() {
        if(validCredentials){
            setSnack("alcohol");
            return "Enjoy your beverage";
        } else {
            return "Beverage cannot be purchased because no valid password has been entered.";
        }
    }
}
