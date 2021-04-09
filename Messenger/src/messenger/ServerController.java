package messenger;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.*;

public class ServerController{

    public Button btn;
    Button sent;
    public TextArea textArea;
    public TextField textField;


    ServerController(Group root){
        btn=new Button("Start");
        btn.setLayoutX(220);
        btn.setLayoutY(450);
        btn.setPrefWidth(60);

        sent=new Button("Send");
        sent.setLayoutX(415);
        sent.setLayoutY(340);
        sent.setPrefHeight(60);
        sent.setPrefWidth(80);

        textArea=new TextArea();
        textArea.setLayoutX(20);
        textArea.setLayoutY(10);
        textArea.setPrefWidth(470);
        textArea.setPrefHeight(300);
        textArea.setEditable(false);

        textField=new TextField();
        textField.setLayoutX(20);
        textField.setLayoutY(320);
        textField.setPrefWidth(380);
        textField.setPrefHeight(100);

        root.getChildren().addAll(btn,textArea,textField,sent);
    }
    ServerController(){

    }

}
