package streams;

import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * 1. Número para string binária... 6 => "110"
         * 2. Inverter a string... "110" => "011"
         * 3. Converter de volta para inteiro => "011" => 3
         */

        nums.stream()
                .map(Integer::toBinaryString)
                .map(DesafioMap::inverter)
                .map(DesafioMap::converterParaInteiro)
                .forEach(System.out::println);
    }

    public static String inverter(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static Integer converterParaInteiro(String s) {
        return Integer.parseInt(s, 2);
    }
}
