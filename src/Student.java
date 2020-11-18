/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Katharina
 */
public class Student {
    
    private String name;
    private int alter;
    private boolean aktiv;
    private boolean lockdown;

    public boolean isLockdown() {
        return lockdown;
    }

    public void setLockdown(boolean lockdown) {
        this.lockdown = lockdown;
    }

    public Student() {
        this.name = name;
        this.alter = alter;
        this.aktiv = aktiv;
    }
    
    public void doSomething (){
        
        String vorstellen = ("Hello, my Name is " + name + ", age: " + alter);
        
        if (aktiv == true) {
            System.out.println(vorstellen);
            System.out.println("Ich bin ein aktiver Student");
        }else {
            System.out.println(vorstellen);
            System.out.println("Ich studiere nicht");
        }
    }
    
    public boolean schauZIB () {
        if (aktiv == true){
            System.out.println("ZIB: Armin Wolf sagt schwerer Lockdown ab "
                    + "Dienstag! Kein Eggenberg für dich!");
            lockdown = true;
        } else {
            System.out.println("ZIB: Armin Wolf sagt, schwerer Lockdown ab Dienstag"
                    + " Arbeit muss weiterhin besucht werden, trotzdem kein "
                    + "Eggenberg für dich!");
            lockdown = true;
        }
        return lockdown;
    }
    
    public void lerne(){
        if (lockdown && aktiv) {
            System.out.println("Ich kann nicht ins Eggenberg also kann ich lernen");
        }
        if (lockdown && (aktiv = false)){
            System.out.println("Es herrscht Lockdown und ich muss arbeiten");
        }
        if ((lockdown = false) && (aktiv = false) ) {
            System.out.println("Es herrscht zwar kein Lockdown aber ich muss arbeiten und habe keine Zeit für Eggenberg");
        }
        if ((lockdown = false) && (aktiv = true)){
            System.out.println("Es herrscht kein Lockdown, ich gehe ins Eggenberg");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
    
    
}
