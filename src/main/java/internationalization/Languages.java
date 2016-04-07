package internationalization;

/**
 * @author renantdesouza
 * @since 04/06/2016.
 */
public enum Languages {

    // CREATED TO TEST
    TEST((byte) 0, "test"),
    PT_BR((byte) 1, "pt_br"),
    EN_US((byte) 2, "en_us");

    private byte code;
    private String description;

    Languages(byte code, String description) {
        this.code = code;
        this.description = description;
    }

    public byte getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Languages getByCode(int code) {
        return getByCode((byte) code);
    }

    public static Languages getByCode(byte code) {
        for (Languages l : values()) {
            if (l.code == code) return l;
        }
        return null;
    }

    public static Languages getByDescription(String description) {
        for (Languages l : values()) {
            if (l.description.equals(description)) return l;
        }
        return null;
    }

}
