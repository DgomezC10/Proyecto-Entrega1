import java.util.Scanner;
public class Principal{     
    public static void mostrarMenu(){    
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("----MENU----");
            System.out.printf("Ingrese:  %n0.Terminar Programa     1.Crear Vehiculo %n2.Mostrar Info          3.Cantidad de vehiculos %n4.Vehiculos verdes      5.Crear Sensor %n6.Info Sensores         7.Cantidad Sensores %n8.Sensores tipo temp    666.Ordenados%n ");
            int num = scan.nextInt();
            if(num == 0){
                break;
            }
            switch(num){  
                case 1:
                if(Vehiculo.posAnadir < Vehiculo.tamano - 1){
                    System.out.println("ingrese la Marca:");
                    String ma = scan.next();
                    System.out.println("ingrese Modelo:");
                    int mo = scan.nextInt();      
                    System.out.println("ingrese valor comercial:");
                    double vc = scan.nextDouble();
                    System.out.println("ingrese color:");
                    String co = scan.next();
                    Vehiculo.vehiculos[Vehiculo.posAnadir] = new Vehiculo(mo, ma, vc, co);
                }else{
                    System.out.println("Error Base de Datos llena");
                }
                break;
                case 2:
                System.out.println(Vehiculo.toStringVehiculos());
                break;
                case 3:
                System.out.println("Cantidad de vehiculos creados: "+Vehiculo.cantidadVehiculos());
                break;
                case 4:
                Vehiculo.ColorVerde();
                break;
                case 5:
                if(Sensor.posAnadir < Sensor.tamano - 1){
                    System.out.println("ingrese tipo:");
                    String T = scan.next();
                    System.out.println("ingrese valor:");
                    double V = scan.nextDouble();
                    Sensor.sensores[Sensor.posAnadir] = new Sensor(T, V);
                }else{
                    System.out.println("Error Base de Datos llena");
                }
                break;
                case 6:
                System.out.println(Sensor.toStringVSensor());
                break;
                case 7:
                System.out.println("Cantidad de sensores creados: "+Sensor.cantidadSensores());
                break;
                case 8:
                Sensor.Temperatura();
                break;
                case 666: 
                Sensor[] s1 = Sensor.ordenTemperatura();
                for(int i=0; i<s1.length;i++){
                    System.out.println(s1[i].toString());
                }
                break;
                default:
                System.out.println("Opcion no permitida");
                break;
            }
        }
    }

    public static void main(String[] args){
        Principal.mostrarMenu();

    }
}

