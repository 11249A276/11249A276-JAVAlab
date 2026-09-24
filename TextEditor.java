import java.io.*;

public class TextEditor {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("document.txt");
        fw.write("Hello Java\nWelcome to Text Editor");
        fw.close();

        FileReader fr = new FileReader("document.txt");
        int ch;

        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);

        fr.close();
    }
}