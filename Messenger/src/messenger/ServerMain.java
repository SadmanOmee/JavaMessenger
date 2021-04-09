package messenger;



import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.NetworkUtil;


public class ServerMain extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root=new Group();
        primaryStage.setTitle("Server");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        ServerController s = new ServerController(root);

        new Server(s);
        }

    public static void main(String[] args) throws InterruptedException {
        launch(args);
    }

    }

