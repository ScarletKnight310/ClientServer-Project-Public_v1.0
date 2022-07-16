package gcs.project.Client;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public static void Display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        Label messageLabel = new Label(message);
        Button closeButton = new Button("OK");
        closeButton.setOnAction(e -> window.close());
        Scene alert = new Scene(new VBox(messageLabel,closeButton));
        window.setScene(alert);
        window.showAndWait();
    }
}
