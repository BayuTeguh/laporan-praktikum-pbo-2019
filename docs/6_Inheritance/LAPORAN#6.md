# Laporan Praktikum #6 - Inheritance

## Kompetensi

Mampu memahami konsep:
1. Memahami konsep dasar inheritance atau             pewarisan.

2. Mampu membuat suatu subclass dari suatu            superclass tertentu.	

3. Mampu mengimplementasikan konsep single dan         multilevel inheritance.	
4. Mampu membuat objek dari suatu subclass dan        melakukan pengaksesan terhadap atribut dan         method baik yang dimiliki sendiri atau             turunan dari superclass nya.	

## Ringkasan Materi

Inheritance atau pewarisan sifat merupakan suatu cara untuk menurunkan suatu class yang lebih umum menjadi suatu class yang lebih spesifik. Inheritance adalah salah satu ciri utama suatu bahasa program yang berorientasi pada objek. Inti dari pewarisan adalah sifat reusable dar konsep	object oriented. Setiap subclass akan “mewarisi”sifat dari superclass selama bersifat protected	ataupun public.	 

## Percobaan

### Percobaan 1 Extends

1. Class A:
  ![ClassA1841720207Bayu](img/per1.1.PNG)

  link kode program : 
  [link ke kode program ](../../src/ClassA1841720207Bayu.java)

2. Class B:
  ![ClassB1841720207Bayu](img/per1.2.PNG)
  
  link kode program : 
  [link ke kode program](../../src/ClassB1841720207Bayu.java)

  3. Class Main:
  ![Percobaan11841720207Bayu](img/per1.main.PNG)
  
  link kode program : 
  [link ke kode program](../../src/Percobaan11841720207Bayu.java)

### Pertanyaan Percobaan 1

1.	Pada percobaan 1 diatas program yang	              dijalankan terjadi error, kemudian perbaiki           sehingga program tersebut bisa	dijalankan dan        tidak error!

2. Jelaskan apa penyebab program pada percobaan 1        ketika dijalankan terdapat error!	
   
### Jawaban Pertanyaan
1. Perbaikan Error 
![Perbaikan Error](img/correct_1.PNG)

2. Penyebab error bisa terjadi disebabkan pada classB    belum di masukkan kata kunci extends yang             menandakan class B belum mewarisi class A karena      itu atribut x dan y tidak dapat terdeteksi karena     atribut tersebut berasal dari class A

### Percobaan 2 Hak Akses

1. Class Per2:
  ![Per21841720207Bayuu](img/per2.1.PNG)

  link kode program : 
  [link ke kode program](../../src/Per21841720207Bayuu.java)

2. Class B:
   ![ClassB1841720207Bayuu](img/per2.2.PNG)

   link kode program : 
   [link ke kode program](../../src/ClassB1841720207Bayuu.java)

3.  Class Main:
   ![Percobaan21841720207Bayu](img/per2.main.PNG)

   link kode program : 
   [link ke kode program](../../src/Percobaan21841720207Bayu.java)


### Pertanyaan Percobaan 2

1. Pada	percobaan 2 diatas program yang dijalankan       terjadi error, kemudian perbaiki sehingga             program tersebut bisa dijalankan dan tidak            error!	
 
 2. Jelaskan apa penyebab program pada percobaan 1       ketika dijalankan terdapat error!	

 ### Jawaban Percobaan 2

 1. Perbaikan Error 
![Perbaikan Error](img/correct_1.PNG)

2. Penyebab error bisa terjadi disebabkan pada classB    belum di masukkan kata kunci extends yang             menandakan class B belum mewarisi parent karena       itu atribut x dan y tidak dapat terdeteksi karena     atribut tersebut berasal dari parent dan juga pada    class parent atribut ber tipe private sedangkan       syarat sebuah subclass untuk bisa mewarisi sifat      dari superclass, superclass harus bersifat            protected atau public.
  
### Percobaan 3 Super

1.  Class Bangun:
    ![Bangun1841720207Bayu](img/per3.1.PNG)

    link kode program : 
    [link ke kode program](../../src/Bangun1841720207Bayu.java)

2. Class Tabung:
    ![Tabung1841720207Bayu](img/per3.2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Tabung1841720207Bayu.java)

3. Class Main:
    ![Percobaan31841720207Bayu](img/per3.main.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Percobaan31841720207Bayu.java)

### Pertanyaan Percobaan 3

1. Jelaskan fungsi “super”  pada  potongan program       berikut di class Tabung!

  ![Soal](img/soalPer3.1.PNG)

2. Jelaskan	fungsi “super” dan “this” pada potongan	
   program berikut di class Tabung!	

 ![Soal](img/soalPer3.2.PNG)
  
