package br.com.rafa.moveis.models;

public class Title {

    private String name;
    private int year;
    private int durationInMinutes;
    private boolean isAvailableInPlan;
    private double totalRating;

    public Title() {
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.year = Integer.parseInt(myTitleOmdb.year());
        this.durationInMinutes = Integer.parseInt(myTitleOmdb.runtime().substring(0,2));
    }

    public void setAvailableInPlan(boolean availableInPlan) {
        isAvailableInPlan = availableInPlan;
    }

    public boolean isAvailableInPlan() {
        return isAvailableInPlan;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    private int ratingCount;

    public void showTechnicalSheet() {
        String mensageDuration = String.format("Duração: %sm", durationInMinutes);

        System.out.println("Filme: " + name);
        System.out.println("Ano: " + year);
        System.out.println(mensageDuration);
    }

    public void submitRating(double rating) {
        totalRating += rating;
        ratingCount++;
    }

    public double getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return totalRating / ratingCount;
    }

    @Override
    public String toString() {
        return "Title{" + "noma=" + name + ", ano="  + year + ", duration=" + durationInMinutes + ", rating=" + ratingCount + '}';
    }
}
