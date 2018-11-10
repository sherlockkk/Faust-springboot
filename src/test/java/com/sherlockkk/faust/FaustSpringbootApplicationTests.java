package com.sherlockkk.faust;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FaustSpringbootApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void logTest() {
        String user = "啊啊啊";
        String password = "password";
        log.info("user:{}, password:{}", user, password);
        log.error("user:{}, password:{}", user, password);

    }

}
