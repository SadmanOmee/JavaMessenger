package messenger;


import javafx.scene.Group;
import util.NetworkUtil;

public class ReadThreadServer implements Runnable {
    ServerController serverController;
    private Thread thr;
    private NetworkUtil nc;

    String s;



    public ReadThreadServer(NetworkUtil nc,ServerController s) {
        serverController=s;
        this.nc = nc;
        this.thr = new Thread(this);
       // serverText.setText(s);
        thr.start();

    }

    public void run() {
        try {
            while (true){
                s=(String)nc.read();

                serverController.textArea.appendText(s+"\n"+"\n");

            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}



