package fra.uas.elle.user.model;

public class User {

    private int userID;

    private String email;

    private String hashedPassword;

    private String firstName;

    private String lastName;

    private Role role;

    public User (String email, String hashedPassword, String firstName, String lastName){

        this.email=email;
        this.hashedPassword=hashedPassword;
        this.firstName=firstName;
        this.lastName=lastName;
    }


}
