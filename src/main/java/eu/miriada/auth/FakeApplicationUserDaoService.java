package eu.miriada.auth;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static eu.miriada.security.ApplicationUserRole.ADMIN;
import static eu.miriada.security.ApplicationUserRole.USER;

@Repository("Fake")
public class FakeApplicationUserDaoService implements ApplicationUserDao {

    private final PasswordEncoder passwordEncoder;
    @Autowired
    public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUser()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }
    private List<ApplicationUser> getApplicationUser(){
        List<ApplicationUser> applicationUsers = Lists.newArrayList(
                new ApplicationUser(
                        ADMIN.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "admin",
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        USER.getGrantedAuthorities(),
                        passwordEncoder.encode("password"),
                        "user",
                        true,
                        true,
                        true,
                        true
                )
        );
        return applicationUsers;
    }
}
