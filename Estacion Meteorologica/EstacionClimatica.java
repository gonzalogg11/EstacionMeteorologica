import java.util.Scanner; 
/**
 * Clase EstacionClimatica
 * IMPLEMENTACIÓN PARCIAL DE CLASE EstacionClimatica
 * @author Gonzalo Granizo 1DAW
 */
public class EstacionClimatica 
{ 
    private String nombre; 
    private int año; 
    private TempHumDia mediciones[];  // Tabla de mediciones 
    private int nummediciones;      // Número de mediciones almacenadas 
    
    
    /**
     * EstacionClimatica Constructor
     * Se definen los constructores por defecto y se crea una tabla de mediciones para años bisiestos
     */
    public EstacionClimatica() 
    { 
         this.nombre = ""; 
         this.año = 2000;  
         mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
         nummediciones = 0; 
    } 
    
    /**
     * EstacionClimatica Constructor
     * Se definen los constructores para nuestra estacion climatica
     * @param nombre de la estacion
     * @param año
     */
    public EstacionClimatica(String nombre, int año) 
    { 
         this(); // Llamo al constructor por defecto 
         this.nombre = nombre; 
         this.año = año;
    } 

    /**
     * Método addDia
     * Se añade un dia al array mediciones
     * @param medida
     * @return true/false si se ha realizado o no
     */
    public boolean addDia (TempHumDia medida){ 
        if (this.año != medida.año) {
            return false;                      
        }
        int posicion = medida.obtenerNumDia();
        mediciones[posicion] = medida;
        return true;
    }
    
    /**
     * Método delDia
     * Se elimina un dia del array mediciones
     * @param medida
     * @return true/false si se ha realizado o no
     */
    public boolean delDia (TempHumDia medida){ 
        if (this.año != medida.año) {
            return false;                      
        }
        medida.eliminarDia();
        return true;  
    } 
    
    /**
     * Método listarDias
     * Se muestra por pantalla los datos de los dias que han sido añadidos por el momento 
     */
    public void listarDias(){ 
        for(int i=0; i<mediciones.length; i++) {
            if(mediciones[i]!= null) {
                mediciones.toString();
            }
        }
    } 
    
    /**
     * Método fechaOK
     * Me indica si una fecha es correcta 
     * @param dia
     * @param mes
     * @param año
     * @return true/false si las fechas son correctas o no
     */
    static boolean fechaOK (int dia, int mes, int año){ 
        if ((dia<= 31 && dia>0) && (mes>0 && mes<=12) && (año>1900 && año<=2018)) {
            return true;
        } else {
            return false;
        }
    } 
    
    
    /**
     * Método leerMedida
     * Me lee la medida de un dia en concreto
     * @return los datos de ese dia
     */
    public static TempHumDia leerMedida() { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,año,tempmax,tempmin,hummax,hummin; 
         TempHumDia medicion = null; 
         
        boolean error = true;
        
   
        do { 
        System.out.println("Día:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("Año:");  año = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,año) ) { 
             System.out.println (" Tº Máxima:"); tempmax = leer.nextInt(); 
             System.out.println (" Tº Mínima:"); tempmin = leer.nextInt(); 
             System.out.println (" Hº Máxima:"); hummax = leer.nextInt(); 
             System.out.println (" Hº Mínima:"); hummin = leer.nextInt(); 
             medicion = new TempHumDia (dia,mes,año, tempmax, tempmin, hummax, hummin); 
             error = false;
            }
        else 
        { 
            System.out.println(" Fecha érronea"); 
        } 
    
    } while (error); 
    
    leer.close(); 
    return medicion; 
}
} 