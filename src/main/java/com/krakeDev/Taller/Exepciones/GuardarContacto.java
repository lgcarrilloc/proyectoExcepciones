package com.krakeDev.Taller.Exepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {

    private static final Logger log =
            LoggerFactory.getLogger(GuardarContacto.class);

    public static void guardarContacto() {

        FileWriter escritor = null;

        try {

            escritor = new FileWriter("contactos.txt", true);
            escritor.write("Maria\n");
            escritor.write("Gomez\n");
            escritor.write("0981234567\n");

            log.info("Contacto guardado exitosamente");

        } catch (IOException e) {

            log.error("Error al guardar contacto", e);

        } finally {

            try {

                if (escritor != null) {
                    escritor.close();
                }

            } catch (IOException e) {

                log.error("Error al cerrar archivo", e);
            }
        }
    }
}