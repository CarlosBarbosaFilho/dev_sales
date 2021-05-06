package br.com.cbgomes.backend.beans;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationModelMapper {

    @Bean
    public ModelMapper modelMapper(){
        var modelMapper = new ModelMapper();
        return modelMapper;
    }
}
