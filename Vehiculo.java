public class Vehiculo{
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double ValorComercial;
    private String color;

    /*public Vehiculo(){
    this(0);
    }*/

    public Vehiculo(int mo, String ma, double va){
        this.modelo = mo;
        this.marca = ma;
        this.ValorComercial = va;
        Vehiculo.vehiculos[posAnadir]=this;
        Vehiculo.posAnadir++;
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.ValorComercial = va;
        this.color = co;

        Vehiculo.posAnadir++;
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

    public String toString(){
        return "(" +this.marca+", "+this.modelo+", "+this.ValorComercial+", "+this.color+")";
    }

    public static String toStringVehiculos(){
        String temp= "";
        for(int i = 0; i < Vehiculo.posAnadir; i++){
            temp = temp + "(" +vehiculos[i].getMarca()+", "+vehiculos[i].getModelo()+", "+vehiculos[i].getValorComercial()+", "+vehiculos[i].getColor()+")";
        }
        return temp;                                                                                     
    }

    public static int cantidadVehiculos(){
        int cant = posAnadir;
        return cant;
    }

    public static void ColorVerde (){
        
        for(int i = 0; i < Vehiculo.posAnadir; i++){
            String color = Vehiculo.vehiculos[i].getColor();
            if(color.equalsIgnoreCase("verde")){
                System.out.println(Vehiculo.vehiculos[i].toString());
            }
        }
    }
}
