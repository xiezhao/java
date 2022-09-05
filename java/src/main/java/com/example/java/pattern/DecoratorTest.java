package com.example.java.pattern;


/*
    制作一个字符输入流,能一次读一行,且在每一行前面加上行号
 */



import org.springframework.util.StringUtils;

import java.io.*;

class MyBufferedReader extends BufferedReader {

    private Integer lineNumber = 0;

    public MyBufferedReader(Reader in, int sz) {
        super(in, sz);
    }

    public MyBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String s = super.readLine();
        if (s != null) {
            lineNumber++;
        }
        return s;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }
}


public class DecoratorTest {

    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("/Users/rick/Desktop/github/java/java/src/main/java/com/example/java/pattern/1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        MyBufferedReader myBufferedReader = new MyBufferedReader(bufferedReader);

        myBufferedReader.lines().forEach(re -> {
            System.out.println(re);
        });
    }


}
