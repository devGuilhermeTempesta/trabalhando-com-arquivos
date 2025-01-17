package passo14_trabalhando_com_arquivos.atividade;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      List<product> list = new ArrayList<>();

        System.out.print("enter file path: ");
        String srf = sc.nextLine();

        File file = new File(srf);
        String folderpath = file.getParent();
        boolean success = new File(folderpath + "//out").mkdir();

        String targetFileStr = folderpath + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(srf))){

            String itemCsv = br.readLine();
            while(itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                product p = new product(name,price,quantity);
                list.add(p);
                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                    for(product item: list){
                        bw.write(item.getName() + ","+ String.format("%.2f",item.total()));
                        bw.newLine();
                    }
                System.out.println(targetFileStr+ "  created");
            }
            catch (IOException e){
                System.out.println("Error writer: "+e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("ERROR read: "+e.getMessage());
        }

        sc.close();
    }
}
