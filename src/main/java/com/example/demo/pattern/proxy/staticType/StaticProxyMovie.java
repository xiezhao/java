package com.example.demo.pattern.proxy.staticType;

public class StaticProxyMovie implements Movie {

    private Movie movie;

    public StaticProxyMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void watch(String name) {
        //增强
        System.out.println("打印日志，进去影厅");
        movie.watch(name);
        //增强
        System.out.println("打印日志，出去影厅");
    }
}
