package pro.sky.receptapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    @GetMapping
    public String nameProject() {

        return "Название проекта -  Рецепты. В нем мы добавляем новые рецепты. " +
                "Проект выполнен с помощью web технологий. Проект написан на языке java. Проект запущен. ";
    }



    @GetMapping("/info")
    public String page() {

        return "Любовь Мартьянова. Название проекта: Рецепты. Дата создания 26.02.2023. " +
                "В нем учатся создавать сайт с рецептами " ;
    }
}