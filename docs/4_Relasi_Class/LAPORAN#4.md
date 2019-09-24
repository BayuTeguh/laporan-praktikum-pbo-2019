# Laporan Praktikum #4 - Relasi Kelas

## Kompetensi
1. Memahami konsep relasi kelas
2. Mampu mengimplementasikan relasi kelas

## Ringkasan Materi
Pada praktikum kali ini akan mempelajari tentang relasi kelas atau hubungan antar kelas misalnya  class Laptop yang memiliki atribut berupa merk dan prosesor. Jika diperhatikan lebih rinci, maka atribut prosesor sendiri didalamnya memiliki data berupa merk, nilai cache memori, dan nilai clock‑nya. Artinya, ada class lain yang namanya Processor yang memiliki atribut merk, cache dan clock, dan atribut prosesor yang ada di dalam class Laptop itu merupakan objek dari class Proceessor tersebut

## Percobaan

### Percobaan 1 

1. Class Laptop dan Processor:
  ![Class processor](img/Processor.PNG)
  ![Class laptop](img/Laptop.PNG)
  link kode program :
  [link ke kode program](../../src/Processor1841720207Bayu.java)

  [link ke kode program](../../src/Laptop1841720207Bayu.java)

2. Class Main
  ![Class main](img/MainPer_1.PNG)
  link kode program : 
  [ link ke kode program](../../src/MainPercobaan11841720207Bayu.java)

### Pertanyaan Percobaan 1

Berdasarkan percobaan 1, jawablah pertanyaan‑pertanyaan yang terkait: 
1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ? 
2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ? 
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ? 
4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ? 
5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?
 6. Pada class MainPercobaan1, terdapat baris kode: 
Laptop l = new Laptop("Thinkpad", p);. 
Apakah p tersebut ? Dan apakah yang terjadi jika baris kode tersebut diubah menjadi: 
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
 Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ? 

### Jawaban Pertanyaan 1

1.	Kerena dalam class processor dan laptop atribut nya private       jadi method setter dan getter di gunakan untuk mengambil dan      memanipulasi nilai dari atribut tersebut.
2.	Perbedaan antara kontruktor default dan berparameter adalah       pada konstruktor default digunakan untuk memberikan nilai         pada saat objek di buat/instansiasi objek.
3.	Proc
4.	Pada baris  private Processor1841720207Bayu mProc;
5.	sintaks proc.info() digunakan untuk memanggil informasi dari      class Processor.
6.	
    * P adalah objek dari class Processor
    * Hasil yang dimunculkan sama saja.

### Percobaan 2 

1. Class Sopir, Pelanggan, dan Mobil:
  ![class sopir](img/Sopir.PNG)
  ![class mobil](img/Mobil.PNG)
  ![class mobil](img/Pelanggan.PNG)

  link kode program : 
  [link ke kode program](../../src/Sopir1841720207Bayu.java)

  [link ke kode program](../../src/Mobil1841720207Bayu.java)

  [link ke kode program](../../src/Pelanggan1841720207Bayu.java)

2. Class Main:
   ![class main](img/MainPer_2.PNG)
    Link kode program : 
    [ini link ke kode program](../../src/MainPercobaan21841720207Bayu.java)

### Pertanyaan Praktikum 2

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ? 
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ? 
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ? 
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s) ? 
5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut ? 
6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run! 
System.out.println(p.getMobil().getMerk()); 
 Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut? 

### Jawaban Pertanyaan

1.	Pada baris private Mobil1841720207Bayu mMobil; dan private        Sopir1841720207Bayu mSopir;
2.	Karena argument hari digunakan untuk menyimpan berapa banyak      jumlah hari yang akan digunakan untuk menghitung berapa           banyak biaya perhari
3.	Ke dua perintah tersebut digunakan untuk menjumlahkan berapa      banyak jumlah biaya total dari class mobil dan class sopir
4.	Ke dua sintaks itu digunakan untuk memanggil method               p.setmMobilBayu() dan p.setmSopirBayu() dari class pelanggan      yang akan di isi objek yang sebelumnya telah di buat dari         class Mobil dan class Sopir
5.	p.hitungBiayaTotal() adalah proses untuk menampilkan berapa       banyak biaya total, yang sebelumnya sudah di hitung pada          method hitungBiayaTotal()
6.	Perubahan terjadi pada hasil run yang sebelumnya tidak ada        merk dan setelah sintaks diatas ditambahkan hasil run             memunculkan merk, jadi kalau menurut saya sintaks tersebut di     gunakan untuk mengakses nama merk dari class mobil dan            mengakses class mobil.


