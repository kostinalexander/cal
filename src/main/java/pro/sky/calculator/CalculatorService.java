package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String helloCalculator(){
        return "Добро пожаловать в калькулятор  ";
}

    public int addition(int x,int y){
        return x+y;
    }
    public int subtracting(int x,int y){
        return x-y;
    }
    public int multiplication(int x,int y){
        return x*y;
    }
    public int division(int x,int z){
        int sum = x/z;
        if(z==0){
            System.out.println("Ошибка");
        }return sum;
    }


}

