package com.example.datefinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController

public class MyController {
    @GetMapping("/")
    public String get(){
        LocalDate d = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dd = d.plusDays(100);
        String s = dd.format(df);
        return s;
    }
}
