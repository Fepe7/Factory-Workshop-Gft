package com.gft.factoryworkshopgft;

import org.springframework.boot.SpringApplication;

public class TestFactoryWorkshopGftApplication {

    public static void main(String[] args) {
        SpringApplication.from(FactoryWorkshopGftApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
