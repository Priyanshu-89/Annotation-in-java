import java.lang.annotation.*;
@Target (ElementType.METHOD)
@interface MobileCompany{}

@Target (ElementType.TYPE)
@interface MobileDetails{}

@Target (ElementType.FIELD)
@interface DataValue{}

@MobileDetails
class Nokia
{
    @DataValue
      double salary=2867;
    @MobileCompany
    public void show()
    {
        System.out.println("salary is : "+salary);
        System.out.println("Hello program");
    }
}
class Target_annotation
{
    public static void main(String []arg)
    {
        Nokia n=new Nokia();
        n.show();
    }
}