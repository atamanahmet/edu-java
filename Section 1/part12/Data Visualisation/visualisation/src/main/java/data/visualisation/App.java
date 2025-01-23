package data.visualisation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {
        List<String> lines = new ArrayList<>();
        List<Integer> years = new ArrayList<>();
        List<String> votes = new ArrayList<>();
        List<String> bufferArray;

        readData(lines);

        bufferArray = Arrays.asList(lines.get(0).split("\t"));
        bufferArray.stream().filter(line -> line.matches("\\d{4}")).forEach(year -> years.add(Integer.valueOf(year)));

        System.out.println(years);

        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        xAxis.setLabel("X Axis-Year");
        yAxis.setLabel("Y Axis-Percent");

        lineChart.setTitle("Line Chart Test");

        XYChart.Series<Number, Number> dataSeries = new XYChart.Series<>();

        dataSeries.getData().add(new XYChart.Data<>(20, 10));
        dataSeries.getData().add(new XYChart.Data<>(30, 30));
        dataSeries.getData().add(new XYChart.Data<>(50, 10));
        dataSeries.getData().add(new XYChart.Data<>(50, 20));

        lineChart.getData().add(dataSeries);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(lineChart);
        borderPane.setTop(new Label(lineChart.getTitle()));

        Scene scene = new Scene(borderPane);

        window.setScene(scene);
        window.show();
    }

    public void readData(List<String> lines) {
        try {
            BufferedReader buffread = new BufferedReader(new FileReader("data.txt"));
            // System.out.println(buffread);
            buffread.lines().forEach(line -> lines.add(line));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}