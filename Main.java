package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.Scanner;

public class Main extends Application {
    public File mainDirectory;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Spam master 3000");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setInitialDirectory(new File("."));
        mainDirectory = directoryChooser.showDialog(primaryStage);
        System.out.println(mainDirectory.getPath());

    }


    public static void main(String[] args) {

        launch(args);
    }
}
