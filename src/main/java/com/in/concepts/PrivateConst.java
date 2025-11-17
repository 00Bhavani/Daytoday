package com.in.concepts;

class PriConst {
    private PriConst(){
        System.out.println("Private COnstructor called");
    }
    public static void display(){
        System.out.println("COnstructor of PriCOnst cls");
    }

}
public class PrivateConst{
    public static void main(String[] args) {
        PriConst.display();

    }
}