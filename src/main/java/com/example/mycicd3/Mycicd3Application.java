package com.example.mycicd3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Mycicd3Application {
    @GetMapping("/welcome")
    public String welcome(){
        return"welcome to Abdulganiyu Deployed Docker app !";
    }

    public static void main(String[] args) {
        SpringApplication.run(Mycicd3Application.class, args);
    }
//    echo "# mycicd" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Gsure-tech/mycicd.git
//    git push -u origin main

}
