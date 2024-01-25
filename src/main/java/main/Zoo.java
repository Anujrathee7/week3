package main;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals;
    
    public Zoo(String name){
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(String species, String name, int age){
        Animal newAnimal = new Animal(species,name,age);
        animals.add(newAnimal);
    }

    public void listAnimal(){
        System.out.println(name+" contains the following animals:");
        for(Animal animal: animals){
            System.out.println(animal.getSpecies()+": "+animal.getName()+", "+animal.getAge()+" years");
        }
    }

    public void runAnimal(int laps){
        for(Animal animal: animals){
            int lap = laps;
            while (lap>0) {
                System.out.println(animal.getName()+" runs really fast!");
                lap--;
            }
        }
    }
    
}
