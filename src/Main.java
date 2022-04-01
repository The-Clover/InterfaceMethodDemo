/**
 * @program: InterfaceMethodDemo
 * @description: 测试类
 * @author: Clover
 * @create: 2022/04/01 12:24
 */
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
