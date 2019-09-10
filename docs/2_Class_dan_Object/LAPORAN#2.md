# Laporan Praktikum #2 - Pengantar Konsep PBO

## Kompetensi

(Mampu mengenali:
1. Class dan object
2. Implementasi class
3. Implementasi atribut
4. Implementasi method
5. Proses Instansiasi
6. Implementasi try-catch
7. Proses pemodelan class diagram menggunakan UML
 )

## Ringkasan Materi

(Untuk praktikum tidak ada masalah dan bisa dipahami)

## Percobaan

### Percobaan 1

(Studi kasus 1:
1. ![contoh screenshot](img/1.Diagram.PNG)
2. Pada praktikum 1 membuat diagram dari studi kasus 1
3. Ada 4 class yang bisa di buat karena ada class karyawan dan mahasiswa yang 2 class untuk menulis atribut, variable dan method-method yang diperlukan, dan pada 2 class berikutnya adalah class untuk pembuatan objeknya dan pemberian nilai pada objek.
4. Ada beberapa atribut dan tipe pada class karyawan:
	id: int
	Nama: String
	Jenis kelamin: String
	Jabatan: String
	Gaji: double
Ada beberapa atribut dan tipe data pada class mahasiswa:
	Nim: int
	Nama: String
	Kelas: String
	Alamat: String
	No tlp: int
5. Method-method yang telah saya buat:
	tampilKaryawan(): void
	tampilMahasiswa(): void
 )

### Percobaan 2

(Studi kasus 2:
1. Pendeklarasian atribut terdapat pada class Mahsiswa pada baris 2 samapai baris 5.
2. Pendeklarasian method terdapat pada class Mahasiswa pada baris 7 dan di tulis dengan 
public void tampilBiodata(){
}
3.	Ada satu objek yang di instansiasi pada program diatas yaitu mhs1.
4. Pengisian nilai nim pada objek mhs1
5. Pemanggilan method tampilBiodata() yang ada pada class Mahasiswa.
6. ![contoh screenshot](img/Mahasiswa_Main.PNG)
![contoh screenshot](img/Praktikum_Mahasiswa.PNG)
![contoh screenshot](img/Mahasiswa_Main.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/Mahasiswa1841720207Bayu .java)
Contoh link kode program : [ini contoh link ke kode program](../../src/TestMahasiswa1841720207Bayu.java)
)

### Percobaan 3

(Studi kasus 3:
1. Fungsi argumen brgMasuk pada program diatas untuk menyimpan berapa banyak barang yang masuk.
2. Kegunaan return dalam suatu method adalah untuk mengembalikan nilai, suatu method harus memiliki return pada saat method itu bukan method void.

![contoh screenshot](img/Praktikum_Barang.PNG)
![contoh screenshot](img/Test_Barang.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/Barangg1841720207Bayu .java)
Contoh link kode program : [ini contoh link ke kode program](../../src/TestBarang1841720207Bayu.java)
)
`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

## Tugas

(silakan kerjakan tugas di sini beserta `screenshot` hasil kompilasi program. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

### Tugas 1
(
![contoh screenshot](img/Tugas_Game.PNG)
![contoh screenshot](img/Game_Main.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/TokoGame1841720207TokoGame1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/GameMain1841720207Bayu.java)

Isi Tugas: 
1. Pada class TokoGame yang saya buat memiliki beberapa atribut yaitu mId, mNamaMember, mNamaGame,mJumlahHari, mHarga.
2. Pada class ini memiliki 2 method dan yang pertama adalah method printDataBayu() yang digunakakan untuk menampilkan data yang dimiliki class TokoGame dan method yang ke dua adalah hargaSewaBayu()(non-void) yang digunakan untuk menghitung harga sewa dan menggunakan return untuk mengembalikan nilai mHarga.
3. Pada class GameMain dilakukan proses instansiasi objek TokoGame
4. Pada class ini saya menggunakan scanner untuk memasukkan nilai pada saat proses run agar program yang saya buat lebih dinamis

)

### Tugas 2
(
![contoh screenshot](img/Tugas_Karyawan.PNG)
![contoh screenshot](img/Karyawan_Main.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/TokoGame1841720207Karyawan1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/GajiMain1841720207Bayu.java)

Isi Tugas: 
1. Pada class Karyawan1841720207Bayu meliliki beberapa atribut yaitu mId, mNama, mJenisKelamin, mJabatan, mGaji
2. Pada class Karyawan1841720207Bayu  memiliki satu method yaitu printBayu()(void) yang digunakan untuk menampilkan data Karyawan
3. Pada class GajiMain1841720207Bayu dilakukan proses instansiasi objek dari class Karyawan1841720207Bayu 
4. Pada class ini saya menggunakan scanner untuk memasukkan nilai pada saat proses run agar program yang saya buat lebih dinamis

)

### Tugas 3
(
![contoh screenshot](img/Tugas_Lingkaran.PNG)
![contoh screenshot](img/Lingkaran_Main.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/Lingkaran1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/LingMain1841720207Bayu.java)

Isi Tugas:
1. Pada class Lingkaran1841720207Bayu ini memiliki beberapa atribut yaitu mPhi=3.14 pada atribut mPhi saya langsung isikan nilainya karena phi nilianya selalu sama dan mR, mLuas, mKeliling
2. Pada class Lingkaran1841720207Bayu memiliki 3 method yaitu hitungLuasBayu()(non-void) dilakukan proses untuk menghitung luas lingkaran dan pada method hitungKelilingBayu()(non-void) dilakukan proses untuk menghitung keliling lingkaran kedua method ini menggunakan return untuk mengembalikan nilai dan method ke 3 yaitu printHasilBayu() digunakan untuk menampilkan data lingkaran
3. Pada class LingMain1841720207Bayu dilakukan proses instansiasi objek
4. Pada class ini saya menggunakan scanner untuk memasukkan nilai pada saat proses run agar program yang saya buat lebih dinamis

)
### Tugas 4
(
![contoh screenshot](img/Tugas_Barang.PNG)
![contoh screenshot](img/Barang_Main.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/Barang1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/BarangMain1841720207Bayu.java)

Isi Tugas:
1. Pada class Barang1841720207Bayu memiliki beberapa atribut yaitu mKode, mNamaBarang, mHargaDasar, mDiskon
2. Pada class ini memiliki 2 method yaitu printHasilBayu() yang digunakkan untuk menampilkan data barang dan method yang kedua yaitu hitungHargaJualBayu()(non-void) pada method ini memiliki parameter int hargaJual yang digunakkan untuk menyimpan nilai harga jual pada method ini saya cast karena tipe data float tidak bisa di masukkan pada int dan memiliki return untuk mengembalikan nilai hargaJual.
3. Pada class BarangMain1841720207Bayu dilakukkan proses instansiasi objek dari class Barang1841720207Bayu dan pada class ini saya menggunakan scanner untuk memasukkan nilai pada saat proses run agar program yang saya buat lebih dinamis

)


## Kesimpulan

(Dari percobaan di atas kita telah mengenal class dan objek dan kita juga dapat memahami implementasi atribut, method, proses instansiasi, try-catch dan juga pemodelan class diagram menggunakan UML )

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***