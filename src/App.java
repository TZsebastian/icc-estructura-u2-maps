import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtr1 = new EmpleadoContoller();

        boolean result = empCtr1.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);
        result = empCtr1.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);

        empCtr1.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empCtr1.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empCtr1.addEmpleado(new Empleado(3, "Andres", "Senior"));

        System.out.println("Empleado por ID");
        System.out.println(empCtr1.getEmpleadoById(2));
        System.out.println("Lista de empleados");
        empCtr1.displayEmpleados();
        System.out.println("Empleados solo por el nombre ");
        empCtr1.displayEmpleadosSoloNombres();
        System.out.println("Empleados por llave");
        empCtr1.displayLlaves();
        System.out.println("Lista de empleados (sin usar Entry)");
        empCtr1.displayEmpleados2();



    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        System.out.println("\nEjercicio 1: Verificación de Anagramas");
        String str1 = "listen";
        String str2 = "silent";
        boolean resultadoAnagramas = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿Son anagramas \"" + str1 + "\" y \"" + str2 + "\"? " + resultadoAnagramas);

        System.out.println("\nEjercicio 2: Suma de dos números");
        int[] nums = {9, 2, 3, 6};
        int objetivo = 5;
        Ejercicios ejercicios = new Ejercicios();
        int[] resultadoSumatoria = ejercicios.sumatoriaDeDos(nums, objetivo);
        System.out.println("Lista de números: " + Arrays.toString(nums));
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Índices de los números que suman " + objetivo + ": " + Arrays.toString(resultadoSumatoria));

    }
}
