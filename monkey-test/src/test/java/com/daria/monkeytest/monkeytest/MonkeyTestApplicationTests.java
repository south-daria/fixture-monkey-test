package com.daria.monkeytest.monkeytest;

import com.daria.monkeytest.MonkeyTestDTO;
import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.generator.FieldReflectionArbitraryGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MonkeyTestApplicationTests  {
    private final FixtureMonkey fixtureMonkey = FixtureMonkey.builder().defaultGenerator(FieldReflectionArbitraryGenerator.INSTANCE)
            .nullInject(0).build();

    MonkeyTestDTO.Monkey1 monkey1;

    @BeforeEach
    public void setUp() {
        List<MonkeyTestDTO.Monkey2> monkey2List = fixtureMonkey
                .giveMe(MonkeyTestDTO.Monkey2.class, 5);
        MonkeyTestDTO.Monkey3 monkey3 = fixtureMonkey.giveMeOne(MonkeyTestDTO.Monkey3.class);
        monkey1 = fixtureMonkey.giveMeBuilder(MonkeyTestDTO.Monkey1.class)
                .set("monkey2List", monkey2List)
                .set("monkey3", monkey3)
                .sample();
    }

    @Test
    void contextLoads() {

    }

}
