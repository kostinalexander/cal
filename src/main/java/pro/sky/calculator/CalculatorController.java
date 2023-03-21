package pro.sky.calculator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @RequestMapping(path = "/calculator")
    public String helloCalculator(){
        return calculatorService.helloCalculator();
    }
    @RequestMapping(path = "/calculator/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.addition(num1, num2);
    }
    @RequestMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2){
        return num1+ " - " + num2 + " = "+ calculatorService.subtracting(num1,num2);
    }
    @RequestMapping(path = "/calculator/multiply")
    public String multipli(@RequestParam int num1, @RequestParam int num2){
        return num1+ " * "+ num2 + " = "+ calculatorService.multiplication(num1,num2);
    }
    @RequestMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1,@RequestParam int num2){
        return num1+ " / "+ num2 + " = "+ calculatorService.division(num1,num2);
    }




    }





// @RequestMapping(path = "/calculator/plus")
//    public int plus(int x, int z){
//    return  calculatorService.addition(x, z);
//    }