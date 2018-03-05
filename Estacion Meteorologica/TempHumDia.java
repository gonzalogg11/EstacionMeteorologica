/**
 * Clase TempHumDia que hereda TempDia
 * @author Gonzalo Granizo 1DAW
 */
public class TempHumDia extends TempDia {

    protected int maxHum, minHum, media; // Se añaden las humedades maximas y minimas y la media de estas
    
    /**
     * TempHumDia Constructor
     * Se llaman a los constructores de TempDia y se definen los nuevos
     * @param maxHum Humedad maxima
     * @param minHum Humedad minima
     * @param minTemp Temperatura minima
     * @param maxTemp Temperatura maxima
     * @param dia  
     * @param mes 
     * @param año
     */
    public TempHumDia (int maxHum, int minHum, int minTemp, int maxTemp, int dia, int mes, int año) {
        super(minTemp,maxTemp,dia, mes, año);
        this.maxHum = maxHum;
        this.minHum = minHum;
        this.media = ((maxHum+minHum)/2);
    }
    
    /**
     * Método toString
     * @return Se muestran por pantalla todos los nuevos junto con los del anterior toString
     */
    public String toString() {
        return super.toString() + " con Humedad minima: " 
        + minHum + " y Maxima: " + maxHum+ " Media humedad: " 
        + media;
    }
}
