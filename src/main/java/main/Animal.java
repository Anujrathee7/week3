package main;

public class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String species,String name, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getSpecies(){
        return species;
    }

    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
