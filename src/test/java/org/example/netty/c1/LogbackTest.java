package org.example.netty.c1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld2");
        logger.error("Hello world.");
    }
}
