package no.kristiania;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class HttpClinet {
    public HttpClinet(String host, int port, String reqwestTarget) {

    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("httpbin.org", 80);
        socket.getOutputStream().write(
                ("GET /html HTTP/1.1\r\n" +
                 "connection: close\r\n"+
                "Host: httpbin.org\r\n"+
                "\r\n") .getBytes());
        InputStream in = socket.getInputStream();
        int c ;
        while ((c = in.read()) != -1){
            System.out.print((char) c);

        }
    }

    public int getstatusCode() {
        return 200;
    }
}
