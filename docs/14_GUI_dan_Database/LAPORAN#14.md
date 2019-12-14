# **Laporan Praktikum #14 - GUI dan Database** 

## Kompetensi
Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal: 
1. Menggunakan paradigma berorientasi objek untuk interaksi dengan database 
2. Membuat backend dan frontend 
3. Membuat form sebagai frontend 

## Ringkasan Materi

Kali ini kita akan menggunakan paradigma berorientasi objek yang telah kita pelajari untuk membuat aplikasi berbasis database dan dilengkapi dengan form sebagai Graphical User Interface (GUI). 
Secara umum, tahapan yang akan kita lakukan adalah sebagai berikut: 
1. Membuat database dan tabel-tabelnya. 
2. Membuat backend yang berisi class-class yang mewakili data yang ada pada database, dan class helper untuk melakukan eksekusi query database. 
3. Membuat frontend yang merupakan antarmuka kepada pengguna. Frontend ini bisa berbasis teks (console), GUI, web, mobile, dan sebagainya. 

Library yang digunakan untuk project ini antara lain: 
1. JDBC, untuk melakukan interaksi ke database. 
2. ArrayList, untuk menampung data hasil query ke database. 
3. Swing, untuk membuat tampilan GUI. 

## Percobaan

### Percobaan 1 Membuat database
A. Langkah Percobaan (HashSet) 

1. Langkah pertama untuk percobaan ini adalah membuat database. Install XAMPP, buka phpMyAdmin, buat database **dbperpus**, dan tabel-tabelnya:

    ![Soal 1](img/soal1.1.PNG)

    Set semua primary key id pada tiap tabel (idanggota, idkategori, idpeminjaman, idbuku) dengan **Auto Increment.** 
  
2. Pembuatan database dbperpus dan tabel kategory:

   ![database](img/per1.1.PNG)

3. Pembuatan tabel buku:

    ![database](img/per1.2.PNG)

4. Pembuatan tabel anggota:

    ![database](img/per1.3.PNG)

5. Pembuatan tabel peminjaman:

    ![database](img/per1.4.PNG)

6. Relasi antar tabel:

    ![database](img/per1.5.PNG)

### Percobaan 2 Mempersiapkan project

1. Pembuatan project, package, dan add depedency:
  ![project](img/Per2.PNG)



### Percobaan 3 Membuat class helper untuk mengeksekusi query SQL.

1. Pada package **backend**, buat class **DBHelper.** 
2. Pembuatan Class DBHelper:
  ![DBHelper1841720207Bayu](img/Per3.1.PNG)
  ![DBHelper1841720207Bayu](img/Per3.2.PNG)
  ![DBHelper1841720207Bayu](img/Per3.3.PNG)

   link kode program: 
   [link ke kode program ](../../src/DBHelper1841720207Bayu.java)

  * Pembuatan class diatas sesuai dengan yang ada pada praktikum karena setting xampp default.


### Percobaan 4 Membuat class **Kategori** untuk menghandle CRUD pada tabel kategori. 

1. Pada package **backend**, buat class baru yaitu **Kategori.** 

2. Class Kategori:
  ![Kategori1841720207Bayu](img/Per4.1.PNG)
  ![Kategori1841720207Bayu](img/Per4.2.PNG)
  ![Kategori1841720207Bayu](img/Per4.3.PNG)
  ![Kategori1841720207Bayu](img/Per4.4.PNG)

   link kode program: 
   [link ke kode program ](../../src/Kategori1841720207Bayu.java)


### Percobaan 5 Mencoba backed yang sudah dibuat 

1. Class TestBackend:
  ![TestBackend1841720207Bayu](img/per5.1.PNG)

2.  Hasil:
   ![Hasil](img/per5.3.PNG)

   link kode program: 
   [link ke kode program ](../../src/TestBackend1841720207Bayu.java)

   Pda class TestBackend ini akan digunakan sebagai class main dari class sebelumnya 

### Percobaan 6 membuat interface GUI untuk class Kategori. 

1. Class TestBackend:
  ![FrmKategory1841720207Bayu](img/per6.1.PNG)
  ![FrmKategory1841720207Bayu](img/per6.2.PNG)
  ![FrmKategory1841720207Bayu](img/per6.3.PNG)
  ![FrmKategory1841720207Bayu](img/per6.4.PNG)
  ![FrmKategory1841720207Bayu](img/per6.5.PNG)

