package anno;
import java.lang.reflect.*;
import java.util.Arrays;

/**
 * reflection 을 활용 하여 클래스 생성하기**/
public class DemoReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("==========Use Reflection to make unknown class: by Full Qualified Class Name============");
        Class<?> aClass = Class.forName("anno.PrivateClass");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(null);
        Object o = declaredConstructor.newInstance();

        System.out.println("==========Use Reflection to make unknown class: by constructor===========");
        Class<PrivateClass> cls2  = PrivateClass.class;
        Constructor<PrivateClass> declaredConstructor2 = cls2.getDeclaredConstructor(String.class);
        PrivateClass privateClass = declaredConstructor2.newInstance("testConstructor");
        System.out.println("==========Use Reflection to check unknown Method");
        Method[] declaredMethods = aClass.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getParameterCount());

        }
//        Method method = privateClass.getClass().getDeclaredMethod("printAge", int.class);
//        method.setAccessible(true);


//        Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
//        Object obj = constructor.getClass();
//        Method method = obj.getClass().getMethod("소정");
//        System.out.println(method);
    }
}

