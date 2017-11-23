package pl.blazej.szczypka.learn.account.manager;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AccountManagerTest {
    @Test
    public void checkAccountStatus() throws Exception {
        Account blockedAccount = new Account();
        blockedAccount.setStatus(AccountStatus.BLOCKED);

        AccountManager accountManager = new AccountManager();
        accountManager.checkAccountStatus(blockedAccount);
    }

    @Test
    public void testAccountList() {
        Account blocked = new Account(AccountStatus.BLOCKED);
        Account ok = new Account(AccountStatus.OK);
        Account suspended = new Account(AccountStatus.SUSPENDED);

        List<Account> accounts = new ArrayList<>();
        accounts.add(blocked);
        accounts.add(ok);
        accounts.add(suspended);

        System.out.println(accounts);

        for (Account account : accounts) {
            System.out.println("decorated account: " + account);
        }
    }

}