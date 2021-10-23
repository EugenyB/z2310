public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void doJob() {
        System.out.println("Catch mouse");
    }

    @Override
    public String toString() {
        return "Cat{" + getName() + "}";
    }
}
