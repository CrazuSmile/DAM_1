package ejercicios_teoricos.stream.ejemplo1;

import java.io.Serializable;

public class Persona implements Serializable {
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

}
