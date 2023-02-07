public class Yates  extends  Embarcacion{
    private int camarotes;


    public Yates(int precioBase, int valorAdicional, int dateFabricacion, int eslora, int camarotes){
        super(precioBase, valorAdicional, dateFabricacion, eslora);
        this.camarotes = camarotes;
    }

    @Override
    public void montoAlquiler(Capitan capitan){
        int precioBase = 50000;
        int valorAdicional = 20000;
        if(getDateFabricacion() > 2020){
            System.out.println("El año de fabricación del Yate es: " + getDateFabricacion() + " el cual aumenta un valor adicional a: " + valorAdicional);
            System.out.println("El precio del alquiler de su embaracion es: " + (precioBase+=valorAdicional)+ " , el yate que alquiló cuenta con una cantidad de:" + " " + camarotes + " camarotes");
            System.out.println("El capitan que navegará la nave es: " + capitan.getNombre() + " " + capitan.getApellido() + " con numero de matricula " + capitan.getMatriculaNavegacion());
            System.out.println("Disfruta tu viaje marítimo");
        }else{
            System.out.println("El año de fabricación del Yate es: " + getDateFabricacion() + " el cual no tiene costo adicional");
            System.out.println("El precio base del alquier a pagar es: " + precioBase);
            System.out.println("El capitan que navegará la nave es: " + capitan.getNombre() + " " + capitan.getApellido() + " con numero de matricula " + capitan.getMatriculaNavegacion());
            System.out.println("Disfruta tu viaje marítimo");
        }
    }

    @Override
    public void comprarYates(){
        int precioInicialDeCompra = 120000;
        int precioLujoAdicional=90000;
        if(getCamarotes()>7){
            System.out.println("Informacion de compra del Yate:");
            System.out.println("Este es un yate de lujo y su costo aumenta, el valor adicional es: " + precioLujoAdicional + " y el precio final de compra es: " + (precioInicialDeCompra += precioLujoAdicional));
            System.out.println("El año de fabricación de este yate de lujo es: " + getDateFabricacion() + " y su eslora es de: " + getEslora() + " , el yate posee : " + getCamarotes()+ " camarotes");
        }else{
            System.out.println("Informacion de compra del Yate:");
            System.out.println("El yate clasifica como estandar, su valor de compra es : " + precioInicialDeCompra);
            System.out.println("El año de fabricación de este yate estándar es: " + getDateFabricacion() + " y su eslora es de: " + getEslora() + " , el yate posee : " + getCamarotes()+ " camarotes");
        }
    }



    public int getCamarotes(){
        return this.camarotes;
    }

}
