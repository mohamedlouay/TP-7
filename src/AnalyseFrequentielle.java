import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class AnalyseFrequentielle {

    private static Object StringUtils;

    public static void main(String[] args) throws IOException {

        String line;
        BufferedReader lecteur = new BufferedReader(new FileReader(args[0]));
        while ((line = lecteur.readLine()) != null) {
            for (int i = 65; i < 91; i++) {
                //int count = line.length() - line.replace((char) i, ' ').length();
                //System.out.println((char) i + "  est present:  " + count);
                int stringTokenizer = new StringTokenizer(" " +line + " ", "A").countTokens()-1;
                System.out.println("stringTokenizer = " + stringTokenizer);

            }

        }
    }
}
