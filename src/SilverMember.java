/*
 * Author: Megh Godbole
 * Date: December 08, 2024
 * Purpose: This is a SilverMember class with few private properties, constructor utiliy, getter & setter methods.
 */

public class SilverMember extends MovieMembership {

    // Declear private class properties.
    private double discountRate;
    private double pointsRate;

    // Created constructor with single param.
    SilverMember(String memberName) {
        super(memberName);

        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    // Created constructor with three param.
    SilverMember(String memberName, double discountRate, double pointsRate) {
        super(memberName);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    // Created constructor with six param.
    SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    // Created constructor with eight param.
    SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack,
            double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    // This method will override and append membership details to the parent method which return the member details.
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + " They have " + returnMembershipRank() + " membership.";
    }

    // This override method will print the member benefits.  
    @Override
    public void printMemberBenefits() {
        System.out.println(
                "Discount rate = " + (this.discountRate * 100) + "%\nPoints gained per dollar = " + this.pointsRate
                        + "\n");
    }

    // This method will return the member ship rank.  
    public String returnMembershipRank() {
        return "Silver";
    }

    // This method will purchase movie ticket and print the details.  
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack) {
        setNextMovie(nextMovie);
        setShowtime(showHour, showMinute);
        setTheatreType(theatreType);
        setSnack(snack);
        double priceWithDiscount = ticketPrice * (1 - this.discountRate);
        int pointsEarned = (int) (ticketPrice * this.pointsRate);
        addPoints(pointsEarned);
        System.out.println(
                "The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for "
                        + priceWithDiscount + " and will be showing at " + displayShowTime() + " with "
                        + getTheatreType() + " screening. They have earned " + pointsEarned + " points");
    }
}
