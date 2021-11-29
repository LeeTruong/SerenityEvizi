package com.evizi.carhire.railinc.screenplay.model;

public class Credentials {
    private final String username;
    private final String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Credentials contains(String username, String password) {
        return new Credentials(username, password);
    }

    public static Credentials admin() {
        return new Credentials("LINH_NG", "Evizi_2021");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
