import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Minesweeper {

    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }

    String toRoman(int number){
        if(number <=1){
            return "I";
        }
        return "Something went wrong";
    }
}
