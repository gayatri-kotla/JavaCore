package core.io.filewrite;

import java.io.*;
import java.util.Scanner;

public class myFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\HP\\Downloads\\dsaPractice\\javacore\\src\\core\\io\\mydata.txt");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        fw.write(text);
        fw.close();
    }
}
