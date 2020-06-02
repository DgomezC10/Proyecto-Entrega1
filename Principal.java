import java.util.Scanner;
public class Principal{     
    public static void mostrarMenu() throws Exception{    
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("----MENU----");
            System.out.printf("Ingrese:  %n0.Terminar Programa          1.Crear Vehiculo %n2.Mostrar Info               3.Cantidad de vehiculos %n4.Vehiculos verdes           5.Buscar vehiculo por id%n6.Asignar sensor             7.Info sensores %n8.Sensores tipo temp         9.Vehiculo con mas sensores%n10.Cargar info desde .txt    666.Ordenar sensores%n777.Descargar de PaginaWeb%n ");
            int num = scan.nextInt();

 

            if(num == 0){
                break;
            }

 

            switch(num){  
                case 1:
                System.out.println("ingrese la Marca:");
                String ma = scan.next();
                System.out.println("ingrese Modelo:");
                int mo = scan.nextInt();      
                System.out.println("ingrese valor comercial:");
                double vc = scan.nextDouble();
                System.out.println("ingrese color:");
                String co = scan.next();
                Vehiculo v1 = new Vehiculo(mo, ma, vc, co);
                break; 

 

                case 2:
                System.out.println(Vehiculo.toStringVehiculos());
                break; 

 

                case 3:
                System.out.println("Cantidad de vehiculos creados: "+Vehiculo.cantidadVehiculos());
                break; 

 

                case 4:
                System.out.println(Vehiculo.colorVerde());
                break;

 

                case 5:
                System.out.println("Ingrese el id que desea buscar");
                int id = scan.nextInt();
                if(id<Vehiculo.idActual){
                    System.out.println(Vehiculo.mostrarId(id));
                }else{
                    System.out.println("No se encuentra dicho vehiculo en la base de datos");
                }
                break;

 

                case 6:
                System.out.println("Ingrese el id que desea buscar");
                int i = scan.nextInt();
                if(i < Vehiculo.idActual){
                    System.out.println("Ingrese el tipo del sensor");
                    String t = scan.next();
                    System.out.println("Ingrese el valor del sensor");
                    double v = scan.nextDouble();
                    Sensor n = new Sensor(t, v);
                    (Vehiculo.obtenerVehiculoPorId(i)).anadirSensor(n);
                }else{
                    System.out.println("No se encuentra dicho vehiculo en la base de datos");
                }
                break;

 

                case 7:
                System.out.println("Ingrese el id que desea buscar");
                int id2 = scan.nextInt();
                if(id2 < Vehiculo.idActual){
                    for(Sensor s :(Vehiculo.obtenerVehiculoPorId(id2)).getSensores()){
                        System.out.println(s.toString());
                    }
                }
                break;

 

                case 8:
                System.out.println("Sensores tipo Temperatura informacion");
                System.out.println(Sensor.infoTemperatura());
                break;

 

                case 9: 
                System.out.println("Vehiculo con mas sensores");
                System.out.println(Sensor.vehiculoMasSensores());
                break;
                
                case 10:
                FileVehiculos.cargarDocumento();
                System.out.println("Vehiculos bajados desde .txt");
                break;

 

                case 666:
                for(Sensor s :Sensor.ordenTemperatura()){
                    System.out.println(s.toString());
                }
                break;

 

                case 777:
                System.out.println("Ingrese la cantidad de vehiculos que desea recuperar");
                int n = scan.nextInt();
                PaginaWeb.codigo();
                PaginaWeb.carroYa(n);
                System.out.println("Vehiculos descargados de pagina web");
                break;

 

                default:
                System.out.println("Numero invalido");
                break;
            }
        }
        System.out.println("Fin del programa");
    }

 

    public static void main(String[] args) throws Exception{
        Principal.mostrarMenu();
    }
}
