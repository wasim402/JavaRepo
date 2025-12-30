package OOPS_Concepts;

public class Encapsulation {

    private String name ;
    private int Age;


    public String GetName() {
        return this.name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int GetAge() {
        return this.Age;
    }

    public void SetAge(int Age) {
        this.Age = Age;
    }

    public static void main(String[] args) {
        Encapsulation es = new Encapsulation();

        System.out.println(es.GetName());
        System.out.println(es.GetAge());

        es.SetName("Wasim Akhtar");
        es.SetAge(26);
        System.out.println(es.GetName());
        System.out.println(es.GetAge());

    }
}
