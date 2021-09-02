package org.junit;

import java.util.Arrays;

public class C03DizilerEsitMi {

    public boolean diziKiyasla(Object[] a , Object[]b){
        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)) {
            return true;
        }else{
            return false;
        }
    }
}