/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.pkg2.pert2;

/**
 *
 * @author USER99
 */
public class Latihan22Pert2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nilaiAkhir = 80;
        char indeks;
        
        if((nilaiAkhir>80) && (nilaiAkhir <=100))
            indeks ='A';
        else if((nilaiAkhir>65) && (nilaiAkhir <=80))
            indeks ='B';
        else if((nilaiAkhir>50) && (nilaiAkhir <=65))
            indeks ='C';
        else if((nilaiAkhir>40) && (nilaiAkhir <=50))
            indeks ='D';
        else if((nilaiAkhir>0) && (nilaiAkhir <=40))
            indeks ='E';
        else 
            indeks ='T';
        
        System.out.println("Nilai =" +nilaiAkhir + "maka indeks" +indeks);
        
     
        
        
        
        
    }
    
}
