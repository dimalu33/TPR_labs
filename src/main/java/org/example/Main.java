package org.example;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[] xData = new double[] {0.0, 1.0, 2.0, 3.0, 4.0};
        double[] yData = new double[] {2.0, 1.0, 0.0, 1.0, 2.0};

        // Створення графіка
        XYChart chart = new XYChartBuilder()
                .width(800)
                .height(600)
                .title("Простий графік")
                .xAxisTitle("X")
                .yAxisTitle("Y")
                .build();

        // Налаштування стилю
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);

        // Додавання серії даних
        chart.addSeries("y = x^2 - 2x", xData, yData);

        // Відображення
        new SwingWrapper<>(chart).displayChart();
    
        System.out.printf("Hello and welcome!");

    }
}