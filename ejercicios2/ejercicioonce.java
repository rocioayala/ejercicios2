public class ejercicioonce {
    public static void main(String[] args) {
        // crear un areglo con Alumnos
        Persona[] personas = new Persona[3];

        // Llenamos alumnos con calificacion
        personas[0] = new Persona("Carmen", 30, true);
        personas[1] = new Persona("Ana", 60, false);
        personas[2] = new Persona("Perla", 17, true);

        for (Persona persona : personas) {
            if (revisarPermiso(persona.getEdad(), persona.getPermiso())) {

                System.out.println("La persona " + persona.getNombre() + " puede conducir");
            } else {
                System.out.println("la edad " + persona.getEdad());
                System.out.println("el permiso " + persona.getPermiso());
                System.out.println("La persona " + persona.getNombre() + " no puede conducir");
            }
        }
    }

    public static boolean revisarPermiso(int edad, boolean permiso) {
        return edad >= 18 && permiso;
    }

    static class Persona {
        private String nombre;
        private int edad;
        private boolean permiso;

        public Persona(String nombre, int edad, boolean permiso) {
            this.nombre = nombre;
            this.edad = edad;
            this.permiso = permiso;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public boolean getPermiso() {
            return permiso;
        }

    }
}
