
package Main;

import Main.Leer.*;
public class Principal {




  public static void main(String[] args) {
    
    System.out.println("Bienvenido a DigigamesBP!");
    
    boolean continuar = true;
    int compra, cant; 
    
    Producto cel1 = new celulares("Iphone 11 ", 399990 , 6 , true);
    Producto cel2 = new celulares("Iphone 13 ", 749990 , 4 , true);
    Producto cel3  = new celulares("Iphone 14 Pro Max ", 1299990 , 5 , true);
    Producto con1  = new consolas("Nintendo Switch ", 349990 , 2 , true);
    Producto con2  = new consolas("Playstation 4 ", 499990 , 3 , true);
    Producto con3  = new consolas("Playstation 5 ", 799990 , 1 , true);
    Producto con4  = new consolas("Xbox Series X ", 599990 , 5 , true);
    Producto jue1  = new Videojuego("Pokemon Violeta ", 69990 , 8 , true);
    Producto jue2  = new Videojuego("Resident Evil 4 ", 64990 , 7 , true);
    
    Producto catalogo[] = new Producto[Producto.dimesionArray];
    
    Gestion gestion = new Gestion();


    catalogo[0] = cel1;
    catalogo[1] = cel2;
    catalogo[2] = cel3;
    catalogo[3] = con1;
    catalogo[4] = con2;
    catalogo[5] = con3;
    catalogo[6] = con4;
    catalogo[7] = jue1;
    catalogo[8] = jue2;
    
    do {
      System.out.println("\n"
                +"¿Que desea hacer?:"
                +"\n1. Ver catalogo"
                +"\n2. Comprar"
                +"\n3. Mostrar caja"
                +"\nSALIR --> Pulse cualquier otro número"
                );
      switch (Leer.datoInt()) {
        case 1:
          gestion.mostrarProductos(catalogo);
          break;
        case 2:
          System.out.println("¿Que producto desea comprar?");
          gestion.mostrarNombreProductos(catalogo);
          compra=Leer.datoInt();
          System.out.println("¿Cuantos?");
          cant=Leer.datoInt();
          gestion.comprarProducto(catalogo, compra, cant);
          break;
        case 3:
          System.out.println(gestion.mostrarCaja() +" $ ");
          break;
        default:
          continuar=false;
      }
      
    } while(continuar);
    
    System.out.println("Gracias por comprar en DigigamesBP");

  }
}