package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    // operand1=11
    // queryString은 key,value가 하나인 형태를 가지는 객체이다.
    // List<QueryString>으로 만들어야함
    @Test
    void createTest() {
        QueryString queryString = new QueryString("operand1","11");

        assertThat(queryString).isNotNull();
    }
}
