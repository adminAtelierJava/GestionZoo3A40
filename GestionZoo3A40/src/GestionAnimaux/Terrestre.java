package GestionAnimaux;

public class Terrestre extends Animal{
    private int nbrLegs;

    public Terrestre(int age,String na,String fam,boolean isMa,int nbLeg)
    {
        super(age,na,fam,isMa);
        nbrLegs=nbLeg;
    }

    public Terrestre(int nbrLegs,int ag,String na)
    {
        super(ag,na);
        this.nbrLegs=nbrLegs;
    }
    public String toString()
    {
        return "Terrestre "+super.toString()+" nombre de pattes :"+nbrLegs;
    }
    public void testToString()
    {
        System.out.println("super :"+super.toString());
        System.out.println("this :"+this.toString());
    }
}
