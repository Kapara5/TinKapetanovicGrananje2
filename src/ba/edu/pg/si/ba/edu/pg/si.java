package ba.edu.pg.si.ba.edu.pg;
import java.time.LocalDate;


public class si {
    public static void main(String[] args) {

                int godina = LocalDate.now().getYear();

                if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
                    System.out.println(godina + " je prestupna godina.");
                } else {
                    System.out.println(godina + " nije prestupna godina.");
                }
            }
        }
        //Tin Kapetanović