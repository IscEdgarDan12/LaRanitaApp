package clases;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author DanKuzo
 */
public class pruebaDeMamadas {

    public static void main(String[] args) {
        System.out.println(idUsuario("l"));
    }

    public static String idUsuario(String usuario) {
        Random random = new Random();
        SimpleDateFormat dtf = new SimpleDateFormat("ddmmyy");
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String fecha = dtf.format(date);
        System.out.println(fecha);
        String idiUsuario = "";
        System.out.println(usuario.length());
        if (usuario.length() >= 3) {
            for (int i = 0; i < 3; i++) {
                idiUsuario = idiUsuario + usuario.charAt(i);
            }
        } else {
            for (int i = 0; i < usuario.length(); i++) {
                idiUsuario = idiUsuario + usuario.charAt(i);
            }
        }
        
        idiUsuario = fecha + idiUsuario;
        String mamada="";
        for (int i = 0; i < idiUsuario.length(); i++) {
            mamada+=idiUsuario.charAt(random.nextInt(idiUsuario.length()));
        }
        System.out.println("esta es la mamada "+mamada);
        return mamada;
    }
}
