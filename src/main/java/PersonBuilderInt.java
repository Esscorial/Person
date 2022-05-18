public interface PersonBuilderInt {

    PersonBuilderInt setName(String name);

    PersonBuilderInt setSurname(String surname);

    PersonBuilderInt setAge(int age);

    PersonBuilderInt setAddress(String address);

    Person build();
}