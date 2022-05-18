public class PersonBuilder implements PersonBuilderInt {

    private String name;
    private String surname;
    private Integer age;
    private String address;
    private Person newPerson;

    @Override
    public PersonBuilderInt setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilderInt setSurname(String surName) {
        this.surname = surName;
        return this;
    }

    @Override
    public PersonBuilderInt setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст человека не может быть < 0 !!!");
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilderInt setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if(name ==null || surname ==null){
            throw new IllegalArgumentException("Невозможно создать экземпляр - отсутствует имя и/или фамилия.");
        }
        if (age == null) {
            newPerson = new Person(name, surname);
        } else {
            newPerson = new Person(name, surname, age);
        }
        if (address != null) newPerson.setAddress(address);
        return newPerson;
    }
}
