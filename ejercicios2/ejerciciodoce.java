public class ejerciciodoce {
    public static void main(String[] args) {
        // crear un areglo con Alumnos
        Alumno[] alumnos = new Alumno[3];

        // Llenamos alumnos con calificacion
        alumnos[0] = new Alumno("Juana", 100);
        alumnos[1] = new Alumno("Lucia", 60);
        alumnos[2] = new Alumno("Alberto", 71);

        for (Alumno alumno : alumnos) {
            if (alumnoAprobado(alumno.getCalificacion())) {
                System.out.println("La alumna " + alumno.getNombre() + " ha aprobado con calificación "
                        + alumno.getCalificacion());
            } else {
                System.out.println("La alumna " + alumno.getNombre() + " ha reprobado con calificación "
                        + alumno.getCalificacion());
            }
        }

    }

    public static boolean alumnoAprobado(int calificacion) {
        return calificacion >= 70;
    }

    static class Alumno {
        private String nombre;
        private int calificacion;

        public Alumno(String nombre, int calificacion) {
            this.nombre = nombre;
            this.calificacion = calificacion;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCalificacion() {
            return calificacion;
        }
    } 
}
