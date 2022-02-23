package Model;

public class Images_User {
    private int ID_IMAGES_USER;
    private String DESCRIPTION_IMAGES;
    private byte FOTO_USER;

    public Images_User(int ID_IMAGES_USER,
            String DESCRIPTION_IMAGES, byte FOTO_USER) {
        this.ID_IMAGES_USER = ID_IMAGES_USER;
        this.DESCRIPTION_IMAGES = DESCRIPTION_IMAGES;
        this.FOTO_USER = FOTO_USER;
    }

    public int getID_IMAGES_USER() {
        return ID_IMAGES_USER;
    }

    public void setID_IMAGES_USER(int ID_IMAGES_USER) {
        this.ID_IMAGES_USER = ID_IMAGES_USER;
    }


    public String getDESCRIPTION_IMAGES() {
        return DESCRIPTION_IMAGES;
    }

    public void setDESCRIPTION_IMAGES(String DESCRIPTION_IMAGES) {
        this.DESCRIPTION_IMAGES = DESCRIPTION_IMAGES;
    }

    public byte getFOTO_USER() {
        return FOTO_USER;
    }

    public void setFOTO_USER(byte FOTO_USER) {
        this.FOTO_USER = FOTO_USER;
    }
}
