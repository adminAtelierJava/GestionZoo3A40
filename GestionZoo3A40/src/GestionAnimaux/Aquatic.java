package GestionAnimaux;

public class Aquatic extends Animal{
    protected String habitat;

    public Aquatic(){}
    public Aquatic(int ag,String na,String habitat)
    {
        super(ag,na);
        this.habitat=habitat;
    }
    public Aquatic(int age,String na,String fam,boolean isMa,String ha)
    {
     super(age,na,fam,isMa);
     habitat=ha;
    }
    public String toString()
    {
        return " Aquatic :"+super.toString()+" Habitat :"+habitat;
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
