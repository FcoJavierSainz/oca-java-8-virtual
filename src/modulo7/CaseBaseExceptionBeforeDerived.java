package modulo7;

import java.io.*;
public class CaseBaseExceptionBeforeDerived {
    public static void main(String args[]) {
        FileInputStream fis = null;
        String name = null;
        try {
            fis = new FileInputStream("file.txt");
            fis.close();
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("file not found");
        }
        catch (IOException e) {
            System.out.println("IOException");
        }
        finally {
          name.length(); // Null pointer Exception
          System.out.println("Finally");
        }
    }
}
