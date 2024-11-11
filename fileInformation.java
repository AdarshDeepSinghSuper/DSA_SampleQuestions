import java.io.*;
public class fileInformation {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\as706\\Desktop\\Adarsh.txt");
        if(f.exists())
        {
            System.out.println("File name : "+f.getName());
            System.out.println("File Location : "+f.getAbsolutePath());
            System.out.println("File Writable : "+f.canWrite());
            System.out.println("File Readable : "+f.canRead());
            System.out.println("File Size : "+f.length());
        }
        else
        {
            System.out.println("File doesn't Exists");
        }
    }
    
}
