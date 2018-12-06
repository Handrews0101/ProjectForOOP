import java.io.FileReader;

public class ProcessFilesDriver {
    public static void main(String[] args){
/*        ProcessFiles p = new ProcessFiles();

        try{
            p.WriteFile();
        } catch (Exception ex) {
            System.out.println("Could not write");
        } 
        
*/

        // pass the path to file as a parameter
        try {
            FileReader fr =
                    new FileReader("C:\\LineTests\\TestResults.txt");


            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
        } catch (Exception ex) {
            System.out.println("File reader didn't work");
        }
    }
}
