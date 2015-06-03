import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.*;
import java.util.*;
import sun.rmi.log.ReliableLog;

public class Download {
    
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://blogs.mccombs.utexas.edu/the-most/files/2009/06/corrupted-excel-file.png");
        URLConnection uc = url.openConnection();
        uc.connect();
        int size = uc.getContentLength();
        String fileName = url.getFile();
        fileName = fileName.substring(fileName.lastIndexOf('/')+1);
        RandomAccessFile file = new RandomAccessFile("myfile.png", "rw");
        int c;
        InputStream stream = uc.getInputStream();
        while((c = stream.read()) != -1) {
            file.write(c);
        }
        System.out.println("hello");
    }

}
