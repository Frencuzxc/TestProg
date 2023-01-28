public class Car extends Transport{

    private Wheel wheel;

    private int age;
    private String color;
    private String issueDate;

    private String name;

    private String type;

    public Car() {
    }

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    public Car(int age, String color, String issueDate, String name, String type) {
        this.age = age;
        this.color = color;
        this.issueDate = issueDate;
        this.name = name;
        this.type = type;
    }

    public void drive() {
        System.out.println("Мы водим машину");
    }

    public int power(int a) {
        return a * a;
    }

    public int power(int a, int b) {
        if (b < 0)
            return 1;
        if (b == 0)
            return 1;
        if (b == 1)
            return a;

        int sum = a;

        for (int i = 1; i < b; i++) {
            sum = sum * a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Car().power(2, 3));
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
