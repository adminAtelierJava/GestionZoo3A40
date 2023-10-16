package GestionAnimaux;

public class TestAnimal {
    public static void main(String[] args) {
        Aquatic aq1=new Aquatic(1,"poisson","poisson",false,"mer");


        Terrestre ter1=new Terrestre(2,"bobie","chien",true,4);
        Penguin pen1=new Penguin(1,"Penguin","Penguin",false,"Mer",2);

        Dolphin dol1=new Dolphin(2,"Dolphin","Dolphin",false,"Mer",4);

        System.out.println(aq1);
        System.out.println(pen1);
        System.out.println(dol1);
        System.out.println("terrestre");
        System.out.println(ter1);

        ter1.testToString();


        System.out.println("test swim");
        aq1.swim();
        dol1.swim();

        pen1.swim();
    }
}
