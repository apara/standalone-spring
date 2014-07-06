package com.standardset.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class Launcher {

    private final static Logger log = LoggerFactory.getLogger(Launcher.class);

    @Autowired
    private SomeComponent
        someComponent;

    public static void main(String[] args) {
        new GenericXmlApplicationContext(
            "classpath*:/spring/**/*.xml"
        )
        .getBean(
            Launcher.class
        )
        .run(args);
    }

    public void run(String[] args) {
        log.debug(
            someComponent.getText()
        );
    }
}
