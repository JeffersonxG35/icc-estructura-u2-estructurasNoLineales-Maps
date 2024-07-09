package controllers;

import java.util.HashMap;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> conteoCaracteresMap1 = new HashMap<>();
        HashMap<Character, Integer> conteoCaracteresMap2 = new HashMap<>();

        for (Character charStr1 : str1.toCharArray()) {
            conteoCaracteresMap1.put(charStr1, conteoCaracteresMap1.getOrDefault(charStr1, 0) + 1);
        }

        for (Character charStr2 : str2.toCharArray()) {
            conteoCaracteresMap2.put(charStr2, conteoCaracteresMap2.getOrDefault(charStr2, 0) + 1);
        }

        for (Character character : conteoCaracteresMap1.keySet()) {
            if (!conteoCaracteresMap2.containsKey(character)
                    || !conteoCaracteresMap1.get(character).equals(conteoCaracteresMap2.get(character))) {
                return false;
            }
        }
        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> mapita = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (mapita.containsKey(complemento)) {
                return new int[] { mapita.get(complemento), i };
            }
            mapita.put(nums[i], i);
        }
        return null;
    }
}
