package pro.sky.receptapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.receptapp.dto.infoDTO;


import javax.sound.sampled.DataLine;
import java.time.LocalDate;

@RestController

public class FirstController {

    private static final infoDTO INFO_DTO = new infoDTO("Lubov Martyanova", "Recipes Add", LocalDate.of(2023, 03, 05), " Red for managing recipe");

    @GetMapping
    public String nameProject() {

        return "Название проекта -  Рецепты. В нем мы добавляем новые рецепты. " +
                "Проект выполнен с помощью web технологий. Проект написан на языке java. Проект запущен. ";
    }


    @GetMapping("/info")
    public infoDTO info() {
        return INFO_DTO;

    }
}
