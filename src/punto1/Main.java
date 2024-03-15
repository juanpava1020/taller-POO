
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductoEspecifico objProducto1 = new ProductoEspecifico(1, "lapiz",2000, "papeleria", "big");

        ProductoEspecifico objProducto2 = new ProductoEspecifico(2, "cuaderno",6000, "cuaderno", "norma");


        Inventario objInventario = new Inventario();
        objInventario.agregarProducto(objProducto1);
        objInventario.agregarProducto(objProducto2);


        System.out.println("antes de eliminar");
        objInventario.listarProductos();

        objInventario.eliminarProducto(2);
        System.out.println("despues de eliminar");
        objInventario.listarProductos();

        System.out.println(objInventario.buscarPorNombre("lapiz"););




    }
}