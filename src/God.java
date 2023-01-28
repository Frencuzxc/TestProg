public class God {

    private static God god = new God();

    private String name;

    private God() {}

    public static God getGod() {
        return god;
    }
}
