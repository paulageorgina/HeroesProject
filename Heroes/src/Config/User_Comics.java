package Config;

public class User_Comics {
    private int ID_USER_COMICS;
    private String USER_NAME;
    private String PASSWORD_USER;
    

    public User_Comics(int ID_USER_COMICS,
            String USER_NAME, String PASSWORD_USER) {
        this.ID_USER_COMICS = ID_USER_COMICS;
        this.USER_NAME = USER_NAME;
        this.PASSWORD_USER = PASSWORD_USER;
    }

    public int getID_USER_COMICS() {
        return ID_USER_COMICS;
    }

    public void setID_USER_COMICS(int ID_USER_COMICS) {
        this.ID_USER_COMICS = ID_USER_COMICS;
    }

    public String getPASSWORD_USER() {
        return PASSWORD_USER;
    }

    public void setPASSWORD_USER(String PASSWORD_USER) {
        this.PASSWORD_USER = PASSWORD_USER;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }
}
    