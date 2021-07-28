import java.text.DecimalFormat;

public class Terreno
{
    protected double largo;
    protected double ancho;
    protected String sector;
    protected double area;
    protected double valorKil;
    protected double precio;

    public Terreno()
    {
        this.largo = 0;
        this.ancho = 0;
        this.sector = "";
    }
    
    public Terreno(double largo, double ancho, String sector)
    {
        this.largo = largo;
        this.ancho = ancho;
        this.sector = sector;
    }
    
    public void setLargo(double largo)
    {
        this.largo = largo;
    }
    
    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }
    
    public void setSector(String sector)
    {
        this.sector = sector;
    }
    
    public double getLargo()
    {
        return this.largo;
    }
    
    public double getAncho()
    {
        return this.ancho;
    }
    
    public String getSector()
    {
        return this.sector;
    }
    
    public double getArea()
    {
        area = largo * ancho;
        return area;
    }
    
    public double getValorKil()
    {
        if(sector.toLowerCase().equals("urbano"))
        {
            valorKil = 3000000;
        }
        
        if(sector.toLowerCase().equals("rural"))
        {
            valorKil = 1800000;
        }
        
        return valorKil;
    }
    
    public double getPrecio()
    {
        precio = getArea() * getValorKil();
        return precio;
    }
    
    public String toString()
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        
        String mensaje = "Terreno rectangular" + "\n" +
                         "Area: " + getArea() + "\n" +
                         "Valor $" + formato.format(getPrecio());
        return mensaje;
    }
    
}
