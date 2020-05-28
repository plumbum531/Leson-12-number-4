package com.pb.lesson12.number5;

import java.util.Scanner;

public class Users {
    private String login;
    private String password;

    public Users() {
        setLogin();
        setPassword();
    }

    private void setLogin() {
        System.out.println("Input login");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            this.login = scanner.nextLine();
        }

    }

    private void setPassword() {
        System.out.println("Input password");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            this.password = scanner.nextLine();
        }

    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }
}
