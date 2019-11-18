# Laporan Praktikum #12 - Collection (List, Set, Map) dan Database 

## Kompetensi
* Memahami cara penyimpanan objek menggunakan Collection dan Map. 
* Mengetahui pengelompokan dari Collection. 
* Mengetahui perbedaan dari interface Set, List dan Map. 
* Mengetahui penggunaan class-class dari interface Set, List, dan Map. 
* Memahami koneksi database menggunakan JDBC dan JDBC API 

## Ringkasan Materi

Collection adalah suatu objek yang bisa digunakan untuk menyimpan sekumpulan objek. Objek yang ada dalam Collection disebut elemen. Collection menyimpan elemen yang bertipe Object, sehingga berbagai tipe object bisa disimpan dalam Collection. Class-class mengenai Collection tergabung dalam Java Collection Framework. Class-class Collection diletakkan dalam package java.util dan mempunyai dua interface utama yaitu Collection. 

Collection terbagi menjadi 3 kelompok yaitu:

* **Set**

    Set mengikuti model himpunan, dimana objek/anggota yang tersimpan dalam Set harus unik. Urutan maupun letak dari anggota tidak penting, hanya keberadaan anggota saja yang penting. Kelas konkrit yang mengimplementasikan Set harus memastikan bahwa tidak terdapat elemen duplikat yang dapat ditambahkan ke dalam set. Yaitu, tidak terdapat dua elemen e1 dan e2 yang berada di dalam set yang membuat e1.equals(e2) bernilai true. ClassClass yang mengimplementasikan interface Set adalah HashSet.

    HashSet dapat digunakan untuk menyimpan elemen-elemen bebas-duplikat. Kelas HashSet merupakan suatu kelas konkrit yang mengimplementasikan Set. Pembuatan objek HashSet adalah sebagai berikut: 

    **Set <nama_objek_HashSet> = new HashSet();** 


* **List**

    List digunakan untuk menyimpan sekumpulan objek berdasarkan urutan masuk (ordered) dan menerima duplikat. Cara penyimpanannya seperti array, oleh sebab itu memiliki posisi awal dan posisi akhir, menyisipkan objek pada posisi tertentu, mengakses dan menghapus isi list, dimana semua proses ini selalu didasarkan pada urutannya. Class-class yang mengimplementasikan interface List adalah Vector, Stack, Linked List dan Array List. Pada jobsheet ini yang akan dibahas adalah ArrayList.

    ArrayList digunakan untuk membuat array yang ukurannya dinamis. Berbeda dengan array biasa yang ukurannya harus ditentukan di awal deklarasi array, dengan ArrayList, ukurannya akan fleksibel tergantung banyaknya elemen yang dimasukkan. Pendeklarasian object ArrayList sebaiknya diikuti dengan nama class yang akan dimasukkan dalam List tersebut. 
    Tujuannya agar method dan property dari setiap object dalam ArrayList dapat diakses secara langsung.  Pembuatan objek ArrayList adalah sebagai berikut: 

    **ArrayList <nama_objek_arraylist>=new ArrayList();**


* **Map**

    Perbedaaan mendasar map dengan collection yang lain, untuk menyimpan objek pada Map, perlu sepasang objek, yaitu key yang bersifat unik dan nilai yang disimpan. Untuk mengakses nilai tersebut maka kita perlu mengetahui key dari nilai tersebut. Map juga dikenal sebagai dictionary/kamus. Pada saat menggunakan kamus, perlu suatu kata yang digunakan untuk pencarian. Class-class yang mengimplementasikan Map adalah Hashtable,HashMap, LinkedHashMap. Pada jobsheet ini yang akan dibahas adalah HashMap.

    HashMap adalah class implementasi dar Map, Map itu sendiri adalah interface yang memiliki fungsi untuk memetakan nilai dengan key unik. HashMap berfungsi sebagai memory record management, dimana setiap record dapat disimpan dalam sebuah Map. kemudian setiap Map diletakkan pada vektor, list atau set yang masih turunan dari collection. Pembuatan objek HashMap adalah sebagai berikut:

    **HashMap <nama_objek_HashMap> = new HashMap();**


