package passo14_trabalhando_com_arquivos.manipulando_pastas;

import java.io.File;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory); //a funçao isDirectory vai filtra so oq for diretorio ou pasta
        System.out.println("Folders: ");
        for(File folder: folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);// a funçao isFile vai filtrar so oq for arquivo
        System.out.println("files: ");
        for(File file: files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "//subdir").mkdir(); //vai criar um subpasta chamada subdir a partir da que a gente colocou
        System.out.println("Directory created successfully: "+success);
        sc.close();
    }
}
