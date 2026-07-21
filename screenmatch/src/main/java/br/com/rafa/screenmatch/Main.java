package br.com.rafa.screenmatch;

import br.com.rafa.screenmatch.model.DataSerie;
import br.com.rafa.screenmatch.model.SeasonData;
import br.com.rafa.screenmatch.service.ApiConsumption;
import br.com.rafa.screenmatch.service.ConvertsData;
import br.com.rafa.screenmatch.utils.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private ApiConsumption apiConsumption = new ApiConsumption();
    private ConvertsData  convertsData = new ConvertsData();

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
    }

}
