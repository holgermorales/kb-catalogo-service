/**
 * Proyecto cj-repositorio-service.
 *
 * <p>Clase ErrorDetails 15/11/24.
 *
 * <p>Copyright 2024 Consejo de la Judicatura.
 *
 * <p>Todos los derechos reservados.
 */
package com.kalebsa.catalogo.controller.util;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetails {

  private LocalDateTime timestamp;
  private String message;
  private String details;

  public ErrorDetails(LocalDateTime timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }
}
