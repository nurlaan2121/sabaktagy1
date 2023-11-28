//1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.
//
//        2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.
//
//        3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.
//
//        4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
//
//        5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.
//
//        6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
//
//        7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
//
//        8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.
package lmsStrBuild;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "Men nurlan";
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        System.out.println(new String(chars));
        StringBuilder stringBuilder = new StringBuilder("Almabak");
        String newword = stringBuilder.toString();
        System.out.println(reverse(newword));

        String[] words = {"Timur", "Erzat", "Nurlan", "Ermak", "Erkeaiym"};
        System.out.println(numbertwo(words));


        String numbertree = "Nurlan menrtere Asan";
        System.out.println(numberthree(numbertree));

        String numberFour = "kitep";
        if (numberFour(numberFour)) {
            System.out.println(numberFour + "  palindrom!");

        } else System.out.println(numberFour + "  palindrom emes!");


        String suilom = "java 12 the best!";
        System.out.println(numberFive(suilom));

        String name = "  Nurlan learning  in java in   pearsoft!     ";
        System.out.println(counterword(name));

        String ss = "menina atym nur";
        System.out.println(asccicode(ss));

        String dds ="fkdofk fsdsdkl fsdlfs";
        System.out.println(onlyWords(dds));

    }

    public static String reverse(String soz) {
        StringBuilder stringBuilder = new StringBuilder(soz);
        String d = String.valueOf(stringBuilder.charAt(0));
        stringBuilder.replace(0, 1, d.toLowerCase());
        String a = String.valueOf(stringBuilder.charAt(stringBuilder.length() - 1));
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), a.toUpperCase());
        stringBuilder.reverse();
        return String.valueOf(stringBuilder);
    }

    public static String numbertwo(String[] words) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            res.append(words[i]).append(" ");
        }
        return res.toString();
    }

    public static long numberthree(String soz) {
        int counter = 0;
        for (int i = 0; i < soz.length(); i++) {
            String t = String.valueOf(soz.charAt(i));
            if (t.equalsIgnoreCase("a") || t.equalsIgnoreCase("e") || t.equalsIgnoreCase("i") || t.equalsIgnoreCase("u") || t.equalsIgnoreCase("o")) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean numberFour(String soz) {
        StringBuilder stringBuilder = new StringBuilder(soz);
        String one = stringBuilder.toString();
        String two = stringBuilder.reverse().toString();
        if (one.equalsIgnoreCase(two)) {
            return true;
        } else return false;
    }

    public static StringBuilder numberFive(String suilom) {
        char[] chars = {'0'};
        String String = null;
        StringBuilder srr = new StringBuilder();
        String[] a1 = suilom.trim().split(" ");
        for (int i = 0; i < a1.length; i++) {
            String a = a1[i];
            chars = a.toCharArray();
            char char1 = chars[0];
            chars[0] = Character.toUpperCase(char1);
            srr.append(new StringBuilder((String = new String(chars) + " ")));
        }
        String res = String;
        return srr;
    }

    public static long counterword(String word) {
        String[] a1 = word.trim().split(" ");
        String[] a2 = word.trim().split("  ");
        String[] a3 = word.trim().split("   ");
        return a1.length - a2.length + 1 - a3.length + 1;
    }

    public static String asccicode(String name) {
        StringBuilder stringBuilder = new StringBuilder(name);
        for (int i = 0; i < stringBuilder.length(); i++) {
            String name2 = String.valueOf(stringBuilder.charAt(i));
            if (name2.contains("A")) {
                stringBuilder.replace(i, i + 1, "65");
            } else if (name2.contains("B")) {
                stringBuilder.replace(i, i + 1, "66");
            } else if (name2.contains("C")) {
                stringBuilder.replace(i, i + 1, "67");
            } else if (name2.contains("D")) {
                stringBuilder.replace(i, i + 1, "68");
            } else if (name2.contains("E")) {
                stringBuilder.replace(i, i + 1, "69");
            } else if (name2.contains("F")) {
                stringBuilder.replace(i, i + 1, "70");
            } else if (name2.contains("G")) {
                stringBuilder.replace(i, i + 1, "71");
            } else if (name2.contains("H")) {
                stringBuilder.replace(i, i + 1, "72");
            } else if (name2.contains("I")) {
                stringBuilder.replace(i, i + 1, "73");
            } else if (name2.contains("J")) {
                stringBuilder.replace(i, i + 1, "74");
            } else if (name2.contains("K")) {
                stringBuilder.replace(i, i + 1, "75");
            } else if (name2.contains("L")) {
                stringBuilder.replace(i, i + 1, "76");
            } else if (name2.contains("M")) {
                stringBuilder.replace(i, i + 1, "77");
            } else if (name2.contains("N")) {
                stringBuilder.replace(i, i + 1, "78");
            } else if (name2.contains("O")) {
                stringBuilder.replace(i, i + 1, "79");
            } else if (name2.contains("P")) {
                stringBuilder.replace(i, i + 1, "80");
            } else if (name2.contains("Q")) {
                stringBuilder.replace(i, i + 1, "81");
            } else if (name2.contains("R")) {
                stringBuilder.replace(i, i + 1, "82");
            } else if (name2.contains("S")) {
                stringBuilder.replace(i, i + 1, "83");
            } else if (name2.contains("T")) {
                stringBuilder.replace(i, i + 1, "84");
            } else if (name2.contains("U")) {
                stringBuilder.replace(i, i + 1, "85");
            } else if (name2.contains("V")) {
                stringBuilder.replace(i, i + 1, "86");
            } else if (name2.contains("W")) {
                stringBuilder.replace(i, i + 1, "87");
            } else if (name2.contains("X")) {
                stringBuilder.replace(i, i + 1, "88");
            } else if (name2.contains("Y")) {
                stringBuilder.replace(i, i + 1, "89");
            } else if (name2.contains("Z")) {
                stringBuilder.replace(i, i + 1, "90");
            } else if (name2.contains("a")) {
                stringBuilder.replace(i, i + 1, "97");
            } else if (name2.contains("b")) {
                stringBuilder.replace(i, i + 1, "98");
            } else if (name2.contains("c")) {
                stringBuilder.replace(i, i + 1, "99");
            } else if (name2.contains("d")) {
                stringBuilder.replace(i, i + 1, "100");
            } else if (name2.contains("e")) {
                stringBuilder.replace(i, i + 1, "101");
            } else if (name2.contains("f")) {
                stringBuilder.replace(i, i + 1, "102");
            } else if (name2.contains("g")) {
                stringBuilder.replace(i, i + 1, "103");
            } else if (name2.contains("h")) {
                stringBuilder.replace(i, i + 1, "104");
            } else if (name2.contains("i")) {
                stringBuilder.replace(i, i + 1, "105");
            } else if (name2.contains("j")) {
                stringBuilder.replace(i, i + 1, "106");
            } else if (name2.contains("k")) {
                stringBuilder.replace(i, i + 1, "107");
            } else if (name2.contains("l")) {
                stringBuilder.replace(i, i + 1, "108");
            } else if (name2.contains("m")) {
                stringBuilder.replace(i, i + 1, "109");
            } else if (name2.contains("n")) {
                stringBuilder.replace(i, i + 1, "110");
            } else if (name2.contains("o")) {
                stringBuilder.replace(i, i + 1, "111");
            } else if (name2.contains("p")) {
                stringBuilder.replace(i, i + 1, "112");
            } else if (name2.contains("q")) {
                stringBuilder.replace(i, i + 1, "113");
            } else if (name2.contains("r")) {
                stringBuilder.replace(i, i + 1, "114");
            } else if (name2.contains("s")) {
                stringBuilder.replace(i, i + 1, "115");
            } else if (name2.contains("s")) {
                stringBuilder.replace(i, i + 1, "116");
            } else if (name2.contains("t")) {
                stringBuilder.replace(i, i + 1, "117");
            } else if (name2.contains("u")) {
                stringBuilder.replace(i, i + 1, "118");
            } else if (name2.contains("v")) {
                stringBuilder.replace(i, i + 1, "119");
            } else if (name2.contains("w")) {
                stringBuilder.replace(i, i + 1, "120");
            } else if (name2.contains("y")) {
                stringBuilder.replace(i, i + 1, "121");
            } else if (name2.contains("z")) {
                stringBuilder.replace(i, i + 1, "122");
            }
        }
        return String.valueOf(stringBuilder);
    }
    public static String onlyWords(String word) {
        String[] parts = word.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            if (part.matches("[a-zA-Z0-9]+")) {
                result.append(part);
            }
        }
        return result.toString();
    }

}
