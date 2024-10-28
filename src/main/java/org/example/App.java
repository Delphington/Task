package org.example;


import lombok.Getter;

class Capy{
    @Getter
    String name;

    public Capy(String name) {
        this.name = name;
    }
}
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
