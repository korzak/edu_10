/**
 * Class "Main" Runing Programm
 * */

package ch.makery.address.model;
/**
 * Задача из учебника
 * http://code.makery.ch/library/javafx-8-tutorial/ru/part1/
 *TODO описать задачу. Расширить функциональность до работы с базой.
 *TODO Понять ограничения базы JAVA
 * */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
