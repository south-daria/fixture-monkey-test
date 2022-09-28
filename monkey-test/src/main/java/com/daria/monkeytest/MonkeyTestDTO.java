package com.daria.monkeytest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

public class MonkeyTestDTO {

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Monkey1{
        List<Monkey2> monkey2List;
        Monkey3 monkey3;
    }
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Monkey2{
        Integer bananaCount;
    }
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Monkey3{
        String name;
    }
}
