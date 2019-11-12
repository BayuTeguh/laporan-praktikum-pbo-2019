# Laporan Praktikum #11 - GUI (Graphical User Interface)  

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Membuat aplikasi Graphical User Interface sederhana dengan bahasa pemrograman java; 
2. Mengenal komponen GUI seperti frame, label, textfield, combobox, radiobutton, checkbox, textarea, menu, serta table; 
3. Menambahkan event handling pada aplikasi GUI. 
 

## Ringkasan Materi
        Polimorfisme merupakan kemampuan suatu objek untuk memiliki banyak bentuk. Penggunaan polimorfisme yang paling umum dalam OOP terjadi ketika ada referensi super class yang digunakan untuk merujuk ke objek dari sub class. Dengan kata lain, ketika ada suatu objek yang dideklarasikan dari super class, maka objek tersebut bisa diinstansiasi sebagai objek dari sub class. Dari uraian tersebut bisa dilihat bahwa konsep polimorfisme bisa diterapkan pada class-class yang memiliki relasi inheritance (relasi generalisasi atau IS-A). 
        Selain pada class-class yang memiliki relasi inheritance, polimorfisme juga bisa diterapkan pada interface. Ketika ada objek yang dideklarasikan dari suatu interface, maka ia bisa digunakan untuk mereferensi ke objek dari class-class yang implements ke interface tersebut. 
 
 
## Percobaan

### Percobaan 1  Bentuk dasar polimorfisme 

1. Class Employe:
  ![Employee1841720207Bayu](img/per1.1.PNG)

   link kode program: 
   [link ke kode program ](../../src/Employee1841720207Bayu.java)

2. Interface Payable:
   ![Payable1841720207Bayu](img/per1.2.PNG)
  
   link kode program: 
   [link ke kode program](../../src/Payable1841720207Bayu.java)

3. Class InternshipEmployee, subclass dari Employee:
   ![InternshipEmployee1841720207Bayu](img/per1.3.PNG)
   
   link kode program: 
   [link ke kode program](../../src/InternshipEmployee1841720207Bayu.java)

4. Class PermanentEmployee, subclass dari Employee dan implements ke Payable:

   ![PermanentEmployee1841720207Bayu](img/per1.4.PNG)
   
   link kode program: 
   [link ke kode program](../../src/PermanentEmployee1841720207Bayu.java)

5. Class ElectricityBill yang implements ke interface Payable:

   ![ElectricityBill1841720207Bayu](img/per1.5.PNG)
   ![ElectricityBill1841720207Bayu](img/per1.5.1.PNG)

   link kode program: 
   [link ke kode program](../../src/ElectricityBill1841720207Bayu.java)

6. Tester1:

   ![Tester11841720207Bayu](img/perMain1.PNG)
   
   link kode program: 
   [link ke kode program](../../src/Tester11841720207Bayu.java)



### Pertanyaan Percobaan 1

1. Class apa sajakah yang merupakan turunan dari class Employee? 
2. Class apa sajakah yang implements ke interface Payable? 
3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class InternshipEmploye) ?  
4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) ? 
5. Coba tambahkan sintaks: 
   
   p = iEmp;      
   e = eBill; 
   
   pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error? 
6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme! 
  
### Jawaban Pertanyaan

1. Class yang merupakan turunan dari class Employee adalah:
    
    * InternshipEmployee1841720207Bayu
    * PermanentEmployee1841720207Bayu

2. Class yang mengimplements dari interface Payable adalah:

    * PermanentEmployee1841720207Bayu
    * ElectricityBill1841720207Bayu

3. Karena e bertipe Employee bisa digunakan untuk mereferensi ke objek iEmp dan pEmp yaitu objek dari class IntershipEmployee dan PermanentEmployee yang merupakan turunan dari class Employee.

4. Karena p bertipe Payable bisa digunakan untuk mereferensi ke objek pEmp dan eBill yaitu objek dari class PermanentEmployee dan ElectricityBill yang mengimplements interface Payable 

5. Error tersebut disebabkan karena class ElectricityBill bukan turunan dari class Employee dan iEmp tidak mengimplements interface Payable.

6. Polimorfisme merupakan kemampuan suatu objek untuk memiliki banyak bentuk. 

