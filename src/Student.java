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
