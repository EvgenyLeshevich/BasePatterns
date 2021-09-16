package example.adapter;

import example.personfactory.Person;

public class PersonAdapterImpl implements PersonAdapter{
    private Person person;

    public PersonAdapterImpl(Person person) {
        this.person = person;
    }

    public double convertBYNtoUSD(double byn){
        return byn / 2.5;
    }
    @Override
    public double getSalary() {
        return convertBYNtoUSD(person.getSalary());
    }
}
