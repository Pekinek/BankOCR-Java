package com.mmocek;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class ParserTest {

    private final Parser parser = new Parser();

    @Test
    void shouldParseZeros() throws IOException, URISyntaxException {
        var fileContent = Files.readString(Path.of(this.getClass().getResource("/00000000.txt").toURI()));
        assertThat(parser.parse(fileContent)).isEqualTo("000000000");
    }

}