package com.bci.users.mapper;

import com.bci.users.model.Phone;
import com.bci.users.response.PhoneResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PhoneToPhoneResponseMapper {

    PhoneResponse convertToResponse(Phone phone);

}
