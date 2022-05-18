public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int happyBirthday(int age) {
        return age++;
    }

    public boolean hasAge() {
        int age;
        age = getAge();
        return age != 0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddress() {
        String address;
        address = getAddress();
        return address != null;
    }

    public PersonBuilderInt newChildBuilder() {
        PersonBuilder personBuilder;
        if (hasAddress()) {
            personBuilder = (PersonBuilder) new PersonBuilder()
                    .setAddress(this.address)
                    .setSurname(this.surname)
                    .setAge(0);
        } else {
            personBuilder = (PersonBuilder) new PersonBuilder()
                    .setSurname(this.surname)
                    .setAge(0);
        }
        return personBuilder;
    }

    @Override
    public String toString() {
        return " имя: " + name + '\'' +
                ", фамилия: " + surname + '\'' +
                ", возраст: " + age + '\'' +
                ", город: " + address + '\'';
    }
}
