public class pendidikan {
    String sdn;

    String smp;

    String sma;


    pendidikan(String sdn, String smp, String sma) {
        this.sdn = sdn ;
        this.smp = smp;
        this.sma = sma;
    }

    void cetakpendidikan (String serjana){

        System.out.println("sdn             :  " + sdn );
        System.out.println("smp             :  " + smp );
        System.out.println("sma             :  " + sma );
    }
}
