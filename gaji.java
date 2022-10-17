public class gaji {
    String gajipokok;

    String tunjangan;

    String gajilembur;

    gaji(String gajipokok, String tunjangan, String gajilembur) {
        this.gajipokok = gajipokok ;
        this.tunjangan = tunjangan;
        this.gajilembur = gajilembur;
    }

    void cetakgaji (String gajilembur){
        System.out.println("gajipokok       :  "  + gajipokok);
        System.out.println("tunjangan       :  "  + tunjangan );
        System.out.println("gajilembur      :  "  + gajilembur);
    }
}
