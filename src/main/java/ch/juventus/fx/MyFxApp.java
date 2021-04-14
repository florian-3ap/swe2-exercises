package ch.juventus.fx;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFxApp extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    VBox root =
        FXMLLoader.load(
            new URL(
                "file:/Users/floriannapflin/Development/workspace/swe2-exercises/src/main/java/ch/juventus/fx/layout.fxml"));

    Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());
    stage.setTitle("Exercise1");
    stage.setScene(scene);
    stage.show();
  }
}