* **JDBC API**

    JDBC API merupakan Java Database Connectivity Application Programming Interface ( JDBC  API). Pada dasarnya JDBC API terdiri dari satu set kelas dan interface yang digunakan untuk berinteraksi dengan database dari aplikasi Java. Umumnya, JDBC API melakukan 3 (tiga) fungsi berikut :
    * Membangun koneksi antara aplikasi Java dan database  
    * Membangun dan mengeksekusi query  
    * Memproses hasil

## Percobaan

### Percobaan 1 Set
A. Langkah Percobaan (HashSet) 

1. Buatlah package dengan nama identifier.percobaan1, misalnya : arie.percobaan1. 
2. Class CobaHashSet:

   ![CobaHashSet1841720207Bayu](img/Per1.1.PNG)

   link kode program: 
   [link ke kode program ](../../src/CobaHashSet1841720207Bayu.java)

### Pertanyaan Percobaan 1
1. Apakah fungsi **import java.util.*;** pada program diatas! 
2. Pada baris program keberapakah yang berfungsi untuk menciptakan object HashSet? 
3. Apakah fungsi potongan program dibawah ini pada percobaan 1! 
        
    ![Soal Percobaan 1](img/SoalPer1.PNG)
4. Tambahkan **set.add(“Malang”);** kemudian jalankan program! Amati hasilnya dan jelaskan mengapa terjadi error!
5. Jelaskan fungsi potongan program dibawah ini pada percobaan 1! 

    ![Soal Percobaan 1](img/SoalPer1.1.PNG)

### Jawaban Pertanyaan

1. Fungsi fungsi **import java.util.*;** adalah untuk mengakses semua fungsi **import java.util** yang ada pada class tersebut.

2. Pada baris ke-8

3. Fungsi potongan program tersebut digunakan untuk mengisi objek dari HashSet dengan nilai-nilai tersebut.

4. Error pada program tersebut disebabkan oleh kode set itu bukan objek atau atribut dari class tersebut.

5. mIterator digunakan untuk mengakses interface iterator. Dan while(mIterator.hasNext()) digunakan untuk mengecek apakah mIterator mempunyai elemen selanjutnya atau tidak. System.out.println(mIterator.next().toLowerCase()); digunakan untuk menampilkan hasil dengan huruf kecil semua.

### Percobaan 2 Menangani Input Pada GUI

1. Class CobaArrayList:
  ![CobaArrayList1841720207Bayu](img/Per2.1.PNG)

   link kode program: 
   [link ke kode program ](../../src/CobaArrayList1841720207Bayu.java)

### Pertanyaan Percobaan 2
1. Apakah fungsi potongan program dibawah ini! 
  ![Soal Percobaan 2](img/SoalPer2.1.PNG)

2. Ganti potongan program pada soal no 1 menjadi sebagai berikut 
  ![Soal Percobaan 2](img/SoalPer2.2.PNG)
  Kemudian jalankan program tersebut!

3. Jelaskan perbedaan menampilkan data pada ArrayList menggunakan potongan program pada soal no 1 dan no 2!

### Jawaban Pertanyaan    
1. Fungsi potongan program tersebut adalah untuk menampilkan list yang ada pada index ke-0 dan index ke-2.

2. Berikut ini adalah hasil running potongan program diatas:
    ![Jawaban](img/JawabPer2.1.PNG)

3. Perbedaannya ada pada penggunaan interface Iterator dan data pada ArrayList soal 2 ditampilkan semua secara horizontal. 

### Percobaan 3 Map

1. Buatlah class baru dengan nama DemoHashMap
2. Class DemoHashMap:
  ![DemoHashMap1841720207Bayu](img/Per3.PNG)

   link kode program: 
   [link ke kode program ](../../src/DemoHashMap1841720207Bayu.java)

