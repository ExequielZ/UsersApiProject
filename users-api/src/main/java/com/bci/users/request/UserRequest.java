package com.bci.users.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest implements Serializable {

    private Long id;

    private String name;

    private String email;

    private String password;

    @JsonProperty
    private List<PhoneRequest> phones = new ArrayList<>();

}
