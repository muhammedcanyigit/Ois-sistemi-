import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {

        Ois[] öğrenciler = {
            new Ois("Ahmet", 101, 85.5f),
            new Ois("Mehmet", 102, 90.0f),
            new Ois("Ayşe", 103, 78.0f),
            new Ois("Fatma", 104, 88.5f),
            new Ois("Can", 105, 67.5f)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("adınızı girin");
        String girilenAd = scanner.nextLine();

        System.out.println("numaranızı girin :");
        int girilenNumara = scanner.nextInt();

        boolean öğrencibulundu = false ;


        for(Ois öğrenci : öğrenciler) { 

            if (öğrenci.ad.equalsIgnoreCase(girilenAd) && öğrenci.numara == girilenNumara) {
                öğrenci.bilgiYazdır();
                öğrencibulundu = true ; 
                break;
            }
        }
        if(!öğrencibulundu) {
            System.out.println("grilen bilgilerle eşleşen öğrenci bulunamadı !!");
        }

        scanner.close();

    }

    }