### Pertanyaan Percobaan 3

1. Jelaskan fungsi **hMapItem.put("1","Biskuit")** pada program! 

2. Jelaskan fungsi **hMapItem.size()** pada program!

3. Jelaskan fungsi **hMapItem.remove("1")** pada program! 

4. Jelaskan fungsi **hMapItem.clear()** pada program!

5. Tambahkan kode program yang di blok pada program yang sudah anda buat! 
![Soal Percobaan 3](img/SoalPer3.PNG)

6. Jalankan program dan amati apa yang terjadi! 

7. Apakah perbedaan program sebelumnya dan setelah ditambahkan kode program pada soal no 5 diatas? Jelaskan! 
  
### Jawaban Pertanyaan

1. Fungsi **hMapItem.put("1","Biskuit")** adalah untuk memberikan nilai pada item 1 HashMap

2. Fungsi **hMapItem.size()** adalah untuk menampilkan total item pada HashMap

3. Fungsi **hMapItem.remove("1")** adalah untuk menghapus item 1 pada HashMap

4. Fungsi **hMapItem.clear()** adalah untuk menghapus semua item yang ada pada HashMap

5. Penambahan kode program:
![Jawaban](img/JawabPer3.1.PNG)

6. Hasil running:

    ![Jawaban](img/JawabPer3.2.PNG)

7. Perbedaannya ada pada penggunaan interface Iterator dan item pada HashMap ditampilkan secara horizontal dan vertical. 

### Percobaan 4 Implementasi ArrayList dalam GUI

1. Buatlah class baru dengan nama Mahasiswa 

2. Class Mahasiswa:
  ![Mahsiswa1841720207Bayu](img/Per4.1.PNG)

   link kode program: 
   [link ke kode program ](../../src/Mahsiswa1841720207Bayu.java)

3. Selanjutnya buat class baru dengan nama input data

   ![InputData1841720207Bayu](img/Per4.2.PNG)

   link kode program: 
   [link ke kode program ](../../src/InputData1841720207Bayu.java)

3. Buatlah class Jframe baru dengan nama TampilGui 
  ![jFrame](img/per4.3.PNG)

4. Source code dari Jframe TampilGui  
  ![TampilGui1841720207Bayu](img/per4.4.PNG)
  ![TampilGui1841720207Bayu](img/per4.5.PNG)
  ![TampilGui1841720207Bayu](img/per4.6.PNG)

   link kode program: 
   [link ke kode program ](../../src/TampilGui1841720207Bayu.java)

5. Hasil Run Program:
   ![Hasil](img/HasilPer4.PNG)

### Percobaan 5 JTabPane, JTtree, JTable  

1. Class Swing2 Design:
  ![Design](img/per5.1.PNG)

2. Jbutton cmdtambah
  ![Source](img/per5.2.PNG)

5. Hasil Run Program:
   ![Hasil](img/per5.3.PNG)

   link kode program: 
   [link ke kode program ](../../src/Swing21841720207Bayu.java)

### Pertanyaan Percobaan 5

1. Apa kegunaan komponen swing JTabPane, JTtree, pada percobaan 5? 

2. Modifikasi program untuk menambahkan komponen JTable pada tab Halaman 1 dan tab Halaman 2 

### Jawaban Pertanyaan

1. Fungsi dari komponen swing JTabPane digunakan untuk merubah tampilan atau pindah tab dengan klik tab, sementara JTtree untuk menampung atau menampilkan hasil yang sudah ditambahkan

2. Hasil modif
    * Table halaman 1: 
![Table](img/per5.4.PNG)

    * Table halaman 2: 
![Table](img/per5.5.PNG)

## Kesimpulan

Dari percobaan dan tugas diatas kita sudah mempelajari tentang konsep dan contoh dari JFrame HelloGUI, Menangani Input Pada GUI, Manajemen Layout,
Membuat GUI Melalui IDE Netbeans, dan JTabPane, JTtree, JTabl.


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***