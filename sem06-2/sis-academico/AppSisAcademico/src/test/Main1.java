package test;
import pe.uni.dominio.Alumno;

/**
 *
 * @author JHERENCIA
 */
public class Main1 {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno("202500100","Abel","Abad Quispe", 15, "Ing. Sistemas");
        
        System.out.println("Nombres completos: " + alu1.nombreCompleto());
        System.out.println("Edad: " + alu1.edad());
    }
}