### Percobaan 2 Virtual method invocation 

1. Pada percobaan ini masih akan digunakan class-class dan interface yang digunakan pada percobaan sebelumnya. 

2. Class Tester2:
   ![Tester21841720207Bayu](img/perMain2.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Tester21841720207Bayu.java)

### Pertanyaan Percobaan 2

1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?  
2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak? 
3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual? 
  
### Jawaban Pertanyaan

1. Karena e bertipe Employee telah mereferensi objek pEmp yaitu objek dari class PermanentEmployee dan e telah digunakan untuk memanggil method getEmployeeInfo() yang sebenarnya saat compile time tetap dikenali sebagai method dari class Employee tetapi pada saat run time method tersebut dijalankan dari class PermanentEmployee yang mengOverride dari class Employee dan disebut sebagai Virtual method Invocation, karena itu hasilnya sama dengan pemanggilan method biasa dari objek class PermanentEmployee.

2. Karena e telah digunakan untuk memanggil method getEmployeeInfo() yang sebenarnya saat compile time tetap dikenali sebagai method dari class Employee tetapi pada saat run time method tersebut dijalankan dari class PermanentEmployee yang mengOverride dari class Employee dan disebut sebagai Virtual method Invocation sedangkan pEmp.getEmployeeInfo() tidak disebut sebagai Virtual method Invocation karena pemanggilan method getEmployeeInfo() dilakukan dari class yang sama dimana method tersebut berada.

3. Virtual method invocation adalah ketika ada pemanggilan overriding method dari suatu objek polimorfisme dan disebut virtual karena antara method yang dikenali oleh compiler dan method yang dijalankan oleh JVM berbeda.   


### Percobaan 3 Heterogenous Collection 

1. Pada percobaan ke-3 ini, masih akan digunakan class-class dan interface pada percobaan sebelumnya. 

2. Class Tester3:
  ![Tester1841720207Bayu](img/perMain3.PNG)

   link kode program: 
   [link ke kode program ](../../src/Tester1841720207Bayu.java)

### Pertanyaan Percobaan 3

1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ? 
2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ? 
3. Perhatikan baris ke-10, mengapa terjadi error? 
  
### Jawaban Pertanyaan

1. Hal tersebut bisa terjadi karena array e[] dideklarasikan dari class Employee yang merupakan superclass dari class PermanentEmployee dan class InternshipEmployee.

2. Hal tersebut bisa terjadi karena array p[] dideklarasikan dari interface Payable, dan karena class PermanentEmployee dan ElectricityBill mengimplements interface Payable maka araay p[] bisa diisi dengan objek-objek tersebut.

3. Karena class ElectricityBill tidak memiliki hubungan apapun dengan class Employee.


### Percobaan 4 Argumen polimorfisme, instanceof dan casting objek

1. Pada percobaan ke-3 ini, masih akan digunakan class-class dan interface pada percobaan sebelumnya. 

2.  Buat class baru dengan nama Owner. Owner bisa melakukan pembayaran baik kepada pegawai permanen maupun rekening listrik melalui method pay(). Selain itu juga bisa menampilkan info pegawai permanen maupun pegawai magang melalui method showMyEmployee().

    Class Owner:
  ![Owner1841720207Bayu](img/per4.1.PNG)

   link kode program : 
   [link ke kode program ](../../src/Owner1841720207Bayu.java)

3. Class Tester4:
   ![Tester41841720207Bayu](img/perMain4.PNG)

   link kode program : 
   [link ke kode program ](../../src/Tester41841720207Bayu.java)

### Pertanyaan Percobaan 4

1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable? Jika diperhatikan lebih detil eBill merupakan objek dari 
ElectricityBill dan pEmp merupakan objek dari PermanentEmployee? 
2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner? 
3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp); ![Soal](img/soal1.PNG)
   Mengapa terjadi error?  
4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6?
5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill?

### Jawaban Pertanyaan

1. Karena argument dari method pay merupakan interface Payable, maka dari itu dikarenakan ke-2 class tersebut mengimplements interface Payable dan dikarenakan oleh hal tersebut method pay bisa diisi dengan objek dari ke-2 class tersebut.

2. Agar method pay dapat menerima argument dari berbagai objek yang berasal dari class yang mengimplementsnya.

