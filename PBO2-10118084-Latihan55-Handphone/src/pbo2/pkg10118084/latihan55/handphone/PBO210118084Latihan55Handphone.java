/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan55.handphone;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Handphone

 */
public class PBO210118084Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android1;
        android1 = new Android("243ibfd3840fo","samsung","Android","Grand",3000000);
        android1.displayProduct();
        System.out.println("");
        BlackBerry blackberry1;
        blackberry1 = new BlackBerry("BHS249","BlackB","RIM","Curve",2000000);
        blackberry1.displayProduct();
        System.out.println("");
        WindowsPhone windowsphone1;
        windowsphone1 = new WindowsPhone("UUQIJWORJ","Nokia","Win8","Lumia",1000000);
        windowsphone1.displayProduct();
       
        
    }
    
}
