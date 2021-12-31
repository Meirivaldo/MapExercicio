package one.dio.ExercicioProposto;

import java.util.HashMap;
import java.util.Map;

public class ExerProposto {
        public static void main(String[] args) {

            Map<String, Integer> capaitaisNordeste = new HashMap<>();


            capaitaisNordeste.put("Recife", 6);
            capaitaisNordeste.put("Alagoas", 7);
            capaitaisNordeste.put("Sergipe", 8);
            capaitaisNordeste.put("Paraíba", 9);
            capaitaisNordeste.put("Rio Grande do Norte", 16);
            capaitaisNordeste.put("Ceará", 10);
            capaitaisNordeste.put("Piauí", 11);

            //Remova o estado do Piauí
            capaitaisNordeste.remove("11");
            System.out.println(capaitaisNordeste);

            capaitaisNordeste.put("Pernambuco", 12);
            System.out.println(capaitaisNordeste);

            capaitaisNordeste.remove("Ceará");
            System.out.println(capaitaisNordeste);

            System.out.println(capaitaisNordeste.containsValue(6));
            System.out.println(capaitaisNordeste);















        }
}
