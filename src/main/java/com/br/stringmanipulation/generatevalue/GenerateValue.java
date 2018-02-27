package com.br.stringmanipulation.generatevalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 26/02/2018
 * @version 1.0
 */
public class GenerateValue {

    public static List<Character> convertIntToChar(Integer valor) {
        List<Character> charList = new ArrayList<>();
        for (Character c : valor.toString().toCharArray()) {
            charList.add(c);
        }
        return charList;
    }

    public static Integer generateC(List<Character> charListA, List<Character> charListB) {
        String c = "";
        if (charListA.size() > charListB.size()) {
            for (int i = 0; i < charListA.size(); i++) {
                c += charListA.get(i);
                for (int j = i; j < charListB.size(); j++) {
                    c += charListB.get(j);
                    break;
                }
            }
        } else {

            for (int i = 0; i < charListA.size(); i++) {
                c += charListA.get(i);
                for (int j = i; j < charListB.size(); j++) {
                    c += charListB.get(j);
                    break;
                }
            }

            List<Character> listAux = new ArrayList<>();
            for (int j = charListB.size() - 1; j > (charListB.size() - charListA.size()); j--) {
                listAux.add(charListB.get(j));
            }

            Collections.reverse(listAux);
            for (Character cAux : listAux) {
                c += cAux;
            }
        }

        Integer cVal = Integer.valueOf(c);
        
        if (cVal > 1000000) {
            cVal = -1;
        }
        return cVal;
    }

    public static void main(String... args) {
//        Integer valorA = 10256;
//        Integer valorB = 512;
        //C= 15012256
        Integer valorA = 512;
        Integer valorB = 10256;
        //C = 51102256

        System.out.println(generateC(convertIntToChar(valorA), convertIntToChar(valorB)));

    }
}
