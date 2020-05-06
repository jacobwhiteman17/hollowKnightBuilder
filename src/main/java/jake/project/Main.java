package jake.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        var loc = getClass().getResource("Builder.fxml");
        try{
            root = FXMLLoader.load(loc);
        }catch (IOException e) {
            System.out.println("Where is the FXML file?");
        }
        Scene windowContents = new Scene(root,1600,1024);
        primaryStage.setScene(windowContents);
        primaryStage.setTitle("Hollow Knight Build Creator");
        //primaryStage.show();
    }
}
