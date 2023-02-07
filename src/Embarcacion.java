public class Embarcacion {
    private int precioBase;
    private int valorAdicional;
    private int dateFabricacion;

    private int eslora;

    public Embarcacion(int precioBase, int valorAdicional, int dateFabricacion, int eslora){
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.dateFabricacion = dateFabricacion;
        this.eslora = eslora;
    }

    public void montoAlquiler(Capitan capitan){}

    public void comprarYates(){};
    public void veleroGrande(){};

    public int getPrecioBase(){
        return this.precioBase;
    }
    public int getValorAdicional(){
        return this.valorAdicional;
    }
    public int getDateFabricacion(){
        return this.dateFabricacion;

    }
    public int getEslora(){
        return this.eslora;
    }
}
