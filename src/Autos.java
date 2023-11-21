public class Autos {
    //ATRIBUTOS
    public String marcas;
    public String color;
    public float precio;
    public int anio;

    //CONSTRUCTOR
    public Autos(String nuevoAuto){
        marcas=nuevoAuto;
    }

    //METODOS
    public String getMarcas() {
        return marcas;
    }
    public String getColor(){
        return color;
    }
    public float getPrecio(){
        return precio;
    }
    public int getAnio(){
        return anio;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimirDatos(){
        System.out.println(getAnio()+getPrecio()+getColor()+getMarcas());
    }
}
