package com.bci.users.mapper;

import com.bci.users.model.User;
import com.bci.users.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserToUserResponseMapper {

    UserResponse convertToResponse(User user);

}
