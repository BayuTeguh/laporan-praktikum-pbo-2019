# Laporan Praktikum #11 - GUI (Graphical User Interface)  

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Membuat aplikasi Graphical User Interface sederhana dengan bahasa pemrograman java; 
2. Mengenal komponen GUI seperti frame, label, textfield, combobox, radiobutton, checkbox, textarea, menu, serta table; 
3. Menambahkan event handling pada aplikasi GUI. 
 

## Ringkasan Materi
GUI 

Agar interaksi antara user dengan program tidak membosankan diperlukanlah sebuah interface yang menghubungkan antara user dengan  program dengan tampilan grafis, interface ini dinamakan dengan GUI(Graphical User Interface). Dalam pemrograman GUI terdapat beberapa bagian yang harus dilakukan yaitu: 
1. Membuat windows utama  
2. Menentukan komponen-komponen pendukung    program  
3. Menentukan tata letak layout agar nantinya semua komponen–komponen yang sudah dipersiapkan bisa diaatur sedemikian rupa  
4. Event Handling dari sebuah aktivitas, seperti penekanan button, check box dan lain-lain
 
Java Swing merupakan bagian dari JFC (Java Foundation Classes) yang menyediakan API untuk menangani hal yang berkaitan dengan GUI bagi program Java.  Kita bisa membedakan komponen Swing dengan komponen AWT, di mana pada umumnya kelas-kelas yang berada dalam komponen Swing diawali dengan huruf J, misal: JButton, JLabel, JTextField, JRadioButton. 
 
 
 
## Percobaan

### Percobaan 1 JFrame HelloGUI 

1. Class HelloGui:
  ![HelloGui1841720207Bayu](img/per1.1.PNG)

   link kode program: 
   [link ke kode program ](../../src/HelloGui1841720207Bayu.java)

### Percobaan 2 Menangani Input Pada GUI

1. Class MyInput:
  ![MyInputForm1841720207Bayu](img/per2.1.PNG)
  ![MyInputForm1841720207Bayu](img/per2.2.PNG)

   link kode program: 
   [link ke kode program ](../../src/MyInputForm1841720207Bayu.java)

2. Class Main:
   ![Main1841720207Bayu](img/per2.3.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Main1841720207Bayu.java)

### Pertanyaan Percobaan 2
1. Modifikasi kode program dengan menambahkan JButton baru untuk melakukan fungsi perhitungan penambahan, sehingga ketika button di klik (event click) maka akan menampilkan hasil penambahan dari nilai A dan B
  
### Jawaban Pertanyaan    
1. Jawaban:
  ![Main1841720207Bayu](img/Jawaban1.PNG)

   link kode program: 
   [link ke kode program ](../../src/Main1841720207Bayu.java)

### Percobaan 3 Manajemen Layout 
1. Class Border:
  ![Border1841720207Bayu](img/per3.1.PNG)

   link kode program: 
   [link ke kode program ](../../src/Border1841720207Bayu.java)

2. Class Grid:
  ![Grid1841720207Bayu](img/per3.2.PNG)

   link kode program: 
   [link ke kode program ](../../src/Grid1841720207Bayu.java)

3. Class Box:
  ![Box1841720207Bayu](img/per3.3.PNG)

   link kode program: 
   [link ke kode program ](../../src/Box1841720207Bayu.java)

4. Class LayoutGUI:
  ![LayoutGUI1841720207Bayu](img/per3.4.PNG)

   link kode program: 
   [link ke kode program ](../../src/LayoutGUI1841720207Bayu.java)

* Hasil Border Layout:
  ![Border Layout](img/hasilBorder.PNG)

* Hasil Grid Layout:
  ![Grid Layout](img/hasilGrid.PNG)

* Hasil Box Layout:
  ![Box Layout](img/hasilBox.PNG)


### Pertanyaan Percobaan 3

1. Apa perbedaan dari Grid Layout, Box Layout dan Border Layout? 

2. Apakah fungsi dari masing-masing kode berikut? 
  ![Soal](img/soal1.PNG)
  
### Jawaban Pertanyaan

1. Perbedaan:
    * Perbedaan pertama ada pada setLayout yang digunakan
    * Selanjutnya ada pada tombolnya

2. Fungsi masing-masing kode:
    * Inisiasi object dari masing-masing layout pada object JFrame
    * fungsi setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); adalah pada saat menekan tombol close maka akan keluar dari program
    * fungsi frame.setVisible(true); adalah untuk menampilkan atau tidak layout yang sudah di buat sebelumnya


### Percobaan 4 Membuat GUI Melalui IDE Netbeans 

1. Class Swing Design:
  ![Design](img/per4.1.PNG)

2. Selanjutnya, setelah design selesai pindah ke tab Source kemudian pada kelas Swing tambahkan variable yang dibutuhkan
  ![Source](img/per4.2.PNG)

3. Komponen JButton cmdtampil
  ![Source](img/per4.3.PNG)

4. Komponen JButton cmdclear 
  ![Source](img/per4.4.PNG)

   link kode program: 
   [link ke kode program ](../../src/Swing1841720207Bayu.java)

5. Hasil Run Program:
   ![Hasil](img/per4.5.PNG)

### Pertanyaan Percobaan 4

1. Apakah fungsi dari kode berikut? 
  ![Soal](img/soal2.PNG)

2.  Mengapa pada bagian logika checkbox dan radio button digunakan multiple if ? 

3. Lakukan modifikasi pada program untuk melakukan menambahkan inputan berupa alamat dan berikan fungsi pemeriksaan pada nilai Alamat tersebut jika belum diisi dengan menampilkan pesan peringatan 

### Jawaban Pertanyaan

1. Fungsi dari kode program tersebut adalah untuk menjalankan fungsi scroll

2. Multiple if digunakan untuk menampilkan pilihan saat dipilih karena kalau multiple if nya dihilangkan maka hasilnya akan null

3. ![Hasil](img/per4.6.PNG)

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

### Tugas
Buatlah Sebuah Program yang mempunyai fungsi seperti kalkulator (mampu menjumlahkan, mengurangkan, mengalikan dan membagikan. Dengan tampilan seperti berikut.  
 ![Tugas](img/Tugas.PNG)

### Hasil Tugas

1.
![Tugas](img/Tugas.PNG)
2.
![Tugas](img/Tugas.PNG)
3.
![Tugas](img/Tugas.PNG)

## Kesimpulan

Dari percobaan dan tugas diatas kita sudah mempelajari tentang konsep dan contoh dari JFrame HelloGUI, Menangani Input Pada GUI, Manajemen Layout,
Membuat GUI Melalui IDE Netbeans, dan JTabPane, JTtree, JTabl.


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***