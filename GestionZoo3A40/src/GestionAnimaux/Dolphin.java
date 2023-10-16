package GestionAnimaux;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin(){
        super();
    }

    public Dolphin(int ag,String na,String habitat,float swim)
    {
        super(ag,na,habitat);
        this.swimmingSpeed=swim;
    }
    public Dolphin(int age,String na,String fam,boolean isMa,String ha,float swim)
    {
        super(age,na,fam,isMa,ha);
        swimmingSpeed=swim;
    }
    public void swim(){
        System.out.println("This dolphin is swimming");
    }
}
