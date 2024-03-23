package homework;

public class UserManager {

    private final Persister persister;
    private final Reporting reporting;

    public UserManager() {
        this.persister = new Persister();
        this.reporting = new Reporting();
    }

    public String saveUser(User user){
        return persister.save(user);
    }

    public String reportUser(User user){
        return reporting.report(user);
    }

}
