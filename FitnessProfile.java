import java.io.*;

public class FitnessProfile {
    public static void main(String[] args) throws Exception {
        String data = "Name: Arun\nAge: 21\nWeight: 65kg";

        FileOutputStream out = new FileOutputStream("profile.txt");
        out.write(data.getBytes());
        out.close();

        FileInputStream in = new FileInputStream("profile.txt");
        int ch;

        while ((ch = in.read()) != -1)
            System.out.print((char) ch);

        in.close();
    }
}