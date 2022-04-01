```java
public class Teacher {
    @Override
    public String toString() {
        return "Teacher{}";
    }
}

public class Student {
    @Override
    public String toString() {
        return "Student{}";
    }
}

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
```

```java
public class Main {
    public static void main(String[] args) {
        ObjectFactory oFactory = ObjectFactory.DEFAULT;
        // 返回的是ObjectFactory
        System.out.println(oFactory);
        // 返回的是Student
        Object student1 = ObjectFactory.DEFAULT.getObject("student");
        // 返回的是Teacher
        Object teacher = ObjectFactory.DEFAULT.getObject("teacher");
        // 返回的是Student
        Object student2 = ObjectFactory.DEFAULT.getObject("");
    }
}
```

