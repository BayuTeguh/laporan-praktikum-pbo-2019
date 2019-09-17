# Laporan Praktikum #3 - Pengantar Konsep PBO

## Kompetensi

(Mampu memahami konsep:
1. Konstruktor
2. Modifier
3. Atribut/method pada class
4. Instansiasi atribut/method
5. Setter dan getter
6. Memahami notasi pada UML class diagram
 )

## Ringkasan Materi

(Untuk praktikum tidak ada masalah dan bisa dipahami)

## Percobaan

### Percobaan 1 Enkapsulasi
(
1. Class motor:
  ![contoh screenshot](img/Percobaan_1.PNG)
  ![contoh screenshot](img/Percobaan_1.1.PNG)
  Contoh link kode program : [ini contoh link ke kode program](../../src/Motor1841720207Bayu.java)
2. Class motorMain
  ![contoh screenshot](img/Screenshot_1.2.PNG)
  Contoh link kode program : [ini contoh link ke kode program](../../src/MotorDemo1841720207Bayu.java)
)

### Percobaan 2 Acces Modifier
(
1. Class motor:
  ![contoh screenshot](img/Percobaan_1.PNG)
  ![contoh screenshot](img/Percobaan_1.1.PNG)
  Contoh link kode program : [ini contoh link ke kode program](../../src/Motor1841720207Bayu.java)
2. Class motorMain:
   ![contoh screenshot](img/Percobaan_2.PNG)
   Contoh link kode program : [ini contoh link ke kode program](../../src/MotorDemo1841720207Bayu.java)
3. Keterangan:
    Pada class MotorDemo1841720207Bayu kali ini saya tambahkan perulangan agar saya tidak perlu menulis terlalu banyak sintaks karena pada saat melakukan test untuk mencapai kecepatan maksimal pada class MotorDemo1841720207Bayu saya perlu menulis method tambahKecepatan dan printStatus ber ulang-ulang.
)

### Pertanyaan percobaan 1 dan 2
(
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?  
2. Mengapat atribut kecepatan dan kontakOn diset private?  
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100! 

Jawaban pertanyaan:
1.	Karena method tambahKecepatan dipanggil sebelum method nyalakanMesin yang digunakan untuk menyalakan mesin dipanggil.
2.	Agar atribut kecepatan dan kontak0n tidak bisa diakses oleh class lain
3. ![contoh screenshot](img/Percobaan_2.PNG)
   Contoh link kode program : [ini contoh link ke kode program](../../src/MotorDemo1841720207Bayu.java)
Keterangan: 
    Pada class MotorDemo1841720207Bayu kali ini saya tambahkan perulangan agar saya tidak perlu menulis terlalu banyak sintaks karena pada saat melakukan test untuk mencapai kecepatan maksimal pada class MotorDemo1841720207Bayu saya perlu menulis method tambahKecepatan dan printStatus ber ulang-ulang.
)

### Percobaan 3 Getter dan Setter
(
1.  Class Anggota
    ![contoh screenshot](img/Percobaan_3.PNG)
    Contoh link kode program : [ini contoh link ke kode program](../../src/Anggota1841720207Bayu.java)

2. Class Koperasi Demo
    ![contoh screenshot](img/Percobaan_3.1.PNG)
     Contoh link kode program : [ini contoh link ke kode program](../../src/KoperasiDemo1841720207Bayu.java)

    Keterangan:
        Implementasi penggunaan getter dan setter
)

### Percobaan 4 Konstruktor, Instansiasi
(
1. Pembuatan konstruktor:
    ![contoh screenshot](img/Percobaan_3.PNG)
    Contoh link kode program : [ini contoh link ke kode program](../../src/Anggota1841720207Bayu.java)

2. Pengisian passing parameter:
    ![contoh screenshot](img/Percobaan_3.1.PNG)
     Contoh link kode program : [ini contoh link ke kode program](../../src/KoperasiDemo1841720207Bayu.java)
)

