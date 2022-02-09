import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterRegEx2Test {

    @Test
    void is01234567ValidID(){
        WaterRegEx2 test = new WaterRegEx2();
        test.setWaterID("01234567");
        test.setName("test");
        test.validateInfo();
    }

    @Test
    void is012345ValidID(){
        WaterRegEx2 test = new WaterRegEx2();
        test.setWaterID("012345");
        test.setName("test");
        test.validateInfo();
    }

    @Test
    void is0asdf0123456ssbValidID(){
        WaterRegEx2 test = new WaterRegEx2();
        test.setWaterID("0asdf0123456ssb");
        test.setName("test");
        test.validateInfo();
    }

    @Test
    void is0asdf012345ssbValidNameAndID(){
        WaterRegEx2 test = new WaterRegEx2();
        test.setWaterID("0asdf012345ssb");
        test.setName("19hello");
        test.validateInfo();
    }

    @Test
    void is1234567890ValidWaterAge(){
        WaterRegEx2 test = new WaterRegEx2();
        test.setWaterID("000000");
        test.setName("test");
        test.setWaterAge("1234567890");
        test.validateInfo();
    }

    @Test
    void is12345678901234ValidWaterAge(){
        WaterRegEx2 test = new WaterRegEx2();
        test.setWaterID("000000");
        test.setName("test");
        test.setWaterAge("12345678901234");
        test.validateInfo();
    }






//    @Test
//    void setWaterID() {
//    }
//
//    @Test
//    void getWaterID() {
//    }
//
//    @Test
//    void setWaterAge() {
//    }
//
//    @Test
//    void getWaterAge() {
//    }
//
//    @Test
//    void setName() {
//    }
//
//    @Test
//    void getName() {
//    }
//
//    @Test
//    void validateInfo() {
//    }
//
//    @Test
//    void testToString() {
//    }
}