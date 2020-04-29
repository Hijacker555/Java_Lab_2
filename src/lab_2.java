/*2. Есть класс Creature c подклассами Snake, Dog  и есть интерфейс Creep c методом creep(например метод выводит:I can creep) и методом whoAmI. Создать унаследованный от Creep  подинтерфейс Wriggle c методом wriggle.
        Класс Snake реализует интерфейс Wriggle, а класс Dog - Creep.
        Создать массив объектов Сreep, как представителей классов Snake , Dog, состоящий из количества  элементов, заданных параметром. Вывести его на дисплей.
        Для каждого объекта Сreep выполнить все  методы, которые реализованы в соответствующих классах.Вывод на дисплей результатов выполнения.*/


import java.lang.Math;
import java.util.ArrayList;

interface Creep{
    void creep();
}

interface Wriggle extends Creep{
    void wriggle();
}

class Creature{
    void whoIam(){
        System.out.println("I'm class Creature");
    }

    public void creep(){
        System.out.println("Creep");
    }
}

class Snake extends Creature implements Wriggle{
    void whoIam(){
        System.out.println("I'm class Snake");
    }

    public void wriggle(){
        System.out.println("Wriggle");
    }
}

class Dog extends Creature implements Creep{
    void whoIam(){
        System.out.println("I'm class Dog");
    }
}


class lab2{
    public static void main (String args[]){
        ArrayList<Creature> Creep = new ArrayList<Creature>();
        for (int i=0;i<4;i++){
                Creep.add(new Dog());
                Creep.add(new Snake());
        }
        for (int j=0;j<Creep.size();j++){
            if (Creep.get(j) instanceof Wriggle){
                Creep.get(j).whoIam();
                Creep.get(j).creep();
                ((Wriggle)Creep.get(j)).wriggle();
                System.out.println(" ");
            }else{
                Creep.get(j).whoIam();
                Creep.get(j).creep();
                System.out.println(" ");
            }
        }
    }
}