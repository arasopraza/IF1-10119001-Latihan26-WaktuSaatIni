import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menampilkan waktu saat ini sesuai dengan
 * lokasi kita berada saat ini
 */

public class WaktuSaatIni {
    public static void main(String[] args) {
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String dateFormated;

        localDateTime = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        dateFormated = localDateTime.format(dateTimeFormatter);
        System.out.println("Hari ini adalah hari : " + dateFormated);
    }
}
