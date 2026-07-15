package modulo7_1_7_2_actividad15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad15Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
    try {
      Actividad15.main(new String[0]);
    } finally {
      System.setOut(originalOut);
    }
    String output = buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim();
    assertEquals(
        "Meses restantes: 1\n"
            + "Saldo: 1005.0\n"
            + "Meses restantes: 0\n"
            + "Saldo: 1010.025\n"
            + "El bono ha vencido",
        output);
  }
}
