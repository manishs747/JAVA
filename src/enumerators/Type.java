package enumerators;

public enum Type {
    INTERNAL("internal"), EXTERNAL("external"), SHARED("shared");
    private String name;
    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Type getTypeByName(String name) {
        for (Type type : values()) {
            if (type.name.equals(name)) {
                return type;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Type.getTypeByName("EXTERNAL"));
        System.out.println(Type.getTypeByName("external"));
    }
}