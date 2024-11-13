package com.example.demo;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.Optional;
@Component
public class Calculator {
    private final Map<String, Operation> operation;
public Calculator(Map<String, Operation> operation) {
this.operation = operation; 
}
public void calc(String operationType, double a, double b) throws Exception {
        double result = Optional.ofNullable(operation.get(operationType))
                .orElseThrow(() -> new Exception("Unsupported operation"))
                .getResult(a, b);
        System.out.println(result);
    }

    public String getSupportedOperations() {
        return operation.keySet().toString();
    }
}
