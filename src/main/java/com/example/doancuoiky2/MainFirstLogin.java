package com.example.doancuoiky2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFirstLogin extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainFirstLogin.class.getResource("FirstLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 940, 600);

        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}