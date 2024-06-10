package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();

        Button submitButton = new Button("Confirmar selección");

        submitButton.setOnAction(e -> {
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "No seleccionada";
            Color selectedColor = colorPicker.getValue();
            String colorString = selectedColor != null ? selectedColor.toString() : "No seleccionado";

            System.out.println("Fecha seleccionada: " + selectedDate);
            System.out.println("Color seleccionado: " + colorString);
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, submitButton);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("Seleccionador de Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}