import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApplicationContext {
    public Object createBean(Class className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName(className.getName());
        Constructor<?> constructor = clazz.getConstructor();
        return constructor.newInstance(new Object[]{});
    }
}
