public abstract class MovieMembership {
    private String memberName;
    private String nextMovie;
    private String theatreType;
    private String snack;
    private int showHour;
    private int showMinutes;
    private int points;

    MovieMembership(String memberName) {
        this.memberName = memberName;
        this.nextMovie = "unknown";
        this.theatreType = "standard";
        this.snack = "unknown";
        this.showHour = 0;
        this.showMinutes = 0;
        this.points = 0;
    }

    MovieMembership(String memberName, String nextMovie, String theatreType, int showHour, int showMinute,
            String snack) {
        this.memberName = memberName;
        this.nextMovie = nextMovie;
        this.theatreType = theatreType;
        this.showHour = showHour;
        this.showMinutes = showMinute;
        this.snack = snack;
        this.points = 0;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public String getNextMovie() {
        return this.nextMovie;
    }

    public int getPoints() {
        return this.points;
    }

    public String getSnack() {
        return this.snack;
    }

    public String getTheatreType() {
        return this.theatreType;
    }

    public void setNextMovie(String nextMovie) {
        this.nextMovie = nextMovie;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }

    public void setShowtime(int hour, int minute) {
        this.showHour = hour;
        this.showMinutes = minute;
    }

    public String displayShowTime() {
        return showHour + ":" + showMinutes;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public String getMemberDetails() {
        return "This membership card belongs to " + getMemberName() + ". They have " + getPoints()
                + " points. Their next movie is " + getNextMovie() + " at " + displayShowTime() + " with a "
                + getTheatreType() + " screening. They will be having " + getSnack() + " as a snack.";
    }

    public abstract String returnMembershipRank();

    public abstract void printMemberBenefits();

    public abstract void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack);
}
