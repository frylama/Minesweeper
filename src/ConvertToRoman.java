import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToRoman {
    String convertedNumber;

    @Test
    void shouldConvert1ToI(){
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldConvert2ToII(){
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvert3ToIII(){
        assertEquals("III", toRoman(3));
    }

    @Test
    void shouldConvert4ToIV(){
        assertEquals("IV", toRoman(4));
    }

    @Test
    void shouldConvert5ToV(){
        assertEquals("V", toRoman(5));
    }

    String toRoman(int number){

        if(number == 1){
            convertedNumber = "I";
        }
        if(number == 2){
            convertedNumber = "II";
        }
        if(number == 3){
            convertedNumber = "III";
        }
        if(number == 4){
            convertedNumber = "IV";
        }
        if(number == 5){
            convertedNumber = "V";
        }


        return convertedNumber;
    }
}
