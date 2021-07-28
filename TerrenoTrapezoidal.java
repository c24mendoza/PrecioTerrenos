import java.text.DecimalFormat;

public class TerrenoTrapezoidal extends Terreno
{
    private double largo2;
    
    public TerrenoTrapezoidal(double largo, double largo2, double ancho, String sector)
    {
        this.largo = largo;
        this.ancho = ancho;
        this.sector = sector;
        this.largo2 = largo2;
    }
    
    public double getArea()
    {
        area = (largo + largo2) * ancho / 2;
        return area;
    }
    
    public String toString()
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        
        String mensaje = "Terreno trapezoidal" + "\n" +
                         "Area: " + getArea() + "\n" +
                         "Valor $" + formato.format(getPrecio());
        return mensaje;
    }
}
