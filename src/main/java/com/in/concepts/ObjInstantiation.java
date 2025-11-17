package com.in.concepts;



class Geeks {

    // Default Constructor
    Geeks() {

        System.out.println("Default constructor");

    }
}
class GeeksParam {

    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
    GeeksParam(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display object data
    void display() {

        System.out.println("GeekName: " + name
                + " and GeekId: " + id);
    }

    // main() method — placed inside the same class for
    // universal compatibility
}
    public class ObjInstantiation {
    String name;
    String breed;
    int age;
    public ObjInstantiation(String name,String breed,int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return"Name =" + name +" Breed = " + breed +" age = " + age ;
     }


    public static void main(String[] args) {
  ObjInstantiation on = new ObjInstantiation("dogg","nayi",2);
  System.out.println(on);
Geeks hello = new Geeks();//invoking default constructor
GeeksParam gp = new GeeksParam("Param Construct",22); // to invole param constructor and pass the parameters
  gp.display();
    }
}
 //evry class has at least one constructor . if none is defined java provides a default no-arg constructore,tht calls parent constructor.