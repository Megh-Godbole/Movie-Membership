public class IMAXMember extends MovieMembership {
    private double discountRate;
    private double pointsRate;

    IMAXMember(String memberName){
        super(memberName);
        this.discountRate = 0.5;
        this.pointsRate = 1.3;
    }

    IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack){
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
    }

    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + " They have " + returnMembershipRank() + " membership.";
    }

    @Override
    public void printMemberBenefits() {
        System.out.println("Discount rate = " + this.discountRate + "%\nPoints gained per dollar = " + this.pointsRate);
    }

    @Override
    public String returnMembershipRank() {
        return "IMAX";
    }

    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack) {
        setNextMovie(nextMovie);
        setShowtime(showHour, showMinute);
        setTheatreType(theatreType);
        setSnack(snack);
        double priceWithDiscount = theatreType.equals("IMAX") ? ticketPrice * (1 - this.discountRate) : 0;
        int pointsEarned = theatreType.equals("IMAX") ? (int) (ticketPrice * this.pointsRate) : 0;
        addPoints(pointsEarned);
        System.out.println(
                "The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for "
                        + priceWithDiscount + " and will be showing at " + displayShowTime() + " with "
                        + getTheatreType() + " screening. They have earned " + pointsEarned + " points");
    }
}
