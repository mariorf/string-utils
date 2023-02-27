import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    public void tesToCamelCase() {
        assertEquals(main.toCamelCase("Hola caracola"),"HoLa CaRaCoLa");
        assertEquals(main.toCamelCase("@ola caracola"),"@OlA cArAcOlA");
        assertEquals(main.toCamelCase("HOLA CARACOLA"),"HoLa CaRaCoLa");
        assertEquals(main.toCamelCase("        HOLA CARACOLA"),"        HoLa CaRaCoLa");
    }

    @Test
    public void testInvertirStrings(){
        assertEquals(main.invertirString("hola"), "aloh");
        assertEquals(main.invertirString("1hola"), "aloh1");
        assertEquals(main.invertirString("@hola"), "aloh@");
        assertEquals(main.invertirString(" hola"), "aloh ");
        assertEquals(main.invertirString(""), "");

    }

    @Test
    public void testEspacios(){
        assertEquals(main.ponerEspacios("hola"), "h o l a");
        assertEquals(main.ponerEspacios("ho la"), "h o  l a");
        assertEquals(main.ponerEspacios("  ho la"), "    h o  l a");

    }


}

    