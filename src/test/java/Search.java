import java.io.*;

public class Search {

    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(
                new FileInputStream("C:\\Users\\srna\\Desktop\\QAtest\\QAtest.txt"), "UTF8");

        int countStrings = 0;
        int countLatin = 0;
        int countKir = 0;
        int readChars = 0;

        while ((readChars = reader.read()) != -1) {

            if (readChars == '\n') {
                ++countStrings;
            }
            if (readChars == 'а') {
                ++countKir;
            }
            if (readChars == 'a') {
                ++countLatin;
            }
        }

        System.out.println(countStrings + " = количество строк");
        System.out.println(countLatin + " = а латинское");
        System.out.println(countKir + " = a кириллица");
        System.out.println(countKir + countLatin + " = a");

        reader.close();

    }
}
