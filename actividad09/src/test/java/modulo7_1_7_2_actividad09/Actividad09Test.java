package modulo7_1_7_2_actividad09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad09Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
    try {
      Actividad09.main(new String[0]);
    } finally {
      System.setOut(originalOut);
    }
    String output = buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim();
    assertEquals(
        "Bubba mide 1.75 y cumple 4 años\n"
            + "Bubba está pensando\n"
            + "Twitch mide 1.68 y cumple 3 años\n"
            + "Twitch está pensando",
        output);
  }
}
