public class AnimalFactory {
    private static AnimalFactory instance;

    private AnimalFactory() {
    }

    public static AnimalFactory getInstance() {
        if (instance == null) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    public Animal createAnimal(String name, String type) {
        if (name == null || name.isEmpty()) return null;
        if ("cat".equalsIgnoreCase(type)) return new Cat(name);
        if ("dog".equalsIgnoreCase(type)) return new Dog(name);
        return null;
    }
}
