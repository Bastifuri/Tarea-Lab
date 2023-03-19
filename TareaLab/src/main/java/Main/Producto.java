
package Main;

/**
 *
 * @author Basti
 */
public abstract class Producto {
    private String nombre;
  private double precio;
  private int Stock;
  private boolean disponible = false;
  public static int dimesionArray;
  
  
  public Producto() { }
  public Producto(String nombre, double precio, int Stock, boolean disponible) {
    this.nombre   = nombre;
    this.precio = precio;
    this.Stock  = Stock;
    this.disponible = disponible;
    
    dimesionArray++;
  }
  
  
  @Override
  public String toString() {
    return  "Nombre: "      +this.getNombre()+
        "Precio: " +this.getPrecioUnit()+  "$ "+
        "En Stock: "    +this.getCantStock() + "\n";
  }
  
  public String getNombre() {
    return this.nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public double getPrecioUnit() {
    return this.precio;
  }
  public void setPrecioUnit(int precio) {
    this.precio = precio;
  }
  public int getCantStock() {
    return this.Stock;
  }
  public void setCantStock(int cantStock) {
    this.Stock = cantStock;
  }
  public boolean isDisponible() {
    if(getCantStock()>0) this.disponible = true;
    return this.disponible;
  }
  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

}
