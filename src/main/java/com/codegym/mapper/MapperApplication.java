package com.codegym.mapper;

import com.codegym.mapper.model.Student;
import com.codegym.mapper.model.StudentResponse;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperApplication.class, args);
    }

    @Bean
    MapperFacade mapper() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
                .useBuiltinConverters(false).build();
        return mapperFactory.getMapperFacade();
    }
}

