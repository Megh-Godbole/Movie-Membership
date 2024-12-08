public class SilverMember extends MovieMembership {
    private double discountRate;
    private double pointsRate;

    SilverMember(String memberName) {
        super(memberName);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    SilverMember(String memberName, double discountRate, double pointsRate) {
        super(memberName);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack,
            double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + ". They have " + returnMembershipRank() + " membership.";
    }

    public void printMemberBenefits() {
        System.out.println("Discount rate = " + this.discountRate + "%\nPoints gained per dollar = " + this.pointsRate);
    }

    public String returnMembershipRank() {
        return "Silver";
    }

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
