public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "O Filme 1";
        movie.year = 2023;

        movie.showTechnicalSheet();

        movie.submitRating(9);
        movie.submitRating(5);
        movie.submitRating(10);

        System.out.println(movie.getAverageRating());

    }
}
