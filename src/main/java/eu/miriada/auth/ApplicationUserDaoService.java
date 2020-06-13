package eu.miriada.auth;

import java.util.Optional;

public class ApplicationUserDaoService implements ApplicationUserDao{

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return Optional.empty();
    }
}
