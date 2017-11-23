package pl.blazej.szczypka.learn.account.manager;

public class AccountManager {
    public void checkAccountStatus(Account account){
        AccountStatus accountStatus = account.getStatus();
        switch(accountStatus){
            case OK:{
                System.out.println("Account is: " + AccountStatus.OK);
                break;
            }
            case BLOCKED: {
                System.out.println("Account is: " + AccountStatus.BLOCKED.getName());
                //Wywołanie poniżej to nie jest dobra praktyka dla ENUM
                System.out.println(AccountStatusConstant.BLOCKED);
                break;
            }
            case SUSPENDED:{
                System.out.println("Account is: " + AccountStatus.SUSPENDED);
                break;
            }
            default:
                break;
        }

    }
}
