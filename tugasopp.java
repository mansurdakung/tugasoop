public class latihanopp {
    public static void main(String[] args) {
     karyawan karyawan= new karyawan ("mansur","dakung","montong belae");
     karyawan.cetakkaryawan(karyawan.ttl);
        gaji gaji= new gaji ("5000000","1000000","1000000");
        gaji.cetakgaji(gaji.gajilembur);
        jabatan jabatan= new jabatan ("direktur","bisnis","pengelola bisnis");
        jabatan.cetakjabatan(jabatan.tugas);
        pendidikan pendidikan= new pendidikan ("sekolah dasar negeri ","sekolah menengah pertama","sekolah menengah atas" );
        pendidikan.cetakpendidikan(pendidikan.sma);
    }
}
