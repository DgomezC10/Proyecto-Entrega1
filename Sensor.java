public class Sensor {
    public static Sensor[] sensores = new Sensor[8];
    public static int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor;

    public Sensor (){
    }

    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;

        Sensor.posAnadir++;
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
        return "(" +this.tipo+", "+this.valor+ ")";
    }

    public static String toStringVSensor(){
        String temp = "" ;
        for(int i = 0; i < Sensor.posAnadir; i++){
            temp = temp + "(" +sensores[i].getTipo()+", "+sensores[i].getValor()+")";
        }
        return temp;                                                                                     
    }

    public static int cantidadSensores(){
        int cant = posAnadir;
        return cant;
    }

    public static void Temperatura(){
        for(int i = 0; i < Sensor.posAnadir; i++){
            String sensor = Sensor.sensores[i].getTipo();
            if(sensor.equalsIgnoreCase("temperatura")){
                System.out.println(Sensor.sensores[i].toString());
            }
        }
    }

    public static Sensor[] ordenTemperatura (){
        int cont=0;
        for(int i = 0; i < Sensor.posAnadir; i++){
            String sensor = Sensor.sensores[i].getTipo();
            if(sensor.equalsIgnoreCase("temperatura")){
                cont++;
            }
        }
        Sensor[] nuevo = new Sensor[cont];
        cont=0;
        for(int i = 0; i < Sensor.posAnadir; i++){
            String sensor = Sensor.sensores[i].getTipo();
            if(sensor.equalsIgnoreCase("temperatura")){
                nuevo[cont]=Sensor.sensores[i];
                cont++;
            }
        }

        int n = nuevo.length;
        int pos_menor;
        Sensor temp = new Sensor();
        for (int i = 0; i < n - 1; i++) {
            pos_menor = i;
            for (int j = i + 1; j < n; j++) {
                if (nuevo[j].getValor() < nuevo[pos_menor].getValor()){
                    pos_menor = j;
                }
            }
            temp = nuevo[i];
            nuevo[i] = nuevo[pos_menor];
            nuevo[pos_menor] = temp;
        }
        return nuevo;
    }
}