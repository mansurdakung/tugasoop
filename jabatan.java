public class jabatan {
    String namajabatan;

    String unitorganisasi;

    String tugas;

    jabatan(String namajabatan, String unitorganisasi, String tugas) {
        this.namajabatan = namajabatan ;
        this.unitorganisasi = unitorganisasi;
        this.tugas= tugas;
    }

    void cetakjabatan (String tugas){
        System.out.println("namajabatan     :  " + namajabatan);
        System.out.println("organisasi      :  " + unitorganisasi);
        System.out.println("tugas           :  " + tugas);
    }
}
