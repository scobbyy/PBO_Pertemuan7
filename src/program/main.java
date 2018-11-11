/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;


 import java.util.*;
public class main {
    static List<set_get> sg1 = new ArrayList<set_get>();

    public static void sortingMenu() {
        int input = 0;
        if (sg1.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            do {

                System.out.println("");
                System.out.println("--------------------------");
                System.out.println("1. Sorting NIM");
                System.out.println("2. Sorting NAMA");
                System.out.println("3. Sorting IPK");
                System.out.println("4. Kembali ke menu awal");
                System.out.print("Pilih: ");
                Scanner s = new Scanner(System.in);
                input = s.nextInt();
                s.nextLine();
                switch (input) {
                    case 1:
                        Collections.sort(sg1, new nim());
                        int counter = 1;
                        for (set_get opt : sg1) {
                            System.out.println("-------------------------");
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM : " + opt.getNim());
                            System.out.println("Nama: " + opt.getNama());
                            System.out.println("IPK : " + opt.getIpk());
                            counter++;
                        }
                        break;
                    case 2:
                        Collections.sort(sg1, new nama());
                        counter = 1;
                        for (set_get opt : sg1) {
                            System.out.println("-------------------------");
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM : " + opt.getNim());
                            System.out.println("Nama: " + opt.getNama());
                            System.out.println("IPK : " + opt.getIpk());
                            counter++;
                        }
                        break;
                    case 3:
                        Collections.sort(sg1, new ipk());
                        counter = 1;
                        for (set_get opt : sg1) {
                            System.out.println("-------------------------");
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM : " + opt.getNim());
                            System.out.println("Nama: " + opt.getNama());
                            System.out.println("IPK : " + opt.getIpk());
                            counter++;
                        }
                        break;
                }
            } while (input != 4);
        }
    }

    public static void main(String args[]){
        int input = 0;
        do {
            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            input = s.nextInt();
            s.nextLine();
            switch (input) {
                case 1:
                    System.out.print("Masukan NIM   : ");
                    String nim = s.nextLine();
                    System.out.print("Masukan Nama  : ");
                    String nama = s.nextLine();
                    System.out.print("Masukan Ipk   : ");
                    float ipk = s.nextFloat();
                    set_get m = new set_get(nim,nama,ipk);
                    sg1.add(m);
                    break;
                case 2:
                    if (sg1.isEmpty()) {
                        System.out.println(" Data masih kosong ");
                    } else {
                        System.out.println("---------------------------");
                        int counter = 1;
                        for (set_get mahasiswa : sg1) {
                            System.out.println("Data ke-" + counter);
                            System.out.println("NIM  : " + mahasiswa.getNim());
                            System.out.println("Nama : " + mahasiswa.getNama());
                            System.out.println("IPK  : " + mahasiswa.getIpk());
                            counter++;
                        }
                    }
                    break;
                case 3:
                    sortingMenu();
                    break;
            }
        } while (input != 4);
    }
}

 

