/**
 * Proyecto kb-catalogo-service.
 *
 * <p>Clase LoggerUtil 24/1/25.
 *
 * <p>Copyright 2025 Consejo de la Judicatura.
 *
 * <p>Todos los derechos reservados.
 */
package com.kalebsa.logger;

import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA CLASE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - holgermorales - 24/1/25
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author holgermorales
 * @version 1.0.0 $
 * @since 24/1/25
 */
public final class LoggerUtil {
  @Generated
  private static final Logger log = LoggerFactory.getLogger(LoggerUtil.class);

  private static final String LLAVES = "{} {}";

  private static String getCallerInfo() {
    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    if (stackTrace.length > 3) {
      StackTraceElement e = stackTrace[3];
      return String.format("[%s:%d]", new Object[] { e.getClassName(), Integer.valueOf(e.getLineNumber()) });
    }
    return "[unknown]";
  }

  public static void debug(String message) {
    if (log.isDebugEnabled())
      log.debug("{} {}", getCallerInfo(), message);
  }

  public static void debug(String message, Throwable t) {
    if (log.isDebugEnabled())
      log.debug("{} {}", new Object[] { getCallerInfo(), message, t });
  }

  public static void info(String message) {
    if (log.isInfoEnabled())
      log.info("{} {}", getCallerInfo(), message);
  }

  public static void info(String message, Throwable t) {
    if (log.isInfoEnabled())
      log.info("{} {}", new Object[] { getCallerInfo(), message, t });
  }

  public static void warn(String message) {
    if (log.isWarnEnabled())
      log.warn("{} {}", getCallerInfo(), message);
  }

  public static void warn(String message, Throwable t) {
    if (log.isWarnEnabled())
      log.warn("{} {}", new Object[] { getCallerInfo(), message, t });
  }

  public static void error(String message) {
    if (log.isErrorEnabled())
      log.error("{} {}", getCallerInfo(), message);
  }

  public static void error(String message, Throwable t) {
    if (log.isErrorEnabled())
      log.error("{} {}", new Object[] { getCallerInfo(), message, t });
  }

  public static void trace(String message) {
    if (log.isTraceEnabled())
      log.trace("{} {}", getCallerInfo(), message);
  }

  public static void trace(String message, Throwable t) {
    if (log.isTraceEnabled())
      log.trace("{} {}", new Object[] { getCallerInfo(), message, t });
  }
}