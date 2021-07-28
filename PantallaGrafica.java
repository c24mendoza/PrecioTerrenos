import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PantallaGrafica
{
    private Terreno [] terrenos;
    private double suma;
    private int cantidadTerrenos;

    public void preguntarDatos()
    {
        int cantidadTerrenos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de terrenos"));
        this.cantidadTerrenos = cantidadTerrenos;
        terrenos = new Terreno[cantidadTerrenos];
        int i = 0;
        String mensajet="";
        
        for(i=0; i<cantidadTerrenos; i++)
        {
            String forma = JOptionPane.showInputDialog(null, "Digite la forma del terreno (rectangular, triangular o trapezoidal) " + (i+1));
            double largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el largo del terreno " + (i+1)));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el ancho del terreno " + (i+1)));
            String sector = JOptionPane.showInputDialog(null, "Digite el sector del terreno (urbano o rural) " + (i+1));
            
            if(forma.toLowerCase().equals("rectangular"))
            {
            terrenos[i] = new Terreno(largo, ancho, sector);
            }
            else if(forma.toLowerCase().equals("triangular"))
            {
            terrenos[i] = new TerrenoTriangular(largo, ancho, sector);
            }
            else if(forma.toLowerCase().equals("trapezoidal"))
            {
            double largo2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el segundo largo del terreno " + (i+1)));
            terrenos[i] = new TerrenoTrapezoidal(largo, largo2, ancho, sector);
            }
        }
        
    }
    
    public void calcularPrecio()
    {
        suma = 0;
        for(int x=0; x<cantidadTerrenos; x++)
        {
            suma = suma + terrenos[x].getPrecio();
        }
    }
    
    public void mostrarSuma()
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        
        for(int x=0; x<cantidadTerrenos; x++)
        {
            System.out.println(terrenos[x]);
        }
        
        System.out.println("El valor total de los terrenos es : $" + formato.format(suma));
    }
}
