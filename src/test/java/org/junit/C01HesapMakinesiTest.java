package org.junit;

import org.junit.C01HesapMakinesi;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01HesapMakinesiTest {

    @Test
    @DisplayName("iki sayıyı toplar") // bilgi vermek amaçlı
    void topla() {
        // tek tek test ettiğimizde hata bulunca aşağıya devam etmiyor.
        assertEquals(4, C01HesapMakinesi.topla(2,2));
        assertEquals(2, C01HesapMakinesi.topla(3,-1));
        assertEquals(0, C01HesapMakinesi.topla(-2,2));
        assertEquals(-5, C01HesapMakinesi.topla(-2,-3));
    }

    @Test
    @DisplayName("iki sayıyı çarpar.")
    void carp() {
        assertAll( // burada hepsi test edildiğinde hata bulsa bile devam ediyor.
                () -> assertEquals(4, C01HesapMakinesi.carp(2,2)),
                () -> assertEquals(-3, C01HesapMakinesi.carp(3,-1)),
                () -> assertEquals(-2, C01HesapMakinesi.carp(-2,1)),
                () -> assertEquals(6, C01HesapMakinesi.carp(-2,-3))
        );
    }
}