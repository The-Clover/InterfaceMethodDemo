public interface ObjectFactory {
    ObjectFactory DEFAULT = (objectName) -> {
        switch (objectName) {
            case "student":
                return new Student();
            case "teacher":
                return new Teacher();
            default:
                return new Student();
        }
    };

    public Object getObject(String objectName);
}
