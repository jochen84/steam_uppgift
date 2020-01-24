package se.lexicon.vxo.service;

import se.lexicon.vxo.model.Person;

import java.util.List;

public interface People {

    People INSTANCE = PeopleImpl.getInstance();

    List<Person> getPeople();
}
