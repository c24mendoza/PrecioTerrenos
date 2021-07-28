import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Pantalla
{
    private Terreno [] terrenos;
    private double suma;
    private int cantidadTerrenos;

    public void preguntarDatos()
    {
        //Scanner teclado = new Scanner(System.in)
        int cantidadTerrenos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de terrenos"));
        this.cantidadTerrenos = cantidadTerrenos;
        terrenos = new Terreno[cantidadTerrenos];
        int i = 0;
        String mensajet="";
        
        for(i=0; i<cantidadTerrenos; i++)
        {
            double largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el largo del terreno " + (i+1)));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el ancho del terreno " + (i+1)));
            String sector = JOptionPane.showInputDialog(null, "Digite el sector del terreno (urbano o rural) " + (i+1));
            
            terrenos[i] = new Terreno(largo, ancho, sector);
            
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
