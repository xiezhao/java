package com.example.demo;

import com.alibaba.testable.core.annotation.MockMethod;
import com.example.demo.mock.TestableMock;
import org.junit.jupiter.api.Test;

import static com.alibaba.testable.core.matcher.InvokeVerifier.verify;

public class TestableMockTest {

    public static class Mock {
        // 放置Mock方法的地方
        @MockMethod(targetClass = TestableMock.class)
        private String substring(String a) {
            return "sub_string";
        }
    }

    @Test
    public void test(){
        verify("substring").with("asdf");
    }

}
