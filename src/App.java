
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Katharina
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner (System.in);
    static String name;
    static int alter;
    static boolean aktiv;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name eingeben:");
        name = input.next();
        
        System.out.println("Alter eingeben:");
        alter = input.nextInt();
        
        System.out.println("Sind Sie ein Student?");
        String aktivString = input.next();
        if (aktivString.equalsIgnoreCase("ja") || aktivString.equalsIgnoreCase("true")){
            System.out.println("ja");
            aktiv = true;
        } else if (aktivString.equalsIgnoreCase("nein") || aktivString.equalsIgnoreCase("false")) {
            aktiv = false;
        }
        
        Student studi_1 = new Student();
        
        studi_1.setName(name);
        studi_1.setAlter(alter);
        studi_1.setAktiv(aktiv);
        
        
        
        studi_1.doSomething();
        
        boolean lockdown = studi_1.schauZIB();
        
        studi_1.setLockdown(lockdown);
        
        studi_1.lerne();
    }
    
}
