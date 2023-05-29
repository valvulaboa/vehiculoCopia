
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRenombrada miVehiculo;
        int stockActual;
        
        miVehiculo = new VehiculoRenombrada("Seat",18000,100);
    operativaVehiculo(miVehiculo, 50);
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculo.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

  public static void operativaVehiculo(VehiculoRenombrada miVehiculo, int cantidad) {
    try
    {
      System.out.println("Venta de Vehiculos");
      miVehiculo.vender(20);
    } catch (Exception e)
    {
      System.out.print("Fallo al vender");
    }
  }

}
    
