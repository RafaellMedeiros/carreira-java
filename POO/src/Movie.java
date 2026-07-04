import java.util.Formattable;

public class Movie {
    String name;
    int year;
    int durationInMinutes;
    boolean isAvailableInPlan;
    double totalRating;
    int ratingCount;

    void showTechnicalSheet() {
        String mensageDuration = String.format("Duração: %sm", durationInMinutes);

        System.out.println("Filme: " + name);
        System.out.println("Ano: " + year);
        System.out.println(mensageDuration);
    }

    void submitRating(double rating) {
        totalRating += rating;
        ratingCount++;
    }

    double getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return totalRating / ratingCount;
    }
}