2.  Hasil:
   ![Hasil](img/per6.6.PNG)

   link kode program: 
   [link ke kode program](../../src/FrmKategory1841720207Bayu.java)

3. Class Anggota
  ![Anggota1841720207Bayu](img/per6.2.1.PNG)
  ![Anggota1841720207Bayu](img/per6.2.2.PNG)
  ![Anggota1841720207Bayu](img/per6.2.3.PNG)
  ![Anggota1841720207Bayu](img/per6.2.4.PNG)
  ![Anggota1841720207Bayu](img/per6.2.5.PNG)

  * Pada gambar diatas menunjukkan pembuatan class anggota yang digunakan untuk menyimpan data dari anggota.

4. Hasil:
   ![Hasil](img/per6.hasil.PNG)
   ![Hasil](img/per6.hasil.2.PNG)

   link kode program: 
   [link ke kode program](../../src/TestBackendAnggota1841720207Bayu.java)

   * Pada langkah ke-4 ini adalah pembuatan class main dari class anggota

### Percobaan 7 Membuat form untuk anggota

1. Class FrmAnggota:

  * Tampilan GUI dari Anggota:
  ![FrmAnggota1841720207Bayu](img/per7.1.PNG)

  * Source code:
  ![FrmAnggota1841720207Bayu](img/per7.2.PNG)
  ![FrmAnggota1841720207Bayu](img/per7.3.PNG)
  ![FrmAnggota1841720207Bayu](img/per7.4.PNG)
  ![FrmAnggota1841720207Bayu](img/per7.5.PNG)
  ![FrmAnggota1841720207Bayu](img/per7.6.PNG)

2.  Hasil:
   ![Hasil](img/hasilPer7.1.PNG)

   link kode program: 
   [link ke kode program](../../src/FrmAnggota1841720207Bayu.java)

   * Pada hasil diatas digunakan fungsi hapus untuk anggota 1

3. Class Buku:
  ![Buku1841720207Bayu](img/per7.2.1.PNG)
  ![Buku1841720207Bayu](img/per7.2.2.PNG)
  ![Buku1841720207Bayu](img/per7.2.3.PNG)
  ![Buku1841720207Bayu](img/per7.2.4.PNG)
  ![Buku1841720207Bayu](img/per7.2.5.PNG)
  ![Buku1841720207Bayu](img/per7.2.6.PNG)
  ![Buku1841720207Bayu](img/per7.2.7.PNG)

4. Hasil:
  ![Hasil](img/hasilPer7.2.1.PNG)
  ![Hasil](img/hasilPer7.2.2.PNG)

   link kode program: 
   [link ke kode program](../../src/TestBackendBuku1841720207Bayu.java)

  * Program buku diatas masih error (:
  ![Error](img/per7.7.PNG)

### Percobaan 8 Membuat GUI untuk data Buku

1. Class FrmBuku:

  * Tampilan GUI dari Buku:
  ![FrmBuku1841720207Bayu](img/per8.1.PNG)

  * Source code:
  ![FrmBuku1841720207Bayu](img/per8.2.PNG)
  ![FrmBuku1841720207Bayu](img/per8.3.PNG)
  ![FrmBuku1841720207Bayu](img/per8.4.PNG)
  ![FrmBuku1841720207Bayu](img/per8.5.PNG)
  ![FrmBuku1841720207Bayu](img/per8.6.PNG)
  ![FrmBuku1841720207Bayu](img/per8.7.PNG)

2. Hasil:
  ![Hasil](img/per8.8.PNG)
  
   link kode program: 
   [link ke kode program](../../src/FrmBuku1841720207Bayu.java)

  * Program buku diatas masih error dikarenakan class  buku masih error(:
  

### Tugas 

* Dikarenakan program buku yang saya buat masih error jadinya tugas tidak bisa dikerjakan dengan baik.

  
## Kesimpulan

  Dai banyak percobaan diatas yang sudah dilakukan kita telah mempelajari cara membuat dan menghubungkan GUI ke database, membuat frontend dan backend dan juga menginput data dari GUI ke database dan menampilkanya, ada beberapa program saya diatas yang masih error dikarenakan time zone pada database belum ikut indonesia dan setiap database yang dibuat harus di setting secara manual time zone tersebu, selain itu setiap neatbeans di close dan di open lagi maka time zone harus di atur ulang lagi. Sampai sekarang saya masih belum menemukan solusi untuk membetulkan program saya yang masih error.
## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***