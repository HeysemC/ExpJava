package alistirma;
import java.util.ArrayList;
import java.util.List;
public class Exp_42 {

        public static void main(String[] args) {
            //Soru 3 Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
            // kismini list olarak bize donduren bir method olusturun.

            String[] ElifinCiceklerilistesi={"Begonya", "Sard6nya", "Cam§uzeli", "Gul"};
            System.out.println(elementleriSil());//[Begonya, Gul]
        }
        public static List<String> elementleriSil() {
            String[] ElifinCiceklerilistesi = {"Begonya", "Sard6nya", "Cam§uzeli", "Gul"};
            List<String> Ciceklistesi = new ArrayList<>();
            for (int i = 0; i < ElifinCiceklerilistesi.length; i++) {
                Ciceklistesi.add(ElifinCiceklerilistesi[i]);
                //System.out.println(Ciceklistesi);
                Ciceklistesi.remove("Sard6nya");
                Ciceklistesi.remove("Cam§uzeli");
                //System.out.println(Ciceklistesi);
            }
            return Ciceklistesi;
        }
    }

