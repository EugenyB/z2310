public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void doJob() {
        System.out.println("bark");
    }

    public void bark() {
        System.out.println("gav-gav");
    }

    @Override
    public String toString() {
        return "Dog{" + getName() + "}";
    }
}
