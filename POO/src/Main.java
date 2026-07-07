import br.com.rafa.moveis.View;
import br.com.rafa.moveis.interfaces.Language;
import br.com.rafa.moveis.models.Movie;
import br.com.rafa.moveis.models.Serie;
import br.com.rafa.moveis.utils.Calculator;

public class Main {
    public static void main(String[] args) {
        Movie matrix = new Movie();
        matrix.setName("The Matrix");
        matrix.setDurationInMinutes(135);
        matrix.setYear(1999);
        matrix.setAvailableInPlan(true);

        Movie johnWick = new Movie();
        johnWick.setName("John Wick");
        johnWick.setDurationInMinutes(101);
        johnWick.setYear(2014);
        johnWick.setAvailableInPlan(false);
        johnWick.setLanguage(Language.PT_BR);

        Serie laCasaDePapel = new Serie();
        laCasaDePapel.setName("Lá Casa de Papel");
        laCasaDePapel.setMinutesPerEpisodes(45);
        laCasaDePapel.setYear(2017);
        laCasaDePapel.setAvailableInPlan(false);
        laCasaDePapel.setActive(true);
        laCasaDePapel.setSeason(5);
        laCasaDePapel.setEpisodesPerSeason(10);

        Calculator calculator = new Calculator();
        calculator.incluid(matrix);
        calculator.incluid(johnWick);
        calculator.incluid(laCasaDePapel);

        System.out.println(calculator.getTotalTime());

        View view = new View(johnWick);
        view.showTitle();

    }
}
