package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringsTest {

    @Test
    void createTest() {
        QueryStrings queryStrings = new QueryStrings("opernad1=11&operator=*&operand2=55"); // List<QueryStrings>

        assertThat(queryStrings).isNotNull();

    }
}
