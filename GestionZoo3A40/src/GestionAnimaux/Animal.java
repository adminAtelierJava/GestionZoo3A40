package GestionAnimaux;

public class Animal {


    String family,name;
    int age;
    boolean isMammal;

public Animal(int age,String na,String fam,boolean isMa){
    this.age=age;
    this.name=na;
    this.family=fam;
    this.isMammal=isMa;
}
public Animal(){}

public Animal(int ag,String na)
{
 age=ag;
 name=na;
}
public Animal(String family,int age)
{
    this.family=family;
    this.age=age;
}
    public Animal(String family,int age,String name)
    {
        this.family=family;
        this.age=age;
        this.name=name;
    }
    public void display()
    {
      System.out.println("name :"+name+"family :"+family+"age :"+age+"is Mamal"+isMammal);

    }

   public  String toString()
    {
    return " name :"+name+" family :"+family+" age :"+age+" is Mamal :"+isMammal;

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}