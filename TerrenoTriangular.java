import java.text.DecimalFormat;

public class TerrenoTriangular extends Terreno
{
    public TerrenoTriangular(double largo, double ancho, String sector)
    {
        super(largo, ancho, sector);
    }
    
    public double getArea()
    {
        area = largo * ancho / 2;
        return area;
    }
    
    public String toString()
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        
        String mensaje = "Terreno triangular" + "\n" +
                         "Area: " + getArea() + "\n" +
                         "Valor $" + formato.format(getPrecio());
        return mensaje;
    }
}
