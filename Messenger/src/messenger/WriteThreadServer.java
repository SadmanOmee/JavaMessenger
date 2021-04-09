package messenger;


import java.util.*;
import util.NetworkUtil;

public class WriteThreadServer implements Runnable {

    ServerController sc;
    private Thread thr;
    private NetworkUtil nc;
    String name;

    public WriteThreadServer(NetworkUtil nc,String name,ServerController s) {
        sc=s;
        this.nc = nc;
        this.name=name;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            //Scanner input=new Scanner(System.in);
            while (true){
                //String s=input.nextLine();
                 sc.sent.setOnMouseClicked( event -> {
                     String s=sc.textField.getText();
                     nc.write(name+":"+ " "+s);
                 });

            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}



