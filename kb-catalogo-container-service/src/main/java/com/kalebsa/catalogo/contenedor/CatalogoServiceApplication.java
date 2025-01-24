package com.kalebsa.catalogo.contenedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "ec.gob.funcionjudicial")
@EntityScan(basePackages = {"ec.gob.funcionjudicial"})
public class CatalogoServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CatalogoServiceApplication.class, args);
  }
}
