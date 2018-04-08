package praktek003;
public class JaketAksi {
    public static void main(String[] args) {
        Jaket s = new Jaket();
       
        s.setMerk("Volcom");
        s.setWarna("Hitam");
        s.setHarga(100000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
    }
}
