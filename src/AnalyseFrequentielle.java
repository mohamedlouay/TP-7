import java.io.*;
import java.util.Arrays;


public class AnalyseFrequentielle {


    public static double moyenne(int []t)
    {
        double res=0;
        for (int i=0;i<t.length;i++)
        {
            res+=t[i];
        }
        return res;
    }

    public static void compterOccurence(char c,int[] t){

        char[] tab = new char[26];
        for (int i=0; i<26;i++)
        {
            tab[i]=(char)(65+i);
        }
         for (int j=0;j<26;j++)
         {
             if (tab[j]==c)
             {
                 t[j]++;
             }
         }
    }

    public static void main(String[] args) throws IOException
    {

        String line;
        int [] listeocurrance = new int[26];
        double [] listetaux = new double[26];
        BufferedReader lecteur = new BufferedReader(new FileReader(args[0]));
        while ((line = lecteur.readLine()) != null)
        {
            for (int i=0 ;i<line.length (); i++)
            {
                compterOccurence(line.charAt(i),listeocurrance);
            }
        }
        double m=moyenne(listeocurrance);
        for (int i=0;i<listeocurrance.length;i++)
        {
            listetaux[i]=listeocurrance[i]/m;
        }

        System.out.println(Arrays.toString((listeocurrance)));
        System.out.println(Arrays.toString((listetaux)));

        File file =new File("C://Users//saide//Desktop/resultat.csv");
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
            FileWriter csv = new FileWriter(file);
            csv.append("caractere");
            csv.append(";");
            csv.append("Ocurrence");
            csv.append(";");
            csv.append("taux de presence");
            csv.append("\n");
            for (int i=0;i<26;i++)
            {
                csv.append(String.join(";",Character.toString((char)(65+i)),String.valueOf(listeocurrance[i]),String.valueOf(listetaux[i])));
                csv.append("\n");

            }
            csv.close();
        }


    }
}
