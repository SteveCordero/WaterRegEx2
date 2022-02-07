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