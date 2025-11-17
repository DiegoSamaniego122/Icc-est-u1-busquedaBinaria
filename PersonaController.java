public class PersonaController {

    Persona[] people = new Persona[]{
        new Persona("Juan", 25),
        new Persona("Ana", 30),
        new Persona("Pedro", 20),
        new Persona("Maria", 28),
        new Persona("Luis", 22),
        new Persona("Carmen", 27),
        new Persona("Sofia", 24),
    };

    public PersonaController(Persona[] people) {
        this.people = people;
    }

    // ORDENAR POR NOMBRE
    public static void bubbleSort(Persona[] personas) {
        int n = personas.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Comparación alfabética por nombre
                if (personas[j].getNombre().compareToIgnoreCase(personas[j + 1].getNombre()) > 0) {

                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    // BUSCAR A PEDRO
    public static Persona buscarPedro(Persona[] personas) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase("Pedro")) {
                return p;  // Si lo encuentra, lo retorna
            }
        }
        return null; // Si no lo encuentra
    }

    public static void main(String[] args) {

        Persona[] personas = {
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Maria", 28),
            new Persona("Luis", 22),
            new Persona("Carmen", 27),
            new Persona("Sofia", 24),
        };

        // Ordenar
        bubbleSort(personas);

        System.out.println("Personas ordenadas:");
        for (Persona p : personas) {
            System.out.println(p.getNombre() + " - " + p.getEdad());
        }

        // Buscar a Pedro
        Persona encontrado = buscarPedro(personas);

        if (encontrado != null) {
            System.out.println("\nSe encontró a Pedro: " + encontrado.getNombre() + ", " + encontrado.getEdad());
        } else {
            System.out.println("\nPedro no está en la lista.");
        }
    }
}
