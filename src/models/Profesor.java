package models;

public class Profesor {

    /**
     * Cuando es public vamos a poder acceder a ella desde
     * cualquier parte del proyecto, al igual que el paquete.
     */
    public String variablePublica = "variable pública";

    /**
     * Si es privada solo podemos acceder desde la misma
     * clase que la contiene.
     */
    private String variablePrivada = "variable privada";

    /**
     * La hace accesible por la clase que la contiene y las
     * demás clases que se encuentran dentro del mismo paquete.
     */
    protected String variableProtegida = "variable protegida";

    /**
     * Variable estatica va ser la misma para cualquier
     * cantidad de instancias que hagamos de la clase.
     * Puede ser public, private, protected.
     */
    static String miInstitucion = "MIT";
    String curso = "";




    public static void main(String[] args) {

        Profesor prof2 = new Profesor();
        System.out.println(prof2.variablePublica);

        Profesor prof3 = new Profesor();
        System.out.println(prof3.variablePrivada);

        Profesor prof7 = new Profesor();
        Profesor prof8 = new Profesor();
        Profesor prof9 = new Profesor();
        Profesor prof10 = new Profesor();
        Profesor prof11 = new Profesor();
        System.out.println(Profesor.miInstitucion);

        prof7.curso = "Matemáticas";
        prof8.curso = "Curso 02";
        prof9.curso = "Curso 03";
        prof10.curso = "Curso 04";
        prof11.curso = "Curso 05";

        System.out.println(prof7.curso);
        System.out.println(prof8.curso);
        System.out.println(prof9.curso);
        System.out.println(prof10.curso);
        System.out.println(prof11.curso);

        prof7.miInstitucion = "Inst 1";
        prof8.miInstitucion = "Inst 2";
        prof9.miInstitucion = "Inst 3";
        prof10.miInstitucion = "Inst 4";
        prof11.miInstitucion = "Inst 5"; //Se queda con esta última asignación

        //la forma correcta de modificar es
        Profesor.miInstitucion = "Inst 6";

        System.out.println(prof7.miInstitucion);
        System.out.println(prof8.miInstitucion);
        System.out.println(prof9.miInstitucion);
        System.out.println(prof10.miInstitucion);
        System.out.println(prof11.miInstitucion);

        //la forma correcta es
        System.out.println(Profesor.miInstitucion);

    }
}
