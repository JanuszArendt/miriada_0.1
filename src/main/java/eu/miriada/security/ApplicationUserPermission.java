package eu.miriada.security;

public enum ApplicationUserPermission {
    PLAYERS_READ("players:read"),
    PLAYERS_WRITE("players:write"),
    SERVER_RED("server:read"),
    SERVER_WRITE("server:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
