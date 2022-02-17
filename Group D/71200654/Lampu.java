public class Lampu {
   String warna;
   public void gantiWarna (String w) {
       warna = w;
   }
   public String warnaSekarang() {
        return "Warna:" + warna;
    }
    public static void main (String args[]){
        Lampu I = new Lampu();
        I.gantiWarna ("Merah");
        System.out.println(I.warnaSekarang());
    }

}  
