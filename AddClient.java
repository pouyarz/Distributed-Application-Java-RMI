import java.rmi.*;

public class AddClient {

    public static void main(String args[]) {
        try {
            String addServerURL = "rmi://" + args[0] + "/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);
            System.out.println("Dimension of Matrix: " + args[1]);
            double d = Double.valueOf(args[1]);
            System.out.println(addServerIntf.Matrix(d));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
