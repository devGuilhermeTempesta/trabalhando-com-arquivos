package passo14_trabalhando_com_arquivos.informacoes_do_caminho_do_arquivo;

import java.io.File;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: "+path.getName()); //mostar o nome do arquivo
        System.out.println("getParent: "+path.getParent()); //mostar o caminho do arquivo
        System.out.println("getPath: "+path.getPath()); //mostra o caminho completo
       sc.close();
    }

}
