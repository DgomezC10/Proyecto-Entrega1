import java.io.File;
import java.util.Scanner;
public class FileVehiculos
{
    public static void cargarDocumento(){
        File file = new File("VehiculosInfo.txt");
        try{
            Scanner input = new Scanner(file);
            String line;
            while(input.hasNextLine()) {
                line = input.nextLine();
                String[] arrOfLine = line.split(",");             
                int modelo = Integer.parseInt(arrOfLine[0]);
                String marca = arrOfLine[1];
                double valor = Double.parseDouble(arrOfLine[2]);
                String color = arrOfLine[3];
                Vehiculo v1 = new Vehiculo(modelo,marca,valor,color);              
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}