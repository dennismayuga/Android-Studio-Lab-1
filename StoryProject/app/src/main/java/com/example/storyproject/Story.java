package com.example.storyproject;

public class Story {

    private String name;
    private String age;
    private String city;
    private String collegeName;
    private String profession;
    private String animalType;
    private String petName;

    public Story() {        // default constructor

    }

    public Story(String name, String age, String city, String collegeName, String profession, String animalType, String petName) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.collegeName = collegeName;
        this.profession = profession;
        this.animalType = animalType;
        this.petName = petName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {              // matching story toString
        return "Story: There once was a person named "+name+" who lived in "+city+". At the age of " +
                age+", "+name+" went to college at "+collegeName+". "+name+" graduated and went to work " +
                "as a "+profession+". Then, "+name+" adopted a (n) "+animalType+" named "+petName+". " +
                "They both lived happily ever after!";
    }
}
