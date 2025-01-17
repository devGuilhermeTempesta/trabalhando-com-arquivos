package passo14_trabalhando_com_arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = null;
        File file = new File("C:\\IdeaProjects\\primeiro projeto\\src\\curso\\src\\passo14_trabalhando_com_arquivos\\in.txt");
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}
