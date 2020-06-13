package eu.miriada.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class User {

    private final Integer userId;
    private final String username;
    private final String password;
    private final String usrRole;



}
