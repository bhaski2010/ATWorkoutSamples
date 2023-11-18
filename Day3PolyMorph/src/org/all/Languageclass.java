package org.all;

import org.english.English;

public class Languageclass extends English{
    public void alllanguage() {
    System.out.println("This will print all languages info");
    }
    public static void main(String[]a) {
        Languageclass lc = new Languageclass();
        lc.alllanguage();
        lc.englishlanguage();
        lc.telulanguage();
        lc.tamillanguage();
    }
}
