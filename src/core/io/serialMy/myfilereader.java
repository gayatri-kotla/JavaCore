package core.io.serialMy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class myfilereader
{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\HP\\Downloads\\dsaPractice\\javacore\\src\\core\\io\\serialMy\\mydata.txt");
        BufferedReader bfr = new BufferedReader(fr);
        int x= bfr.read();
        while(x!=-1){
            System.out.println((char)x);
            x = bfr.read();
        }
//        bfr.read();
        fr.close();
        bfr.close();
    }
}
