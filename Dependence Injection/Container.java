import java.lang.reflect.Field;

public class Container {

    public static <T> T createObject(Class<T> clazz) {

        try {

           
            T object = clazz.getDeclaredConstructor().newInstance();

           
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {

              
                if (field.isAnnotationPresent(MyAnnotaion.class)) {

                    
                    Object dependency =
                            field.getType().getDeclaredConstructor().newInstance();

                  
                    field.setAccessible(true);

                    
                    field.set(object, dependency);
                }
            }

            return object;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}