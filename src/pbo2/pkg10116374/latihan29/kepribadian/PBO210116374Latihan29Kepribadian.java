package pbo2.pkg10116374.latihan29.kepribadian;
import java.util.Scanner;
/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan Proses melihat kepribadian berdasarkan warna
 *
 */
public class PBO210116374Latihan29Kepribadian {

    public static String normal = "\u001b[0m";
    public static String white = "\u001B[37m";
    public static String red = "\u001b[31m";
    public static String green = "\u001b[32m";
    public static String yellow = "\u001b[33m";
    public static String blue = "\u001b[34m";
    public static String cyan = "\u001b[36m";
    public static String purple = "\u001b[35m";
    
    public static String redBacdround = "\u001B[41m";
    public static String greenBacdround = "\u001B[42m";
    public static String yellowBacdround = "\u001B[43m";
    public static String blueBacdround = "\u001B[44m";
    public static String purpleBacdround = "\u001B[45m";
    
     public static String convertHurufBesar(String warna){
        String kalimatUpper = warna.toUpperCase();
        return kalimatUpper;
    }
     
     public static void validasi(String warna){
        
        switch(convertHurufBesar(warna)){
            case "MERAH":
                getMerah(warna);
                break;
            case "HIJAU":
                getHijau(warna);
                break;
            case "KUNING":
                getKuning(warna);
                break;
            case "BIRU":
                getBiru(warna);
                break;
            case "UNGU":
                getUngu(warna);
                break;
            default:
                System.out.println("Opps.. Belum teridentifikasi");
        }
    }
    
    public static void getMerah(String warna){
        System.out.println(normal + "Warna Favoritmu adalah " + red + convertHurufBesar(warna));
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");   
    }
    
    public static void getHijau(String warna){
        System.out.println(normal + "Warna Favoritmu adalah " + green + convertHurufBesar(warna));
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri");
        System.out.println("7. menjunjung tinggi suatu nilai toleransi dan kepercayaan.");   
    }
    
    public static void getKuning(String warna){
        System.out.println(normal + "Warna Favoritmu adalah " + yellow + convertHurufBesar(warna));
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }
    
    public static void getBiru(String warna){
        System.out.println(normal + "Warna Favoritmu adalah " + blue + convertHurufBesar(warna));
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }
    
    public static void getUngu(String warna){
        System.out.println(normal + "Warna Favoritmu adalah " + purple + convertHurufBesar(warna));
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }
    
    public static void tampil(String warna, String nama){
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            validasi(warna);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    String warna, nama;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(red + "YUK " + green + "CEK " + yellow + "KEPRIBADIAN " + cyan + "DARI " + purple + "WARNA " + blue + "FAVORITMU");
        
        System.out.println("");
        System.out.println(redBacdround + white + "            MERAH            ");
        System.out.println(greenBacdround + white + "            HIJAU            ");
        System.out.println(yellowBacdround + white + "            KUNING           ");
        System.out.println(blueBacdround + white + "            BIRU             ");
        System.out.println(purpleBacdround + white + "            UNGU             ");
        
        System.out.println("");
        System.out.print(normal + "PILIH WARNA FAVORITMU : ");
        warna = keyboard.next();
        System.out.print(normal + "NAMA KAMU : ");
        nama = keyboard.next();
        
        System.out.println("");
        tampil(warna, nama);
    }
    
}
