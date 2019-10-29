# Laporan Praktikum #9 - Abstract Class dan Interface

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 

1. Menjelaskan maksud dan tujuan penggunaan Abstract Class; 

2. Menjelaskan maksud dan tujuan penggunaan Interface;

3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 
 

## Ringkasan Materi

 1. Abstract Class.

    Abstract Class adalah class yang tidak dapat diinstansiasi namun dapat di-extend. Abstract class baru dapat dimanfaatkan ketika ia di-extend. 

    Karakteristik: 
    
    * Dapat memiliki properties dan methods seperti class biasa. 
    
    * Selalu memiliki methods yang tidak memiliki       tubuh (hanya deklarasinya saja), disebut juga     abstract method. 
    
    * Selalu dideklarasikan dengan menggunakan kata kunci abstract class. 

    Kegunaan: 
    
    Menggambarkan sesuatu yang bersifat umum, yang hanya bisa berfungsi setelah ia dideskripsikan ke dalam bentuk yang lebih spesifik. 
 
 

2. Interface.
  
   Interface adalah struktur data yang hanya berisi abstract methods. Tidak ada apa-apa selain method abstract pada interface, termasuk atribut getter dan setter.  
 
   Karakteristik: 
   
   * Tidak ada apa-apa di dalamnya selain abstract methods. 
   
   * Di konvensi bahasa pemrograman Java, namanya dianjurkan untuk selalu diawali dengan huruf kapital ‘I’. 
   
   * Selalu dideklarasikan dengan menggunakan kata kunci interface. 
   
   * Diimplementasikan dengan menggunakan kata kunci implements. 

## Percobaan

### Percobaan 1 Abstract Class

1. Abstract Class Hewan:
  ![Hewan1841720207Bayu](img/per1.1.PNG)

   link kode program : 
   [link ke kode program ](../../src/Hewan1841720207Bayu.java)

2. Class Kucing:
   ![Kucing1841720207Bayu](img/per1.2.PNG)
  
   link kode program : 
   [link ke kode program](../../src/Kucing1841720207Bayu.java)

3. Class Ikan:
   ![Ikan1841720207Bayu](img/per1.3.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Ikan1841720207Bayu.java)

4. Class Orang:
   ![Orang1841720207Bayu](img/per1.4.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Orang1841720207Bayu.java)

5. Class Main:
   ![Program1841720207Bayu](img/perMain1.5.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Program1841720207Bayu.java)


### Pertanyaan diskusi

1. Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan! 
  
### Jawaban Pertanyaan

1. Suatu class yang meng-extend suatu abstract class harus mengimplementasikan menthod abstract yang ada pada class abstract tersebut, dan tidak boleh tidak mengimpelementasikanya, kalau hal tersebut dilakukan maka akan muncul peringatan error yaitu class tersebut bukan class abtract dan tidak meng-override abstract method yang ada pada class abtract seperti dibawah ini:

    ![Pebuktian Error](img/jawab1.1.PNG)


### Percobaan 2 Interface

1. Interface ICumlaude :
  ![ICumlaude1841720207Bayu](img/per2.1.PNG)

   link kode program : 
   [link ke kode program ](../../src/ICumlaude1841720207Bayu.java)

2. Class Mahasiswa:
   ![Mahasiswa1841720207Bayu](img/per2.2.PNG)
  
   link kode program : 
   [link ke kode program](../../src/Mahasiswa1841720207Bayu.java)

3. Class Sarjana:
   ![Sarjana1841720207Bayu](img/per2.3.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Sarjana1841720207Bayu.java)

4. Class PascaSarjana:
   ![PascaSarjana1841720207Bayu](img/per2.4.PNG)
   
   link kode program : 
   [link ke kode program](../../src/PascaSarjana1841720207Bayu.java)

5. Class Rektor:
   ![Rektor1841720207Bayu](img/per2.5.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Rektor1841720207Bayu.java)

6. Class Main:
   ![ProgramMain1841720207Bayu](img/perMain2.6.PNG)
   
   link kode program : 
   [link ke kode program](../../src/ProgramMain1841720207Bayu.java)

### Pertanyaan diskusi

1. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! 

2. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian? 

3. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian? 

4. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: 

    ![Soal](img/soal2.PNG)
  
### Jawaban Pertanyaan

1. Karena pada class Mahasiswa belum mengimplementasi interface ICumlaude

2. Bisa, karena class Sarjana merupakan turunan dari class Mahasiswa

3. Tidak bisa, karena class Rektor bukan turunan dari class Mahasiswa karena itu class Rektor tidak dapat mengakses method pada class Mahasiswa

4. Hasil modifikasi sesuai perintah pada pertanyaan no 4
![Jawaban](img/jawab2.PNG)


### Percobaan 3 Multiple Interfaces Implementation 

1. Interface ICumlaude :
  ![ICumlaude1841720207Bayu](img/per2.1.PNG)

   link kode program : 
   [link ke kode program ](../../src/ICumlaude1841720207Bayu.java)

2. Interface IBerprestasi :
  ![IBerprestasi1841720207Bayu](img/per3.1.PNG)

   link kode program : 
   [link ke kode program ](../../src/IBerprestasi1841720207Bayu.java)

3. Class Mahasiswa:
   ![Mahasiswa1841720207Bayu](img/per2.2.PNG)
  
   link kode program : 
   [link ke kode program](../../src/Mahasiswa1841720207Bayu.java)

4. Class Sarjana:
   ![Sarjana1841720207Bayu](img/per2.3.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Sarjana1841720207Bayu.java)

5. Class PascaSarjana:
   ![PascaSarjana1841720207Bayu](img/per3.2.PNG)
   
   link kode program : 
   [link ke kode program](../../src/PascaSarjana1841720207Bayu.java)

6. Class Rektor:
   ![Rektor1841720207Bayu](img/per3.3.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Rektor1841720207Bayu.java)

7. Class Main:
   ![ProgramMain1841720207Bayu](img/perMain3.1.PNG)
   
   link kode program : 
   [link ke kode program](../../src/ProgramMain1841720207Bayu.java)

### Pertanyaan diskusi

1. Pertanyaan diskusi: Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude.
 ![Soal](img/soal3.PNG)
  
### Jawaban Pertanyaan

1. Hasil modifikasi sesuai perintah pada pertanyaan diatas
![Jawaban](img/jawaban3.PNG)


## Kesimpulan

Dari percobaan dan tugas diatas kita sudah mempelajari tentang Abstraction, Interface, dan Multiple Interface

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***