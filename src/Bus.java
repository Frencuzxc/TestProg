public class Bus extends Transport {

    private int capacity;
    private int flat;

    public Bus() {
    }

    public Bus(int capacity, int flat) {
        this.capacity = capacity;
        this.flat = flat;
    }

    public void drive() {
        System.out.println("Мы водим автобус");
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFlat() {
        return flat;
    }
}
