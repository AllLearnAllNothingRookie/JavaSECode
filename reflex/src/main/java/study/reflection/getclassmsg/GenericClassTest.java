package study.reflection.getclassmsg;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 15:50
 */
public class GenericClassTest {
    public static void main(String[] args) {
        Class<Base> baseClass = Base.class;
        TypeVariable<Class<Base>>[] typeParameters = baseClass.getTypeParameters();
        for (TypeVariable<Class<Base>> typeParameter : typeParameters) {
            System.out.println(typeParameter  + ",上限：" + typeParameter.getBounds()[0]);
        }

        Class<Sub> subClass = Sub.class;
        Type genericSuperclass = subClass.getGenericSuperclass();
        ParameterizedType gt =  (ParameterizedType)genericSuperclass;
        Type[] actualTypeArguments = gt.getActualTypeArguments();
        for (Type actualTypeArgument : actualTypeArguments) {
            System.out.println(actualTypeArgument);
        }
    }
}
