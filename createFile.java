import java.io.*;

public class createFile {
    public static void main(String[] args) {
        // Specify the file path
        File f = new File("C:\\Users\\as706\\Desktop\\Adarsh.txt");

        try {
            // Attempt to create the file
            if (f.createNewFile()) {
                System.out.println("New file created successfully...!!!");
            } else {
                System.out.println("File already exists...!!!");
            }
        } catch (IOException e) {
            // Handle exceptions related to file I/O
            e.printStackTrace();
        }
    }
}
