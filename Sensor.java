import java.util.*;
public class Sensor {
    private String tipo;
    private double valor;

    public Sensor (){
        this("", 0);
    }

    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double v){
        this.valor = v;
    }

    public String toString(){
        return "(" +this.tipo+", "+this.valor+")";
    }

    public static String temperatura(ArrayList<Sensor> n){
        String temp = "";
        for(Sensor s : n){
            if((s.getTipo()).equalsIgnoreCase("Temperatura")){
                temp = temp + s.toString();
            }
        }
        return temp;
    }

    public static String infoTemperatura(){
        String temp = "";
        for(Vehiculo v: Vehiculo.vehiculos){
            temp = temp + Sensor.temperatura(v.getSensores());
        }
        return temp;
    }

    public static String vehiculoMasSensores(){
        int m = ((Vehiculo.vehiculos).get(0)).cantidadSensores();
        int posicion = 0;
        for(int i = 0; i < (Vehiculo.vehiculos).size(); i++){
            if(m < ((Vehiculo.vehiculos).get(i)).cantidadSensores()){
                m = ((Vehiculo.vehiculos).get(i)).cantidadSensores();
                posicion = i;
            }
        }
        return ((Vehiculo.vehiculos).get(posicion)).toString();
    }

    public static ArrayList<Sensor> ordenTemperatura(){
        ArrayList<Sensor> s1 = new ArrayList<Sensor>();
        for(Vehiculo v: Vehiculo.vehiculos){
            for(Sensor s: v.getSensores()){
                if((s.getTipo()).equalsIgnoreCase("Temperatura")){
                    s1.add(s);
                }
            }
        }
        int pos_menor;
        Sensor temp = new Sensor();
        for (int i = 0; i < s1.size(); i++) {
            pos_menor = i;
            for (int j = i + 1; j < s1.size(); j++) {
                if ((s1.get(j)).getValor() < (s1.get(pos_menor)).getValor()){
                    pos_menor = j;
                }
            }
            temp = s1.get(i);
            s1.set(i, s1.get(pos_menor));
            s1.set(pos_menor, temp);
        }
        return s1;
    }
}
