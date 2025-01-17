package passo14_trabalhando_com_arquivos.FileReader_e_BuffereadReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program_ex01 {
    public static void main(String[] args) {
        String path = "C:\\IdeaProjects\\primeiro projeto\\src\\curso\\src\\passo14_trabalhando_com_arquivos\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine(); //fazer com que leia de linha em linha
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }

    }
}
