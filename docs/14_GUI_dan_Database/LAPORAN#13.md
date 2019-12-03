# Laporan Praktikum #13 - GUI dan Database 

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
   ![Hasil](img/per5.2.PNG)

   link kode program: 
   [link ke kode program ](../../src/TestBackend1841720207Bayu.java)

   Hasil program yang saya buat masih error


## Kesimpulan

        
## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***