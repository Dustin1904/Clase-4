
public class Main {
    public static void main(String[] args) {
        Autos auto1=new Autos("Pichirilo");
        auto1.setAnio(2023);
        auto1.setColor("rojo");
        System.out.println(auto1.marcas);
        auto1.imprimirDatos();
        System.out.println(auto1.precio);

    }

}