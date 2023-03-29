import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        String texto = JOptionPane.showInputDialog("Ingrese el número de ventas");
        int numVentas = Integer.parseInt(texto);

        int totalVentas=0;
        for(int i=1;i<=numVentas;i++){

            texto=JOptionPane.showInputDialog("Ingrese el monto en s/. de la venta: "+i);
            int venta = Integer.parseInt(texto);
            totalVentas = totalVentas + venta;
        }
        System.out.println("Total venta es : s/."+totalVentas);
    }
}