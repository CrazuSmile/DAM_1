package ejercicios_avanzados.ejercicio3;

import java.util.Calendar;

public class Paciente {
    private String name;
    private String surname;
    private Calendar birthDate;

    public Paciente(String name, String surname, Calendar birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public int calculateAge() {
        int age;
        Calendar now = Calendar.getInstance();
        age = now.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: " + name + "\nApellidos: " + surname + "\nFecha de nacimiento: " + birthDate + "\nEdad: "
                + calculateAge();
    }

}
