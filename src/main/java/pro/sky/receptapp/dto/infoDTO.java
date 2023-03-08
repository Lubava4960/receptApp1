package pro.sky.receptapp.dto;

import java.time.LocalDate;

public class infoDTO {
    private final String author;
    private final String name;
    private final LocalDate creationDate;
    private final String description;




    public infoDTO(String author, String name, LocalDate creationDate, String description) {
        this.author = author;
        this.name = name;
        this.creationDate = creationDate;
        this.description = description;
    }


}
