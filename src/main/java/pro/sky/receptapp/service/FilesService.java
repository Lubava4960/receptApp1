package pro.sky.receptapp.service;

import java.io.IOException;

public interface FilesService {

    boolean cleanDataFile();

    String readFromFile()throws IOException;

    boolean saveToFile(String json);
}