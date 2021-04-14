package ch.juventus.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LayoutController {

  @FXML public Label helloMessageLabel;

  @FXML public TextField nameInput;

  @FXML
  public void onClick(ActionEvent actionEvent) {
    helloMessageLabel.setText(
        String.format("Submit button pressed, name is %s", nameInput.getText()));
  }
}
