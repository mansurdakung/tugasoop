public class karyawan {
    String nama;

    String alamat;

    String ttl;

    karyawan(String nama, String alamat, String ttl) {
        this.alamat = alamat ;
        this.nama = nama;
        this.ttl = ttl;
    }

    void cetakkaryawan (String ttl){
        System.out.println("nama karyawan   :  " + nama );
        System.out.println( "alamat karyawan :  " + alamat);
        System.out.println( "ttl karyawan    :  " + ttl);
    }

}
