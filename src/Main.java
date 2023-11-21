import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Autos auto1=new Autos("Pichirilo");
        System.out.println(auto1.marcas);
        //auto1.setColor("Rojo");
        auto1.setAnio(2022);
        auto1.imprimirDatos();
        System.out.println("Suma de años");
        System.out.println(auto1.getAnio());

       // auto2.setAnio(2023);
       // auto1.setMarcas("Toyota");
       // auto2.setMarcas("Chevrolet");

        System.out.println("Valores nuevos");
        auto1.imprimirDatos();
        //auto2.imprimirDatos();


        String marca;
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese la marca");
        marca=dato.nextLine();
        //System.out.println(marca);
        auto1.setMarcas(marca);
        auto1.imprimirDatos();


    }

}