3. Jelaskan mengapa	pada class Tabung tidak              dideklarasikan atribut “phi” dan “r” tetapi	
   class tersebut dapat	mengakses atribut tersebut!	

### Jawaban Pertanyaan

1. Super pada potongan class di atas digunakan untuk     mengakses/merujuk atribut/data member yaitu phi       dan r dari class parent yaitu class Bangun

2. Fungsi super pada potongan program diatas             digunakan untuk mengakses atribut dari class          parent dan this digunakan untuk mengakses atribut     atau data member dari class itu sendiri yang akan     digunakan untuk operasi matematika
  
3. Karena pada class tersebut meggunakan kata kunci      super yang berarti pada class tersebut telah          mengakses atribut/data member dari class parent

### Percobaan 4 Super Konstruktor

1. Class A:
    ![ClassAA1841720207Bayu](img/per4.1.PNG)

    link kode program : 
    [link ke kode program](../../src/ClassAA1841720207Bayu.java)

2. Class B:
    ![ClassBB1841720207Bayu](img/Per4.2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/ClassBB1841720207Bayu.java)

3.  Class C:
    ![ClassC1841720207Bayu](img/Per4.3.PNG)
    
    link kode program : 
    [link ke kode program](../../src/ClassC1841720207Bayu.java)

4. Class Main:
    ![ClassC1841720207Bayu](img/Per4.main.PNG)
    
    link kode program : 
    [link ke kode program](../../src/ClassC1841720207Bayu.java)

### Pertanyaan 4

1. Pada	percobaan 4 sebutkan mana class yang             termasuk superclass dan subclass, kemudian            jelaskan	alasannya!

2. Ubahlah isi konstruktor default ClassC seperti        berikut:	
   ![soal](img/soalPer4.1.PNG)
   Tambahkan kata super() di baris Pertaman	dalam	konstruktor defaultnya. Coba jalankan kembali	class Percobaan4 dan terlihat tidak ada	perbedaan dari hasil outputnya!	
   
3. Ublah isi konstruktor default ClassC seperti          berikut:	
   ![soal](img/soalPer4.2.PNG)
   Ketika mengubah posisi super() dibaris kedua  dalam kontruktor defaultnya dan terlihat	ada	error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.	Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada	saat instansiasi objek test	dari	class ClassC	
   ![soal](img/soalPer4.3.PNG)
   Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!	
   
4. Apakah fungsi super() pada potongan program           dibawah ini di ClassC!	
   ![soal](img/soalPer4.4.PNG)
  
### Jawaban Pertanyaan

1. Class pertama yang menjadi superclass adalah class    A dan subclassnya adalah class B ditandai dengan      kata kunci extends ClassA, superclass selanjutnya     adalah class B dan subclassnya adalah class C         ditandai dengan kata kunci extends dari classB

2. Mengubah isi Konstrukror default C:
   ![soal](img/jawPer4.1.PNG)

3. Karena pada class C sudah mewarisi sifat dari         class B dan class B juga sudah mewarisi sifat dari    class A. Dan urutan proses jalanya konstruktor        adalah subclass akan menjalankan konstruktor          superclassnya dulu karena pada konstruktor            subclass ditambahkan kata kunci super(); 

4. Fungsi super() pada kontruktor default C adalah       untuk memanggil konstruktor parent di konstruktor     subclass


### Percobaan 5

1. Class Karyawan:
    ![Karyawan1841720207Bayu](img/per5.1.PNG)

    link kode program : 
    [link ke kode program](../../src/Karyawan1841720207Bayu.java)

2. Class Manager:
    ![Manager1841720207Bayu](img/Per5.2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Manager1841720207Bayu.java)

3.  Class Staff:
    ![Staff1841720207Bayu](img/Per5.3.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Staff1841720207Bayu.java)

4. Class Main:
    ![Inheritance11841720207Bayu](img/per5.main.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Inheritance11841720207Bayu.java)

### Pertanyaan Percobaan 5

1. Sebutkan class mana yang termasuk super class dan     sub class dari percobaan 1 diatas!	

2. Kata kunci apakah yang digunakan untuk menurunkan     suatu class ke class yang lain?	
  
3. Perhatikan kode program pada class Manager,           atribut apa saja yang dimiliki oleh class tersebut?   Sebutkan atribut mana saja yang diwarisi dari         class Karyawan!

4. Jelaskan kata kunci super pada potongan program	     dibawah ini yang terdapat pada class Manager!
   ![soal](img/soalPer5.PNG)

5. Program pada percobaan 1 diatas termasuk dalam        jenis inheritance apa? Jelaskan alasannya!	

### Jawaban Pertanyaan

1. Subclass dari percobaan 1 diatas ada 2 class yaitu    class Manager dan class Staff yang mewarisi class     Karyawan

2. Kata kunci yang digunakan untuk menurunkan            suatu class ke class yang lain adalah Extends

