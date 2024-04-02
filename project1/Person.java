public class Person {
    private String name;
    private int age;

    // Constructor with no arguments
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name argument
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with name and age arguments
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Create a person with no arguments
        Person person1 = new Person();
        System.out.println(person1.getName());  // "Unknown"
        System.out.println(person1.getAge());   // 0

        // Create a person with name argument
        Person person2 = new Person("Alice");
        System.out.println(person2.getName());  // "Alice"
        System.out.println(person2.getAge());   // 0

        // Create a person with name and age arguments
        Person person3 = new Person("Bob", 30);
        System.out.println(person3.getName());  // "Bob"
        System.out.println(person3.getAge());   // 30

        // Update the name and age of person3 using setters
        person3.setName("Charlie");
        person3.setAge(40);
        System.out.println(person3.getName());  // "Charlie"
        System.out.println(person3.getAge());   // 40
    }
}
