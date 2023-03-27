package com.Project.converter;

import com.Project.dto.ProfileDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProfileConverter implements Converter<String, ProfileDTO> {

    @Override
    public ProfileDTO convert(String source) {
        return null;
    }
    //actually i dont know if i need this class
}