3. Atribut yang dimiliki oleh class manager adalah       atribut tunjangan sementara atribut yang diwarisi     dari class karyawan adalah atribut nama, alamat,      jk, umur, dan gaji

4. Kata kunci super pada potongan program di atas        digunakan untuk mengakses atribut gaji dari           superclassnya yang akan digunakan untuk operasi       matematika

5. Pada percobaan diatas termasuk dalam jenis            Single inharitance karena class manager dan class     Staff merupakan subclass Memiliki superclass yang     sama yaitu class Karyawan
 

### Percobaan 6

1. Class StaffTetap:
    ![StaffTetap1841720207Bayu](img/Per6.1.PNG)
    
    link kode program : 
    [link ke kode program](../../src/StaffTetap1841720207Bayu.java)

2. Class StaffHarian:
    ![StaffHarian1841720207Bayu](img/Per6.2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/StaffHarian1841720207Bayu.java)

3. Class Main:
    ![Inheritance11841720207Bayu](img/per6.main.PNG)
    
    link kode program : 
    [ini contoh link ke kode program](../../src/Inheritance11841720207Bayu.java)

### Pertanyaan Percobaan 6

1. Berdasarkan class diatas manakah yang termasuk	       single inheritance dan	mana yang	termasuk             multilevel inheritance?

2. Perhatikan kode program class StaffTetap dan	         StaffHarian, atribut apa saja yang dimiliki oleh	     class tersebut? Sebutkan atribut mana saja yang       diwarisi dari class Staff!	

3. Apakah fungsi potongan	program berikut pada class	   StaffHarian
   ![soal](img/soalPer6.1.PNG)

4. Apakah fungsi potongan program berikut pada class	   StaffHarian

   ![soal](img/soalPer6.2.PNG)
  
5. Perhatikan kode program dibawah ini yang terdapat	   pada class StaffTetap	
   ![soal](img/soalPer6.3.PNG)
   Terlihat dipotongan program diatas atribut gaji,	lembur dan potongan dapat diakses langsung. Kenapa	hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan	potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan?	
  
### Jawaban Pertanyaan

1. Kalau berdasarkan class yang ada pada percobaan 6     di atas tidak ada single inheritance tetapi ada       multilevel inheritance yaitu class StaffTetap dan     StaffHarian yang merupakan subclass dari class        Staff pada percobaan 5 yang juga merupakan            subclass dari class Karyawan

2. Atribut yang dimiliki oleh class StaffTetap dan       StaffHarian adalah golongan dan asuransi pada         class StaffTetap dan atribut jmlJamKerja pada         class StaffHarian sementara itu atribut yang          diwarisi dari class Staff adalah atribut lembur,      dan potongan dan atribut atribut nama, alamat, jk,    umur, dan gaji diwarisi dari class superclass         yaitu class Karyawan yang pada class Staff yang       otomatis diwarskan pada subclassnya juga

3. Potongan kode program diatas digunakan untuk          memanggil konstruktor dari superclass

4. Potongan kode program diatas digunakan untuk          mengakses method tersebut dari superclass 

5. Karena atribut tersebut sudah diwariskan dari         superclassnya


### Tugas

1. Class Komputer:
    ![Komputer1841720207Bayu](img/tug1.1.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Komputer1841720207Bayu.java)

2. Class Laptop: 
    ![Laptop1841720207Bayu](img/tug1.2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Laptop1841720207Bayu.java)

3. Class Pc:
    ![Pc1841720207Bayu](img/tug1.3.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Pc1841720207Bayu.java)

4. Class Mac:
    ![Mac1841720207Bayu](img/tug1.4.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Mac1841720207Bayu.java)

5. Class Windows:
    ![Windows1841720207Bayu](img/tug1.5.PNG)
    
    link kode program : 
    [link ke kode program](../../src/Windows1841720207Bayu.java)

6. Class Main:
    ![MainTugas1841720207Bayu](img/tug1.Main.1.PNG)
    ![MainTugas1841720207Bayu](img/tug1.Main.2.PNG)
    
    link kode program : 
    [link ke kode program](../../src/MainTugas1841720207Bayu.java)


Isi Tugas: 
1. Pada tugas ini berisi proses pewarisan dari class     induk ke class anak menggunkan kata kunci extends     dan pada tugas ini menggunakan implementasi single    inheritance dan multilevel inheritance



## Kesimpulan

(Dari percobaan dan tugas diatas kita sudah mempelajari tentang pewarisan/inheritance menggunakan kata kunci extends yang digunakan untuk mewariskan class dan kata kunci super yang digunakan untuk mewariskan atau mengakses method/atribut dari class induk. Dan pada praktikum ini kita juga mempelajari tentang single inheritance dan juga multilevel inheritance 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***