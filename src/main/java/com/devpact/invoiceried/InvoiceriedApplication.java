package com.devpact.invoiceried;

import com.devpact.invoiceried.configuration.JfxWithSpringApplication;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class InvoiceriedApplication {

    public static void main(String[] args) {
        Application.launch(JfxWithSpringApplication.class, args);
    }
}