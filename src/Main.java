public class Main {
    public static void main(String[] args) {
        Capitan capitanEmmanuel = new Capitan("Emmanuel", "Usme", 123456);
        Capitan capitanEnrique = new Capitan("Enrique", "Pinzon", 789565);
        Embarcacion veleroEmmanuel = new Veleros(20000, 15000, 2021, 15, 5 );
        Embarcacion yateEnrique = new Yates(18000, 12000, 2021, 20, 8);
        System.out.println("============================");
        veleroEmmanuel.montoAlquiler(capitanEmmanuel);
        System.out.println("============================");
        veleroEmmanuel.veleroGrande();
        System.out.println("============================");
        yateEnrique.montoAlquiler(capitanEnrique);
        System.out.println("============================");
        yateEnrique.comprarYates();
        System.out.println("============================");

    }
}