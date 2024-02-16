package com.java.cis;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIRestController {

    @PostMapping("/bmirest")
    public String calculateBMI(@RequestParam("height") double height, @RequestParam("weight") double weight) {
        // Assuming height is in meters and weight is in kilograms
        double bmi = weight / (height * height);
        return "Calculated BMI: " + String.format("%.2f", bmi);
    }
}
