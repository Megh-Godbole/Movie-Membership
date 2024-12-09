/*
 * Author: Megh Godbole
 * Date: December 08, 2024
 * Purpose: This is a public class IMAXMember extends MovieMembership {
 */

public class IMAXMember extends MovieMembership {

    // Declear private class properties.
    private double discountRate;
    private double pointsRate;

    // Created constructor with single param.
    IMAXMember(String memberName) {
        super(memberName);
        this.discountRate = 0.5;
        this.pointsRate = 1.3;
        addPoints(25);
    }

    // Created constructor with six param.
    IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = 0.5;
        this.pointsRate = 1.3;
        addPoints(25);
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
    @Override
    public String returnMembershipRank() {
        return "IMAX";
    }

    // This method will purchase movie ticket and print the details.  
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack) {
        setNextMovie(nextMovie);
        setShowtime(showHour, showMinute);
        setTheatreType(theatreType);
        setSnack(snack);
        double priceWithDiscount = theatreType.equals("IMAX") ? ticketPrice * (1 - this.discountRate) : ticketPrice;
        int pointsEarned = theatreType.equals("IMAX") ? (int) (ticketPrice * this.pointsRate) : 0;
        addPoints(pointsEarned);
        System.out.println(
                "The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for "
                        + priceWithDiscount + " and will be showing at " + displayShowTime() + " with "
                        + getTheatreType() + " screening. They have earned " + pointsEarned + " points");
    }
}
