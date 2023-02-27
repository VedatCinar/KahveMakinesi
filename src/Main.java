import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        menuyuYazdir();

        String kahveSecim = kahveSecimYap();

        System.out.println(kahveSecim + " hazirlaniyor ");

        sutIste();

        sekerEkle();

        String boySecim = boySecim();

        System.out.println(kahveSecim + " " + boySecim + " olarak hazirlandi. Afiyet olsun! Yeniden bekleriz...");



    }

    private static String boySecim() {
        String sec = "";
        while (true){

            System.out.println("***************************************************\n\nHangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)\n\n***************************************************");
            sec = scan.nextLine();
           switch (sec.toLowerCase()){
               case "buyuk boy":

               case "orta boy":

               case "kucuk boy":
                   System.out.println("Kahveniz "+sec+" hazirlaniyor");
                   break;
               default:
                   System.out.println("Yanlis giris yaptiniz lutfen dogru boy giriniz");
                   boySecim();
                   break;
           }
            return sec;
    }
    }

    private static String kahveSecimYap() {
        //Kullanici dogru secip yapana kadar methoddan cikamasin
        while (true) {
            //kullanicidan bir girdi istenir ve alinan girdi bir degiskende saklanir
            //Bu degisken eger kabul edilebilir bir girdi ise methoddan cikilir
            String secim = "";
            secim = scan.nextLine();
            if (secim.equalsIgnoreCase("Turk Kahvesi")) {
                return "Turk Kahvesi";
            } else if (secim.equalsIgnoreCase("Filtre Kahve")) {
                return "Filtre Kahve";
            } else if (secim.equalsIgnoreCase("Espresso")) {
                return "Espresso";
            } else {
                System.out.println("Yanlis Secim yaptiniz lutfen dogru bir giris yapiniz");
                menuyuYazdir();
            }

        }
    }


    private static void menuyuYazdir() {

        System.out.println("*****************************************");
        System.out.println("Hangi kahveyi Istersiniz ?\n1.Turk Kahvesi\n2.Filtre Kahve\n3.Espresso");
        System.out.println("\n*****************************************\n\n");

    }


    private static void sutIste() {
        System.out.println("***************************************************\n\nSüt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):\n\n***************************************************");
        String sut = scan.nextLine();

        if (sut.equalsIgnoreCase("Evet")) {
            System.out.println("\nSut ekleniyor");
        } else if (sut.equalsIgnoreCase("Hayir")) {
            System.out.println("\nSut eklenmiyor");
        } else {
            System.out.println("Yanlis giris yaptiniz. Lutfen Evet veya Hayir yaziniz...");
            sutIste();
        }

    }

   private static void sekerEkle() {
       System.out.println("***************************************************\n\nSeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):\n\n***************************************************");
       String seker = scan.nextLine();
       if (seker.equalsIgnoreCase("Evet")) {
           System.out.println("***************************************************\n\nKac seker eklememizi istersiniz?\n\n***************************************************");
           int sekerSayisi = scan.nextInt();
           scan.nextLine();
           if (sekerSayisi > 0) {
               System.out.println(sekerSayisi + " seker ekleniyor");
           } else{
               System.out.println("Yanlis giris yaptiniz, lutfen dogru girdi yapiniz");
               sekerEkle();
           }


       } else if (seker.equalsIgnoreCase("Hayir")) {
           System.out.println("Seker eklenmiyor");
       } else {
           System.out.println("Yanlis giris yaptiniz , lutfen evet veya hayir yaziniz");
           sekerEkle();
       }


   }
}
