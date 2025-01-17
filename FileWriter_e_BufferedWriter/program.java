package passo14_trabalhando_com_arquivos.FileWriter_e_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        String[] lines = new String[]{ "bom dia","boa tarde","boa noite" };

        String path = "C:\\IdeaProjects\\primeiro projeto\\src\\curso\\src\\passo14_trabalhando_com_arquivos\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){ //o true indica que nao queremos recriar o arquivo, apenas adcionar algo
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
