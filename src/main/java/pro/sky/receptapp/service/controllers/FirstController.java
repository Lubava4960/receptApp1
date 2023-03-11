package pro.sky.receptapp.service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.receptapp.dto.InfoDTO;


import java.time.LocalDate;

@RestController

public class FirstController {

    private static final InfoDTO INFO_DTO = new InfoDTO("Lubov Martyanova", "Recipes Add", LocalDate.of(2023, 03, 05), " Red for managing recipe");

    @GetMapping
    public String nameProject() {

        return "Название проекта -  Рецепты. В нем мы добавляем новые рецепты. " +
                "Проект выполнен с помощью web технологий. Проект написан на языке java. Проект запущен. ";
    }


    @GetMapping("/info")
    public InfoDTO info() {
        return INFO_DTO;

    }
}
