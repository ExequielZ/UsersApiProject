package com.bci.users.mapper;

import com.bci.users.model.Phone;
import com.bci.users.request.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PhoneRequestToPhoneMapper {

    Phone convertRequestToEntity(PhoneRequest phoneRequest);

}
