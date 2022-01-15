package org.example.netty.c1;

import org.junit.platform.engine.support.descriptor.ClasspathResourceSource;

import java.io.File;
import java.net.URL;

public class ClasspathTest {
    public static void main(String[] args) {
        String pathName = "src/test/resources/data_cp.txt";
        File file = new File(pathName);
        System.out.println(file.exists());

        //获取src/main下的资源
        String data_cp = ClasspathTest.class.getClassLoader().getResource("logback.xml").getPath();
        System.out.println(data_cp);

        ClasspathResourceSource from = ClasspathResourceSource.from("logback.xml");
    }
}
