/*
 * Author: Megh Godbole
 * Date: December 08, 2024
 * Purpose: This is a MovieMembership class with few private properties, constructor utiliy, getter & setter methods.
 */

public abstract class MovieMembership {

    // Declear private class properties.
    private String memberName;
    private String nextMovie;
    private String theatreType;
    private String snack;
    private int showHour;
    private int showMinutes;
    private int points;

    // Created constructor with single param.
    MovieMembership(String memberName) {
        this.memberName = memberName;
        this.nextMovie = "unknown";
        this.theatreType = "standard";
        this.snack = "unknown";
        this.showHour = 0;
        this.showMinutes = 0;
        this.points = 0;
    }

    // Created constructor with six param.
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

    // Getter Method for member name.
    public String getMemberName() {
        return this.memberName;
    }

    // Getter Method for next movie.
    public String getNextMovie() {
        return this.nextMovie;
    }

    // Getter Method for points.
    public int getPoints() {
        return this.points;
    }

    // Getter Method for snack.
    public String getSnack() {
        return this.snack;
    }

    // Getter Method for theater type.
    public String getTheatreType() {
        return this.theatreType;
    }

    // Setter Method for next movie.
    public void setNextMovie(String nextMovie) {
        this.nextMovie = nextMovie;
    }

    // Setter Method for snack.
    public void setSnack(String snack) {
        this.snack = snack;
    }

    // Setter Method for theatre type.
    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }

    // Setter Method to set show time with provided hours and minutes.
    public void setShowtime(int hour, int minute) {
        this.showHour = hour;
        this.showMinutes = minute;
    }

    // This method will display the show time.
    public String displayShowTime() {
        return showHour + ":" + showMinutes;
    }

    // This method will add points.
    public void addPoints(int points) {
        this.points += points;
    }

    // This method will return the member details in formated string.
    public String getMemberDetails() {
        return "This membership card belongs to " + getMemberName() + ". They have " + getPoints()
                + " points. Their next movie is " + getNextMovie() + " at " + displayShowTime() + " with a "
                + getTheatreType() + " screening. They will be having " + getSnack() + " as a snack.";
    }


    // Abstract methods
    
    public abstract String returnMembershipRank();

    public abstract void printMemberBenefits();

    public abstract void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack);
}
