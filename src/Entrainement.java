import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Entrainement {

    public static void main(String[] args) throws IOException
    {
        File folder = new File("C://Users//saide//Desktop/dossier1/");
        File file =new File("C://Users//saide//Desktop/doc.txt");


        if (!folder.exists())
        {
            folder.mkdir();
        }



        if(!file.exists())
        {
            try{
                file.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();

            }
        }

        else
        {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter((writer));
            bw.write("salut tt le monde");
            bw.newLine();
            bw.write("ca va?");
            bw.newLine();
            bw.write("test!");
            bw.write("test termial");
            bw.close();
            writer.close();

        }
    }



}
