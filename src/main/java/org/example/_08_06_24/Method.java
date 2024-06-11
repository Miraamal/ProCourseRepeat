package org.example._08_06_24;

import java.time.LocalDateTime;

public class Method {
    public static void main(String[] args) {
        System.out.println("Main");
        System.out.println("do getFirstRepeated");
        String s = getFirstCharRepeated("Bla bla", 10); // prisvaivanie resultata v peremennuyu s ot metoda getFirst
        System.out.println("posle getFirstRepeated" + s);
        System.out.println(getLogMessage("User entered login"));
        log(getLogMessage(100210002)); // zamenaet sout

    }

    private static String getFirstCharRepeated(String str, int times) {
        char first = str.charAt(0);
        System.out.println(first);
        String result = "";
        for (int i = 0; i < times; i++) {
            result = result + first;
        }
        System.out.println(result);
        return result;
    }

    private static String getLogMessage(String message) {  // metod logiruet lubuyu stroku
        return LocalDateTime.now().toString() + " " + message;
    }

    private static String getLogMessage(int num) {   // peregrujenniy metod
        return getLogMessage(String.valueOf("Message"));

    }
    private static void log(String message){
        System.out.println(getLogMessage(message));
    }




}
