package messenger;



import javafx.scene.Group;
import util.NetworkUtil;

public class ReadThreadClient implements Runnable {
    ClientController clientController;
    private Thread thr;
    private NetworkUtil nc;
    String s;



    public ReadThreadClient(NetworkUtil nc,ClientController s) {
        clientController=s;
        this.nc = nc;
        this.thr = new Thread(this);
        // serverText.setText(s);
        thr.start();

    }

    public void run() {
        try {
            while (true){
                s=(String)nc.read();
                clientController.textArea.appendText(s+ "\n"+"\n");
                //System.out.println(s);
            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}



