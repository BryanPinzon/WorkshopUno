public class Veleros extends Embarcacion {
    private int mastiles;

    public Veleros(int precioBase, int valorAdicional, int dateFabricacion, int eslora, int mastiles ){
        super(precioBase, valorAdicional, dateFabricacion, eslora);
        this.mastiles = mastiles;
    }
    public int getMastiles(){
        return this.mastiles;
    }
    @Override
    public void montoAlquiler(Capitan capitan){
        int precioBase = 50000;
        int valorAdicional = 20000;
        if(getDateFabricacion() > 2020){
            System.out.println("El año de fabricación del Velero es: " + getDateFabricacion() + " el cual aumenta un valor adicional a: " + valorAdicional);
            System.out.println("El precio del alquiler de su embaracion es: " + (precioBase+=valorAdicional)+ " , el velero que alquiló cuenta con una cantidad de:" + " " + mastiles + " mastiles");
            System.out.println("El capitan que navegará la nave es: " + capitan.getNombre() + " " + capitan.getApellido() + " con numero de matricula " + capitan.getMatriculaNavegacion());
            System.out.println("Disfruta tu viaje marítimo");
        }else{
            System.out.println("El precio base del alquier a pagar es: " + precioBase);
            System.out.println("El capitan que navegará la nave es: " + capitan.getNombre() + " " + capitan.getApellido() + " con numero de matricula " + capitan.getMatriculaNavegacion());
            System.out.println("Disfruta tu viaje marítimo");
        }
    }
    public void veleroGrande(){
        if (mastiles>4) {
            System.out.println("Clasificacion de Velero segun sus mastiles:");
            System.out.println("Este velero clasifica como un Velero grande, debido a que supera los 4 mastiles. Cantidad mastiles : " + mastiles);
        }else if(mastiles==4){
            System.out.println("Clasificacion de Velero segun sus mastiles");
            System.out.println("Este velero clasifica como estandar. Cantidad de mastiles: " + mastiles);
        }else{
            System.out.println("Clasificacion de Velero segun sus mastiles:");
            System.out.println("Este velero clasifica como un velero pequeño. Cantidad de mastiles: " + mastiles);
        }

    }
}
