package com.bci.users.request;

import java.util.ArrayList;
import java.util.List;

public class UserRequest {

    private Long id;

    private String name;

    private String email;

    private String password;

    private List<PhoneRequest> phones = new ArrayList<>();
}
