// @uthor: {Yb.M};
package clases;

// Importamos las clases a usar
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class hora {
    
    // Método para obtener la fecha actual
    public static String fecha() {
        // Instanciamos la clase Date
        Date fcha = new Date();

        // Le damos formato para colocarlo en el label
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        // Retornamos el valor nuevo
        return formatoFecha.format(fcha);
    }
    
    // Método para imprimir la hora
    public String hora() {
        
        // Variables para asignar al formato de la hora
        String hora, min, seg;
        
        // Instaciamos la clase Gregorian Calendar y Date
        Calendar calendario = new GregorianCalendar();
        Date hraActual = new Date();
        
        calendario.setTime(hraActual);
        
        // Encasulamos los datos
        // Print las Hora
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? ""
                + calendario.get(Calendar.HOUR_OF_DAY) : "0"
                + calendario.get(Calendar.HOUR_OF_DAY);

        // Print los minutos
        min = calendario.get(Calendar.MINUTE) > 9 ? ""
                + calendario.get(Calendar.MINUTE) : "0"
                + calendario.get(Calendar.MINUTE);

        // Print los segundos
        seg = calendario.get(Calendar.SECOND) > 9 ? ""
                + calendario.get(Calendar.SECOND) : "0"
                + calendario.get(Calendar.SECOND);

        // Formato a colocar en el label
        String fin = hora + ":" + min + ":" + seg;
        
        // Devolvemos el formato de la hora
        return fin;
    }

}
// @uthor: {Yb.M};