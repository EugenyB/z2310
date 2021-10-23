public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        AnimalFactory f = AnimalFactory.getInstance();
        AnimalFactory f1 = AnimalFactory.getInstance();
        Animal animal = f.createAnimal("Murka","dog");
        System.out.println(animal);
        animal.doJob();
        System.out.println(animal.getName());
        //animal.bark();

//        AnimalFactory f = new AnimalFactory();
        System.out.println(f==f1);

        Student s = new StudentWorker();
    }
}
