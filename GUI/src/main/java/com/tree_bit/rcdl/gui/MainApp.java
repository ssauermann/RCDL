package com.tree_bit.rcdl.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("RCDL - Redstone Circuitry Description Language");

        this.initRootLayout();

        this.showEditingWindow();
    }

    private void showEditingWindow() {
        try {
            // Load person overview.
            final FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("EditingWindow.fxml"));
            final AnchorPane personOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            this.rootLayout.setCenter(personOverview);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private void initRootLayout() {
        try {
            // Load root layout from fxml file.
            final FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            this.rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            final Scene scene = new Scene(this.rootLayout);
            this.primaryStage.setScene(scene);
            this.primaryStage.show();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Returns the main stage.
     *
     * @return
     */
    public Stage getPrimaryStage() {
        return this.primaryStage;
    }
}
