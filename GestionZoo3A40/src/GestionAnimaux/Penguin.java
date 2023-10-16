package GestionAnimaux;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(int ag,String na,String habitat,float swim){
        super(ag,na,habitat);
        swimmingDepth=swim;
    }
    public Penguin(int age,String na,String fam,boolean isMa,String ha,float swim){

      super(age,na,fam,isMa,ha);
      swimmingDepth=swim;
    }

    public String toString()
    {
        return "Penguig "+super.toString()+ "Swimming Depth :"+swimmingDepth;
    }
}
