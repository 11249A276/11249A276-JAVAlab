import java.net.*;
import java.io.*;

class client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 5000);

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        pw.println("Hello Server");

        System.out.println("Message sent.");

        s.close();
    }
}

