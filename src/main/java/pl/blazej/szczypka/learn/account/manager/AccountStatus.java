package pl.blazej.szczypka.learn.account.manager;

public enum AccountStatus {
    BLOCKED("This account is blocked"),
    OK("This account is OK"),
    SUSPENDED("This account is suspended");

    private String name;

    AccountStatus(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }
}
