public class Variable_Q2 {
    public static void main(String[] args) {
        Variable_Q2 obj1 = new Variable_Q2(101,"Sanket");
        obj1.display();
        Variable_Q2 obj2 = new Variable_Q2(102,"Prime");
        obj2.display();

    }
    int id;
    String name;
    public Variable_Q2(int id,String name) {
        this.id=id;
        this.name=name;

    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
    }

}