package client;

import javax.swing.JOptionPane;

public class PrincipalMoneda {
    public static void main(String[] args) {
        int cantDinero;
       String tipoMoneda;
      
       
        DesgloseMoneda moneda=new DesgloseMoneda(12345,"colones");
        cantDinero=Integer.parseInt(JOptionPane.showInputDialog(" Digite el monto"));
        tipoMoneda=JOptionPane.showInputDialog("colones");
       JOptionPane.showMessageDialog(null, moneda.desglose());
         JOptionPane.showConfirmDialog(null, moneda.toString());
        
    }
}
