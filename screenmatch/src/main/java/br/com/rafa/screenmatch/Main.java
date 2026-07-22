package br.com.rafa.screenmatch;

import br.com.rafa.screenmatch.model.DataSerie;
import br.com.rafa.screenmatch.model.Episode;
import br.com.rafa.screenmatch.model.EpisodeData;
import br.com.rafa.screenmatch.model.SeasonData;
import br.com.rafa.screenmatch.service.ApiConsumption;
import br.com.rafa.screenmatch.service.ConvertsData;
import br.com.rafa.screenmatch.utils.Constant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private final Scanner scanner = new Scanner(System.in);
    private final ApiConsumption apiConsumption = new ApiConsumption();
    private final ConvertsData  convertsData = new ConvertsData();

    public void showMenu() {
        System.out.println("Enter the name of series to search");
        var seriesName = scanner.nextLine();
        String uri = Constant.URL_BASE + seriesName.replace(" ", "+") + Constant.KEY;
        var json = apiConsumption.getData(uri);
        DataSerie data = convertsData.execute(json, DataSerie.class);

        List<SeasonData> seasonDataList = new ArrayList<>();

        for (int i = 1; i < data.totalSeasons(); i++) {
            json = apiConsumption.getData(Constant.URL_BASE + seriesName.replace(" ", "+") + "&season=" + i + Constant.KEY);
            SeasonData seasonData = convertsData.execute(json, SeasonData.class);
            seasonDataList.add(seasonData);
        }
        seasonDataList.forEach(s -> s.episodes().forEach(e -> System.out.println(e.title())));

        List<EpisodeData>  episodeDataList = seasonDataList.stream()
                .flatMap(t -> t.episodes().stream())
                .collect(Collectors.toList());

        System.out.println("Top 5 Episodes:");
        episodeDataList.stream()
                .filter(e -> !e.rating().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(EpisodeData::rating).reversed())
                .limit(5)
                .forEach(System.out::println);

        List<Episode> episodes = seasonDataList.stream()
                .flatMap(sd -> sd.episodes().stream()
                        .map(e -> new Episode(sd.number(), e))
                )
                .collect(Collectors.toList());

        episodes.forEach(System.out::println);

        System.out.println("List of Episodes starting from ?");
        var year = scanner.nextInt();
        scanner.nextLine();

        LocalDate dateSearch = LocalDate.of(year, 1, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        episodes.stream()
                .filter(e -> e.getReleaseDate() != null && e.getReleaseDate().isAfter(dateSearch))
                .forEach(e -> System.out.printf("%s - %s - %s%n", e.getTitle(), formatter.format(e.getReleaseDate()), e.getSeason()));


    }

}
