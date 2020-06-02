import java.util.*;
public class Vehiculo{
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    public static int idActual = 1;
    private  int id = 0;
    private int modelo;
    private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
    private String marca;
    private double ValorComercial;
    private String color;

    public Vehiculo(){
        this.id = Vehiculo.idActual;  
        vehiculos.add(this);
        idActual++;
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");         
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.ValorComercial = va;
        this.color = co;
        this.id = Vehiculo.idActual;
        vehiculos.add(this);
        idActual++;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public int getModelo(){
        return this.modelo;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public double getValorComercial(){
        return this.ValorComercial; 
    }

    public void setValorComercial(double va){
        this.ValorComercial = va;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String co){
        this.color = co;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        String s1 = "("+ this. id + "," + this.marca+", "+this.modelo+", "+this.ValorComercial+", "+this.color+")";
        ArrayList<Sensor> temp = this.sensores;
        for(Sensor s: temp){
            s1 = s1 + s.toString();
        }
        return s1;
    }

    public static String toStringVehiculos(){
        String temp= "";
        for(Vehiculo v: Vehiculo.vehiculos){
            temp = temp + v.toString();
        }
        return temp;                                                                                     
    }

    public void setSensores(ArrayList<Sensor> a){
        this.sensores = a;
    }

    public ArrayList<Sensor> getSensores(){
        return this.sensores;
    }

    public static int cantidadVehiculos(){
        int cant = (Vehiculo.vehiculos).size();
        return cant;
    }

    public int cantidadSensores(){
        int cant2 = (this.sensores).size();
        return cant2;
    }

    public void anadirSensor(Sensor s){
        (this.sensores).add(s);
    }

    public static String colorVerde (){
        String temp= "";
        for(Vehiculo v: Vehiculo.vehiculos){
            String color = v.getColor();
            if(color.equalsIgnoreCase("verde")){
                temp = temp +"(" +v.getMarca()+", "+v.getModelo()+", "+v.getValorComercial()+", "+v.getColor()+")"; 
            }
        }
        return temp;
    }

    public static String mostrarId(int g){
        String temp="";
        for(Vehiculo v: Vehiculo.vehiculos){
            if(g == v.getId()){
                temp = temp +"("+v.getId()+", " +v.getMarca()+", "+v.getModelo()+", "+v.getValorComercial()+", "+v.getColor()+")"; 
            }
        }
        return temp;
    }

    public static Vehiculo obtenerVehiculoPorId(int id){
        int temp = 0;
        for(int i = 0; i < vehiculos.size(); i++){
            if(id == ((Vehiculo.vehiculos).get(i)).getId()){
                temp = i;
            }
        }
        return (Vehiculo.vehiculos).get(temp);
    }
}
