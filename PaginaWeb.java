
import java.net.*;
import java.io.*;
public class PaginaWeb  { 
    private static String codigoFuente = "";

    public static void carroYa(int num){
        int ultimo = 0;
        for(int i = 0; i<num; i++){
            int clasepos = codigoFuente.indexOf("car-ad-info", ultimo);
            int preciopos = codigoFuente.indexOf("data-price",clasepos);
            int marcapos = codigoFuente.indexOf("data-brand", preciopos);
            int marcafinal = codigoFuente.indexOf("data-model", marcapos);
            int modelopos = codigoFuente.indexOf("data-ano", marcafinal);
            int fin = codigoFuente.indexOf("data-city", modelopos);
            String pricio = codigoFuente.substring((preciopos+12), marcapos);
            String marca = codigoFuente.substring((marcapos+12), marcafinal);
            String modelo = codigoFuente.substring((modelopos+10), fin);
            marca = marca.replace('"', ' ');
            
            modelo = modelo.replace('"', ' ');
            
            pricio = pricio.replace('"', ' ');
            modelo = modelo.trim();
            pricio = pricio.trim();
            marca = marca.trim();
            int mo = Integer.valueOf(modelo);
            double pe = Double.valueOf(pricio);
            Vehiculo v2 = new Vehiculo(mo, marca, pe);
            ultimo  = fin;

        }
    }

    public static void codigo ()throws Exception{
        String rutaCarroYa = "https://www.carroya.com/buscar/vehiculos/medellin/t4c239.do";
        URL url = new URL(rutaCarroYa);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String linea;
        while((linea = reader.readLine()) != null){
            codigoFuente = codigoFuente + linea;
        }
        reader.close();
    }
}
