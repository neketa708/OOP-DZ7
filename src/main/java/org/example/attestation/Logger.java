package org.example.attestation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_FILE_NAME = "log.txt";

    public void log(String message){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_NAME, true))){
            LocalDateTime now = LocalDateTime.now();
            String formattedDataTime = now.format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss"));

            writer.write(formattedDataTime+" - "+message);
            writer.newLine();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
