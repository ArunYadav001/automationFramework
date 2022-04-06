package com.company.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {

    private BufferedWriter bufferedWriter = null;
    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMss");
    String fileNameFormat = date.format(formatter);

    public  void createLogFile(){
        try{
           File dir = new File("C:\\Users\\arun.y\\IdeaProjects\\Logs");
           if(!dir.exists())
               dir.mkdir();
           File logFile = new File(dir+"\\"+fileNameFormat+".log");

            FileWriter fileWriter = new FileWriter(logFile.getAbsolutePath());
            bufferedWriter = new BufferedWriter(fileWriter);

        }catch (Exception e){

        }
    }

    public void write(String message){
        try{
            bufferedWriter.write(message);
            bufferedWriter.close();
        }catch(Exception e){

        }
    }

}
/**
 * in computing a logFile is a file that records either events that occur in an operating system
 * or other software runs.
 * Through logging we can track what's happening behind the scene within our framework
 * 2 ways for logging > external file > outputting to console
 * Logging is very important from framework's point of view
 *
 */