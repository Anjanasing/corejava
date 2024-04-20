package com.crac;

import java.util.Locale;

public class LocaleDemo1 {

    public static void main(String[] args) {
        
        Locale locale = Locale.getDefault();
        
        System.out.println(locale.getCountry()+" "+locale.getLanguage());
        
        System.out.println(locale.getDisplayCountry()+" "+locale.getDisplayLanguage());
        
        
        String[] s  = locale.getISOLanguages();
        
        for(String str : s) {
            System.out.println(str);
        }
        

    }

}