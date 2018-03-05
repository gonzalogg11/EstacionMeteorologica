/**
 * Clase TempHumDia que hereda TempDia
 * @author Gonzalo Granizo 1DAW
/**
 * Clase TempDia
 * @author Gonzalo Granizo 1DAW
 */
public class TempDia {
    
    protected int minTemp = 0, maxTemp = 0, media = 0, dia = 0, mes = 0, año = 0000;
    static final int meses[] = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365}; //Array con dias totales por mes

    
    /**
     * TempDia Constructor
     * Se definen los constructores
     * @param minTemp Temperatura minima
     * @param maxTemp Temperatura maxima
     * @param dia 
     * @param mes 
     * @param año 
     */
    public TempDia (int minTemp, int maxTemp, int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.media = ((maxTemp+minTemp)/2);
    }
    
    /**
     * Método toString
     * @return Se muestran por pantalla todos los datos
     */
    public String toString() {
        return "Dia: " + dia +" Mes: " + mes + " Año: " + año +
        " con Temperatura min: " + minTemp 
        + " y Temperatura max: " + maxTemp 
        + " Media temperatura: " + media;
    }
    
    /**
     * Método obtenerNumDia
     * @return Posicion del dia del año dentro del array meses
     */
    public int obtenerNumDia() {
        int pos = 0;
        mes = this.mes;
        for (int i=0; i<meses.length; i++){
            if (mes==i){
                pos = meses[i]+dia;
                break;
            }
        }
        return pos;
    }
    
    /**
     * Método eliminarDia
     * Se anulan todos los datos para eliminar el dia
     */
    public void eliminarDia() {
        mes = 0;
        dia = 0;
        año = 0;
        minTemp = 0;
        maxTemp = 0;
        media = 0;
    }
}
