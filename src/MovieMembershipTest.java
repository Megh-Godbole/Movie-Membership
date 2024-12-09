/*
 * Author: Megh Godbole
 * Date: December 08, 2024
 * Purpose: This program Test the Class Hierarchy of movie membership classes.
 */

public class MovieMembershipTest {
    public static void main(String[] args) throws Exception {

        // Testing Step 1 - Create eache type object.
        SilverMember mySilver = new SilverMember("James Kelly", " Sonic The Hedgehog", "standard", 14, 30,
                "gummy bears");
        GoldMember myGold = new GoldMember("Richie Rich", "Wolf on Wallstreet", "standard", 18, 45, "popcorn");
        IMAXMember myIMAX = new IMAXMember("David Stu", "March of the Penguins", "IMAX", 10, 0, "nachos");

        // Testing Step 2 - Create parent type array and append the above objects.
        MovieMembership[] movieMembershipArray = new MovieMembership[3];
        movieMembershipArray[0] = mySilver;
        movieMembershipArray[1] = myGold;
        movieMembershipArray[2] = myIMAX;

        // Testing Step 3 - loop through array and test each methods.
        for (MovieMembership movieMembership : movieMembershipArray) {
            System.out.println("Member Name: " + movieMembership.getMemberName());
            System.out.println("Member Rank: " + movieMembership.returnMembershipRank());
            System.out.println("Points: " + movieMembership.getPoints());
            System.out.println("Next Movie: " + movieMembership.getNextMovie());
            System.out.println("Theatre type: " + movieMembership.getTheatreType());
            System.out.println("Showtime: " + movieMembership.displayShowTime());
            System.out.println("Snack: " + movieMembership.getSnack());
            System.out.println(movieMembership.getMemberDetails());
            movieMembership.printMemberBenefits();
        }

        // Testing Step 4 - loop and test purchase movie ticket method.
        for (MovieMembership movieMembership : movieMembershipArray) {
            movieMembership.purchaseMovieTicket(6.99, "The Matrix 4", "standard", 11, 25, null);
            movieMembership.setSnack("Sour Keys");
            System.out.println(movieMembership.getMemberDetails() + "\n");
        }

        // Testing Step 5 - Check for password.
        myGold.accessVIPLounge();

        // Testing Step 6 - Test purchase alcohol method.
        System.out.println(myGold.purchaseAlcohol());
        System.out.println(myGold.getMemberDetails() + "\n");

        // Testing Step 7 - Test purchaseMovieTicket on silver class.
        mySilver.purchaseMovieTicket(7.89, "Suicide Squad", "standard", 14, 25, "Smarties");

        // Testing Step 8 - Test purchaseMovieTicket on gold class.
        myGold.purchaseMovieTicket(15.98, "The Big Short", "standard", 13, 50, "Kitkat");

        // Testing Step 9 - Test purchaseMovieTicket on imax class.
        myIMAX.purchaseMovieTicket(14.50, "Godzilla vs Kong", "IMAX", 15, 0, "Gummies");

        // Testing Step 10 - Print each member details.
        System.out.println("\n" + mySilver.getMemberDetails() + "\n");
        System.out.println(myGold.getMemberDetails() + "\n");
        System.out.println(myIMAX.getMemberDetails() + "\n");
    }
}