3. Error disebabkan karena arguments pada method pay tidak memiliki hubungan apapun dengan class InternshipEmployee.

4. p diperlukan untuk hasil instanceof yang berupa boolean yaitu p, yang akan digunakan untuk  mengecek apakah suatu objek merupakan hasil instansiasi dari suatu class tertentu.

5. Diperlukan, karena objek p yang bertipe Payable merupakan superclass akan diubah ke objek eb yang merupakan subclass.


### Tugas
Dalam suatu permainan, Zombie dan Barrier bisa dihancurkan oleh Plant dan bisa menyembuhkan diri. Terdapat dua jenis Zombie, yaitu Walking Zombie dan Jumping Zombie. Kedua Zombie tersebut memiliki cara penyembuhan yang berbeda, demikian juga cara penghancurannya, yaitu ditentukan oleh aturan berikut ini: 

• Pada WalkingZombie 

• Penyembuhan : 
Penyembuhan ditentukan berdasar level zombie yang bersangkutan 

 * Jika zombie level 1, maka setiap kali penyembuhan, health akan bertambah 20% 
 * Jika zombie level 2, maka setiap kali penyembuhan, health akan bertambah 30%  
 * Jika zombie level 3, maka setiap kali penyembuhan, health akan bertambah 40% 
 
 • Penghancuran : setiap kali penghancuran, health akan berkurang 2% 
 
 • Pada Jumping Zombie 

 • Penyembuhan : Penyembuhan ditentukan berdasar level zombie yang bersangkutan 
 * Jika zombie level 1, maka setiap kali penyembuhan, health akan bertambah 30% 
 * Jika zombie level 2, maka setiap kali penyembuhan, health akan bertambah 40%  
 * Jika zombie level 3, maka setiap kali penyembuhan, health akan bertambah 50% 
 
 • Penghancuran : setiap kali penghancuran, health akan berkurang 1% 
 Buat program dari class diagram di bawah ini! 
![SoalTugas1](img/soalTugas1.PNG)

Contoh: jika class Tester seperti di bawah ini: 
![SoalTugas1](img/soalTugas3.PNG)

Akan menghasilkan output:
![SoalTugas1](img/soalTugas2.PNG)

### Jawaban Tugas

1. Interface IDestroyable:
  ![IDestroyable1841720207Bayu](img/tugas1.1.PNG)

   link kode program: 
   [link ke kode program ](../../src/IDestroyable1841720207Bayu.java)

2. Class Zombie:
   ![Zombie1841720207Bayu](img/tugas1.2.PNG)
  
   link kode program: 
   [link ke kode program](../../src/Zombie1841720207Bayu.java)

3. Class WalkingZombie, subclass dari Zombie dan implements ke IDestroyable:
   ![WalkingZombie1841720207Bayu](img/tugas1.3.PNG)
   
   link kode program: 
   [link ke kode program](../../src/WalkingZombie1841720207Bayu.java)

4. Class JumpingZombie, subclass dari Zombie dan implements ke IDestroyable:

   ![JumpingZombie1841720207Bayu](img/tugas1.4.PNG)
   
   link kode program: 
   [link ke kode program](../../src/JumpingZombie1841720207Bayu.java)

5. Class Barier yang implements ke interface IDestroyable:

   ![Barrier1841720207Bayu](img/tugas1.5.PNG)

   link kode program: 
   [link ke kode program](../../src/Barrier1841720207Bayu.java)

6. Class Plant:

   ![Plant1841720207Bayu](img/tugas1.6.PNG)
   
   ink kode program: 
   [link ke kode program](../../src/Plant1841720207Bayu.java)

7. Class Main:

   ![TesterZ1841720207Bayu](img/tugasMain1.PNG)
   ![TesterZ1841720207Bayu](img/hasilTugas.PNG)
   
   ink kode program: 
   [link ke kode program](../../src/TesterZ1841720207Bayu.java)


## Kesimpulan

Dari percobaan dan tugas diatas kita sudah mempelajari tentang konsep dan contoh dari Polimorfisme, Virtual method Invocation, Heterogeneous Collection, Polymorphic Argument, Operator instanceof, dan Object Casting

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bayu Teguh Bimantoro)***