# Laporan Praktikum #7 - Overloading dan Overriding

## Kompetensi

Mampu memahami konsep:
1. Memahami konsep overloading dan overriding, 

2. Memahami perbedaan overloading dan overriding, 	

3. Ketepatan dalam mengidentifikasi method overriding    dan overloading 	

4. Ketepatan dalam mempraktekkan instruksi pada          jobsheet 

5. Mengimplementasikan method overloading dan            overriding. 

## Ringkasan Materi

 1. Overloading.

    Overloading  adalah menuliskan kembali method dengan nama yang sama pada suatu class. Tujuannya dapat memudahkan penggunaan/pemanggilan method dengan fungsionalitas yang mirip. Untuk aturan pendeklarasian method Overloading sebagai berikut:
      * Nama method harus sama. 
      * Daftar parameter harus berbeda. 
      * Return type boleh sama,juga boleh berbeda. 

2. Overriding.
  
   Overriding adalah Sublass yang berusaha memodifkasi tingkah laku yang diwarisi dari superclass.

   Tujuannya subclass dapat memiliki tingkah laku yang lebih spesifik sehingga dapat dilakukan dengan cara mendeklarasikan kembali method milik parent class di subclass. Deklarasi method pada subclass harus sama dengan yang terdapat di super class. Kesamaan pada: 

   * Nama 
   * Return type (untuk return type : class A atau      merupakan subclass dari class A) 
   * Daftar parameter (jumlah, tipe dan urutan) 

   Sehingga method pada parent class disebut overridden method dan method pada subclass  

## Percobaan

### Percobaan 1 

1. Class Karyawan:
  ![Karyawan1841720207Bayu](img/per1.1.PNG)
  ![Karyawan1841720207Bayu](img/per1.2.PNG)

   link kode program : 
   [link ke kode program ](../../src/Karyawan1841720207Bayu.java)

2. Class Staff:
   ![Staff1841720207Bayu](img/per1.3.PNG)
   ![Staff1841720207Bayu](img/per1.4.PNG)
  
   link kode program : 
   [link ke kode program](../../src/Staff1841720207Bayu.java)

3. Class Manager:
   ![Staff1841720207Bayu](img/per1.5.PNG)
   ![Staff1841720207Bayu](img/per1.6 .PNG)
  
   link kode program : 
   [link ke kode program](../../src/Manager1841720207Bayu.java)

4. Class Main:
   ![Utama1841720207Bayu](img/perMain1.1.PNG)
   ![Utama1841720207Bayu](img/peraMain1.2.PNG)
  
   link kode program : 
   [link ke kode program](../../src/Utama11841720207Bayu.java)

### Pertanyaan Latihan

  ![Soal](img/latSoal1.1.PNG)

1. Dari source coding diatas terletak dimanakah          overloading? 

2. Jika terdapat overloading ada berapa jumlah           parameter yang berbeda?

  ![Soal](img/latSoal1.2.PNG)

3. Dari source coding diatas terletak dimanakah          overloading? 

4. Jika terdapat overloading ada berapa tipe             parameter yang berbeda? 
 
  ![Soal](img/latSoal1.3.PNG)

5. Dari source coding diatas terletak dimanakah          overriding? 

6. Jabarkanlah apabila sourcoding diatas jika            terdapat overriding? 
  
### Jawaban Pertanyaan

1. Overloading terletak pada baris kode di bawah ini
  ![Jawaban](img/jawab1.1.PNG)

2. Ada satu parameter yang berbeda yaitu int c

3. Ada yang Overloading terletak pada baris kode di      bawah ini
  ![Jawaban](img/jawab1.2.PNG)

4. Ada 2 tipe parameter yang berbeda yaitu parameter     double a dan double b karena pada method yang         pertama menggunakan parameter int a dan int b

5. Overriding terletak pada baris kode di bawah ini
  ![Jawaban](img/jawab1.3.PNG)

6. Kode program diatas memiliki overriding yang di       tandai dengan deklarasi method pada subclass sudah    sama dengan deklarasi method pada superclass dan      juga pada subclass override method nya hanya satu



### Tugas

### Hasil Tugas 1
1. Class Segitiga:
    ![Segitiga1841720207Bayu](img/tuga1.1.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Segitiga1841720207Bayu.java)

2. Class Main: 
    ![MainSegitiga1841720207Bayu](img/tugasMain1.1.PNG)
    
    link kode program : 
    [link ke kode program](../../src/MainSegitiga1841720207Bayu.java)

### Hasil Tugas 2

1. Class Manusia:
    ![Manusia1841720207Bayu](img/tugas2.1.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Manusia1841720207Bayu.java)

2. Class Dosen:
    ![Dosen1841720207Bayu](img/tugas2.2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Dosen1841720207Bayu.java)

3. Class Mahasiswa:
    ![MainManusia1841720207Bayu](img/tugasMain2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/MainManusia1841720207Bayu.java)


## Kesimpulan

Dari percobaan dan tugas diatas kita sudah mempelajari tentang Overrloading dan Overriding

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***