### Pertanyaan percobaan 3 dan 4
(
1. Apa yang dimaksud getter dan setter? 
2. Apa kegunaan dari method getSimpanan()? 
3. Method apa yang digunakan untk menambah saldo? 
4. Apa yand dimaksud konstruktor? 
5. Sebutkan aturan dalam membuat konstruktor? 
6. Apakah boleh konstruktor bertipe private? 
7. Kapan menggunakan parameter dengan passsing parameter? 
8. Apa perbedaan atribut class dan instansiasi atribut? 
9. Apa perbedaan class method dan instansiasi method?  
Jawaban Pertanyaan:
1.	Getter adalah public method, memiliki tipe data return, dan berfungsi untuk mendapatkan nilai dari atribut private, dan setter adalah public method yang tidak memliki tipe data return, yang berfungsi untuk memanipulasi nilai dari atribut private
2.	Method getSimpanan() digunakan untuk menyimpan data simpanan milik anggota
3.	Method setor()
4.	Konstruktor akan dieksekusi ketika instansiasi dari objek dibuat. Jadi setiap kali sebuat objek dibuat dengan keyword new() maka konstruktor akan dieksekusi dan konstruktor tidak memiliki tipe data return
5.	
	Konstruktor harus memiliki nama yang sama seperti nama class
	Konstruktor tidak memiliki tipe return
	Konstruktor tidak boleh menggunakan modifier abstract, static, final, dan synchronized
6.	Boleh
7.	Saat akan mementukan/memberikan suatu nilai atau merubah suatu nilai pada method/fungsi pada saat di jalankan
8.	Kalau menurut saya atribut class adalah atribut yang belum di beri nilai sedangkan istansiasi atribut adalah pemberian nilai pada atribut
9.	Class method adalah method yang belum di berikan nilai sedangkan instansiasi method adalah penmanggilan dan pengisian nilai pada method.
)

## Tugas

(silakan kerjakan tugas di sini beserta `screenshot` hasil kompilasi program. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

### Tugas 1
(
![contoh screenshot](img/Tugas_1.PNG)
![contoh screenshot](img/Tugas_1.2.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/EncapDemo1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/EncapTest1841720207Bayu.java)

Isi Tugas: 
1. Pada tugas ini berisi atribut dan method yang sama seperti pada modul
)

### Tugas 2
(
Pertanyaan: 

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

Jawaban:
  
2. Karena pada class EncapDemo kita memberikan kondisi pada saat umur yang di masukkan lebih dari 30 maka umur yang akan dimasukkan/ditampilkan adalah 30 atau kurang dari 30 
)

### Tugas 3
(
![contoh screenshot](img/Tugas_1.PNG)
![contoh screenshot](img/Tugas_1.2.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/EncapDemo1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/EncapTest1841720207Bayu.java)


Isi Tugas:
1. Untuk memberikan kondisi yang memungkinkan agar age dapat di beri nilai maksimal 30 dan minimal 18 kita hanya perlu mengubah pada method setAge kita berikan kondisi kalau umur yang dimasukkan >= 18 && <= 30 maka umur yang dimasukkan sudah benar dan kalu selain itu umur yang dimasukkan salah

)
### Tugas 4
(
![contoh screenshot](img/Tugas_2.PNG)
![contoh screenshot](img/Tugas_2.1.PNG)
![contoh screenshot](img/Tugas_2.2.PNG)
![contoh screenshot](img/Tugas_2.3.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/InformasiKoperasi1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/InformasiMain1841720207Bayu.java)

Isi Tugas:
1. Pada tugas ini membuat sebuah sistem informasi koperasi yang terdapat 2 class yaitu class InformasiKoperasi yang memiliki atribut, parameter, dan method, dan class ke 2 yaitu class InformasiMain yang digunakan untuk menampilkan hasil dari class InformasiKoperasi
2. Pada class InformasiKoperasi memiliki atribut mKtp, mNama, mJumlahPinjam, mLimit 
)

### Tugas 5
(
![contoh screenshot](img/Tugas_2.PNG)
![contoh screenshot](img/Tugas_2.1.PNG)
![contoh screenshot](img/Tugas_2.2.PNG)
![contoh screenshot](img/Tugas_2.4.PNG)
![contoh screenshot](img/Tugas_2.5.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/InformasiKoperasi1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/InformasiMain1841720207Bayu.java)

Isi Tugas:
1. Pada tugas ini kita hanya perlu memodifikasi tugas ke     4 yaitu pada method ansurBayu() kita hanya perlu          memberikan kondisi jumlah angsuran minimal harus 10%      dari jumlah pinjam
)

### Tugas 6
(
![contoh screenshot](img/Tugas_2.PNG)
![contoh screenshot](img/Tugas_2.1.PNG)
![contoh screenshot](img/Tugas_2.2.PNG)
![contoh screenshot](img/Tugas_2.4.PNG)
![contoh screenshot](img/Tugas_2.6.PNG)

Contoh link kode program : [ini contoh link ke kode program](../../src/InformasiKoperasi1841720207Bayu.java)
Contoh link kode program : [ini contoh link ke kode program](../../src/InformasiMain1841720207Bayu.java)

Isi Tugas:
1. Pada tugas ini kita hanya perlu melakukan modifikasi pada class InformasiMain agar bisa menerima input dari console
)
## Kesimpulan

(Dari percobaan dan tugas diatas kita sudah mempelajari tentang enkapsulasi, pembuatan konstruktor, implementasi getter dan setter, acces modifier yang memiliki 4 jenis yaitu public, protected, default dan private, atribut/method dalam class, dan instansiasi atribut/method)

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***