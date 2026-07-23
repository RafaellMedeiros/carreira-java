package br.com.exemplo;

import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label title = new Label("Primeira Aplicação");
        Label message = new Label("Olá, JavaFX!");
        Button button = new Button("+");
        Font font = new Font("Arial", 20);
        button.setFont(font);
        Label count = new Label("0");


        button.setOnAction(e -> {
            count.setText(String.valueOf(Integer.parseInt(count.getText()) + 1));
        });
        VBox root = new VBox();
        root.setSpacing(8);
        root.getChildren().addAll(title, message, button, count);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Meu Primeiro App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}