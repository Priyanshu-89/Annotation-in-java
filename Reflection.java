import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnno {
}

class DemoAnno {
    @MyAnno
    public void SayOne() {
        System.out.println("Hello Java");
    }
}

public class Reflection {
    public static void main(String[] args) throws Exception {
        DemoAnno dobj = new DemoAnno();

        Class cobj =  dobj.getClass();

        System.out.println(cobj.getName());

        //shorthand for get class

        String cName=dobj.getClass().getName();
        System.out.println(cName);


        //For finding the method name

        Method mObj=dobj.getClass().getMethod( "SayOne");
        System.out.println(mObj);

        //For finding the method annotation

       // System.out.println(mObj.isAnnotationPresent(cobj));

        System.out.println(mObj.isAnnotationPresent(MyAnno.class));
    }

}
