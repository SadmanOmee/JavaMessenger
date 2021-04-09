package messenger;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.NetworkUtil;

import java.io.Reader;
import java.util.Scanner;

public class ClientMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root=new Group();
        primaryStage.setTitle("Client");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        ClientController cc =new ClientController(root);
        new Client(cc);

    }

    public static void main(String[] args) {
        launch(args);

    }
}
