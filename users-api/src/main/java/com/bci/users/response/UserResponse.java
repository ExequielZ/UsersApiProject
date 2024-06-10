package com.bci.users.response;

import com.bci.users.model.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse implements Serializable {
    private String name;
    private String email;
    private String password;

    private List<PhoneResponse> phones = new ArrayList<>();

    private LocalDateTime created;
    private LocalDateTime modified;
    private LocalDateTime last_login;
    private String token;
    private boolean isActive;

}
