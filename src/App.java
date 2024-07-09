import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();
        empleadoContoller.addEmpleado(new Empleado(1, "Jefferson", "Develop"));
        empleadoContoller.addEmpleado(new Empleado(2, "Pedro", "Designer"));
        empleadoContoller.addEmpleado(new Empleado(3, "Francisco", "Analyst"));
        empleadoContoller.addEmpleado(new Empleado(4, "Ramiro", "Developer"));

        System.out.println();
        empleadoContoller.imprimirEmpleados();

    }

    private static void runMapExample() {
        new Mapa();
    }

    private static void runEjerccios() {
        System.out.println();
        Ejercicios ejercicios = new Ejercicios();
        // Test para sumatoriaDeDos
        int[] nums = { 11, 2, 7, -2 };
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println(
                    "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron dos números que sumen " + objetivo);
        }

        objetivo = 10;
        resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println(
                    "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron dos números que sumen " + objetivo);
        }

        //// EJERCICIO 2
        // Test para areAnagrams
        String str1 = "listen";
        String str2 = "silent";
        boolean sonAnagramas = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);

        str1 = "hello";
        str2 = "bello";
        sonAnagramas = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);
        System.out.println();
    }

}
