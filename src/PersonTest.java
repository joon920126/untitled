import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setName() {
    }

    @Test
    void getName() {
    }

    @Test
    void setNo() {
    }

    @Test
    void getNo() {
    }

    @Test
    void showInfo() {
    }

    @Test
    void test(){
        Person p = new Person();
        p.setName("Hello");
        p.setNo(10);

        assertEquals(p.getName(), "Hello");
    }
}