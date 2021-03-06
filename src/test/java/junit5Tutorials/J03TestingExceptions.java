package junit5Tutorials;

/*
    assertThrow() metodu belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
    test eder. Dolayısıyla 2 parametre alır.
        1. parametre Exception türü,
        2. parametre ise çalıştırılacak olan işlemdir.
    Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.
    Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.
    Exception türünde parent-child ilişkisi var ise yine test başarılı sayılır.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03TestingExceptions {

    @Test
    void testException1(){
        String str = null;
        assertThrows(NullPointerException.class, () -> str.length());
        // str.length() komutu null döndürdüğü için NUllPointerException oluşur. Bu exception'ı assertThrow() yakalar
        // ve türüne bakar. Eğer türü, 1. parameteredeki exception türü ile aynı ise Test'i başarılı sayar.
    }

    @Test
    void testException2(){
//        String sayi = "12a4";
//        Integer intSayi = Integer.parseInt(sayi);
//        System.out.println(intSayi*2);
        assertThrows( NumberFormatException.class, () -> Integer.parseInt("1aa2"));
    }
    @Test
    void tesException3(){
        assertThrows(IllegalArgumentException.class, () -> yasYazdir(-2));
    }

    void yasYazdir(int yas){
        if(yas<0){
            throw new IllegalArgumentException();
        }else{
            System.out.println(yas);
        }
    }






}