package it.develhope.streams;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Start
{
    public static void main(String[] args) throws IOException
    {
        File documento = new File("src/file.txt");
        if (documento.exists())
        {
            System.out.println("file already exists.");
        }
        else
        {
            System.out.println("The file does not exist and will be created.");
        }
        System.out.println("--------------------------------------------------");
        FileWriter writer = new FileWriter(documento);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        writer.write(now.format(formatter));
        writer.close();
        System.out.println("The date-time with seconds has been written");
    }
}
