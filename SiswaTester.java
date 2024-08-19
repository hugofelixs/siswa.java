//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat objek
        //namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa ();
        Siswa rasyid = new Siswa ();
        Siswa widi = new Siswa();
        Siswa natan = new Siswa();
        Siswa royyan = new Siswa();
        Siswa arka = new Siswa();
        Siswa leon = new Siswa();

        sabrina.id = 32;
        sabrina.nama ="Sabrina";
        sabrina.ipk = 85.1;
        rasyid.id = 30;
        rasyid.nama ="Rasyid";
        rasyid.ipk = 86.2;
        widi.id = 34;
        widi.nama = "Widi";
        widi.ipk = 89.2;
        natan.id = 26;
        natan.nama = "Natan";
        natan.ipk = 86.5;
        royyan.id = 1;
        royyan.nama = "Royyan";
        royyan.ipk = 90.3;
        arka.id = 17;
        arka.nama = "Arka";
        arka.ipk = 91.2;
        leon.id = 16;
        leon.nama = "Leonsius";
        leon.ipk = 86.9;

        sabrina.print();
        rasyid.print();
        widi.print();
        natan.print();
        royyan.print();
        arka.print();
        leon.print();
    }
}
