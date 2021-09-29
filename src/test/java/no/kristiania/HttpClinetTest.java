package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpClinetTest {
    @Test
    void shouldShowNumbrs(){
        assertEquals(200,100+100);
    }
    @Test
    void shouldReternStatusCode(){
        HttpClinet clinet = new HttpClinet("httpbin.org", 80, "/html");
        assertEquals(200,clinet.getstatusCode());
    }
    @Test
    void shouldRetern404StatusCode(){
        HttpClinet clinet = new HttpClinet("httpbin.org", 80, "/this bag its doesnot exsist");
        assertEquals(404,clinet.getstatusCode());
    }

}