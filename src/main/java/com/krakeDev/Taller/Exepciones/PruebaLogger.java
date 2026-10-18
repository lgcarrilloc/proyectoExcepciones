package com.krakeDev.Taller.Exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaLogger {

    private static final Logger log =
            LoggerFactory.getLogger(PruebaLogger.class);

    public static void main(String[] args) {

        log.info("Logback funcionando correctamente");

    }
}