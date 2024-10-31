public class Chocolate {
    private int barCode;
    private String name;
    private int weight;
    private int cost;

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Chocolate() {
        barCode = 101;
        name = "Cadbury";
        weight = 12;
        cost = 10;
    }

    @Override
    public String toString() {
        return "Chocolate [barCode=" + barCode + ", name=" + name + ", weight=" + weight + ", cost=" + cost + "]";
    }

    public Chocolate(int barCode, String name, int weight, int cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public static void main(String[] args) {
        Chocolate c1 = new Chocolate();
        System.out.println(c1.toString());

        c1.setBarCode(102);
        c1.setName("Hersheys");
        c1.setWeight(100);
        c1.setCost(122);

        System.out.println("After modifications...");
        System.out.println(c1.toString());

        System.out.println("Chocolate c2");
        Chocolate c2 = new Chocolate(103, "5Star", 20, 5);
        System.out.println(c2.toString());
    }
}
