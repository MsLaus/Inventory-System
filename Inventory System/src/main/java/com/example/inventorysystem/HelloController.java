package com.example.inventorysystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends Buttons implements Initializable {

    @FXML
    PieChart pieChart;

    @FXML
    LineChart lineChart;

    @FXML
    private Label nameLabel;

    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(NameHelper.Name);
        inLineChart();
        inPieChart();

    }

    private void inLineChart(){
        XYChart.Series series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data("Monday", 3));
        series.getData().add(new XYChart.Data("Tuesday", 10));
        series.getData().add(new XYChart.Data("Wednesday", 6));
        series.getData().add(new XYChart.Data("Thursday", 12));
        series.getData().add(new XYChart.Data("Friday", 6));
        lineChart.getData().addAll(series);

        lineChart.lookup(".chart-plot-background").setStyle("-fx-background-color: transparent;");
        series.getNode().setStyle("-fx-stroke: white;");

    }

    private void inPieChart(){
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Android", 10),
                new PieChart.Data("JavaFX", 20),
                new PieChart.Data("Java", 40),
                new PieChart.Data("C", 10),
                new PieChart.Data("React", 20));
        pieChart.setData(pieChartData);
    }

}