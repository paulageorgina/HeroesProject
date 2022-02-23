package Model;

public class Admin_Comics {
    private int ID_ADMIN_COMICS;
    private String ADMIN_USER_NAME;
    private String ADMIN_PASSWORD_USER;
    private int ID_IMAGES_USER;

    public Admin_Comics() {
    }

    public Admin_Comics(
            int ID_ADMIN_COMICS, String ADMIN_USER_NAME,
            String ADMIN_PASSWORD_USER, int ID_IMAGES_USER) {
                
        this.ID_ADMIN_COMICS = ID_ADMIN_COMICS;
        this.ADMIN_USER_NAME = ADMIN_USER_NAME;
        this.ADMIN_PASSWORD_USER = ADMIN_PASSWORD_USER;
        this.ID_IMAGES_USER = ID_IMAGES_USER;
    }

    public int getID_ADMIN_COMICS() {
        return ID_ADMIN_COMICS;
    }

    public void setID_ADMIN_COMICS(int ID_ADMIN_COMICS) {
        this.ID_ADMIN_COMICS = ID_ADMIN_COMICS;
    }

    public String getADMIN_PASSWORD_USER() {
        return ADMIN_PASSWORD_USER;
    }

    public void setADMIN_PASSWORD_USER(String ADMIN_PASSWORD_USER) {
        this.ADMIN_PASSWORD_USER = ADMIN_PASSWORD_USER;
    }

    public String getADMIN_USER_NAME() {
        return ADMIN_USER_NAME;
    }

    public void setADMIN_USER_NAME(String ADMIN_USER_NAME) {
        this.ADMIN_USER_NAME = ADMIN_USER_NAME;
    }

    public int getID_IMAGES_USER() {
        return ID_IMAGES_USER;
    }

    public void setID_IMAGES_USER(int ID_IMAGES_USER) {
        this.ID_IMAGES_USER = ID_IMAGES_USER;
    }
}
