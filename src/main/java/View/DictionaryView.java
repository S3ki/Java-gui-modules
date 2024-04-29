package View;

import Controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    @Override
    public void start(Stage primaryStage) {
        DictionaryController controller = new DictionaryController();

        TextField searchField = new TextField();
        searchField.setPromptText("Enter a word to search");

        Button searchButton = new Button("Search");
        Label resultLabel = new Label();

        // Event handling for the search button
        searchButton.setOnAction(e -> {
            String word = searchField.getText();
            if (word == null || word.isEmpty()) {
                resultLabel.setText("Please enter a word to search.");
            } else {
                String meaning = controller.searchWord(word);
                resultLabel.setText(meaning);
            }
        });

        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.getChildren().addAll(searchField, searchButton, resultLabel);

        Scene scene = new Scene(flowPane, 400, 200);

        primaryStage.setTitle("Virtual Dictionary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