### Percobaan 3 
(
1.  Class Pegawai dan KeretaApi
    ![class pegawai](img/Pegawai.PNG)
    ![class KeretaApi](img/Kereta.PNG)
    link kode program : 
    [ini link ke kode program](../../src/Pegawai1841720207Bayu.java)

    [ini link ke kode program](../../src/KeretaApi1841720207Bayu.java)
    
2. Class Main
    ![class main](img/MainPer_3.PNG)
    link kode program :
    [ini link ke kode program](../../src/MainPercobaan31841720207Bayu.java)

### Pertanyaan Percobaan 3
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa ?

2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main() ! 
Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis); System.out.println(keretaApi.info()); 
 
3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ? 

4. Perbaiki class KeretaApi sehingga program dapat berjalan !

### Jawaban Pertanyaan

1.	Untuk mengakses info dari masinis dan asisten yang sebelumnya     telah di buat pada class pegawai

2. Hasil running:
  ![class pegawai](img/error.PNG)

3.	Karena pada class MainPertanyaan tersebut saat kita mengakses     method infoBayu() dari class KeretaApi kita harusnya              membentuk objek asisten juga di class MainPertanyaan

4.	Cara memperbaikinya adalah dengan membuat objek asisten atau      menghapus baris this.asisten.info() pada method info() dari       class KeretaApi

### Percobaan 4 
(
1. Class Penumpang, Kursi, dan Gerbong
    ![class penumpang](img/Penumpang.PNG)
    ![class Kursi](img/Kursi.PNG)
    ![class Gerbong](img/Gerbong.PNG)
    link kode program : 
    [ini link ke kode program class penumpang](../../src/Penumpang1841720207Bayu.java)

    [ini link ke kode program class kursi](../../src/Kursi1841720207Bayu.java)

    [ini link ke kode program class gerbong](../../src/Gerbong1841720207Bayu.java)

2. Class Main:
    ![class main](img/MainPer_4.PNG)
    link kode program : 

    [ini link ke kode program main](../../src/MainPercobaan41841720207Bayu.java)


### Pertanyaan percobaan 4
Pertanyaan:
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ?

2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut ? 
... if (this.penumpang != null) { info += "Penumpang: " + penumpang.info() + "\n"; } ... 

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ? 

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ? 

5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain ! 

### Jawaban Pertanyaan:
Jawaban:
1.	10 kursi
2.	Jika penumpang terisi maka info penumpng akan ditambahkan
3.	Karena pada class MainPercobann4 pada baris               gerbong.setPenumpangBayu(p, 1); kita memberikan nilai 1 pada    nomor itu artinya kita memberikan nilai pada index ke-0 pada kursi nomor 1
4. ![class main](img/Penumpang_Budi.PNG)
5. ![class main](img/Percobaan4_rev.PNG)

## Tugas

1. Class Pembeli, Kurir, Barang, dan Penjual
![class pembeli](img/Pembeli.PNG)
![class kurir](img/Kurir.PNG)
![class barang](img/Barang.PNG)
![class penjual](img/Penjual.PNG)
![class penjual lanjut](img/Penjual2.PNG)

link kode program : 

[ini link ke kode program pembeli](../../src/Pembeli1841720207Bayu.java)

[ini link ke kode program Kurir](../../src/Kurir1841720207Bayu.java)

[ini link ke kode program Kurir](../../src/Barang1841720207Bayu.java)

[ini link ke kode program Kurir](../../src/Penjual1841720207Bayu.java)

2. class Main
![class main](img/MainTugas.PNG)

link kode program : 

[ini link ke kode program pembeli](../../src/MainTugas1841720207Bayu.java)

Isi Tugas:
1.  Pada tugas di atas memiliki method getter dan setter karena       atribut bertipe private, dan pada masing-masing class di atas     memiliki method hitung untuk menghitung berapa banyak harga.      Kecuali pada class main. 

2. Pada class main di atas saya hanya menggunakan method             hitungHargaBarang() untuk menghitung berapa banyak harga barang
   yang harus di bayar.

## Kesimpulan

Pada praktikum kali ini mahasiswa mempelajari tentang relasi kelas yaitu menggabungkan beberapa class yang saling berhubungan,
dan juga pada praktikum kali ini mahasiswa juga mempelajari implementasi array

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***