package com.devpact.invoiceried.configuration;

import com.devpact.invoiceried.configuration.JfxWithSpringApplication.StageReadyEvent;
import com.devpact.invoiceried.invoice.infrastructure.controller.HelloController;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StageInitializer implements ApplicationListener<StageReadyEvent> {
    private final FxWeaver fxWeaver;

    @Value("${spring.application.ui.title}")
    private String applicationTitle;

    @SneakyThrows
    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
        stage.setScene(new Scene(fxWeaver.loadView(HelloController.class), 800, 600));
        stage.setTitle(applicationTitle);
        stage.show();
    }
}
