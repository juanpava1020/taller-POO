public class ProductoEspecifico extends  Producto{
    //añado propiedad especifica de mi clase ProductoEspecifico
    private String categoria;
    private String marca;

//creo el constructor de categorias

    public ProductoEspecifico(int id, String nombre, double precio, String categoria, String marca) {
        super (id, nombre, precio);
        this.marca = marca;
        this.categoria = categoria;
    }

//creo el get and set
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //creo el toString()

    @Override
    public String toString() {
        return super.toString() +
                "categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
