

//Override

interface studyTools {
    void Books();
}

class Tools implements studyTools {
    @Override
    public void Books() {
        System.out.println("Rich Dad and Poor Dad is one of the bestest book for read ");
    }
}

//Deprecated

class fancy{
    public void gelPen(){
        System.out.println("It's expensive than ball pen ");
    }
}

class normalPen extends fancy{
    @Deprecated
    public void ballPen(){
        System.out.println("it's used in every where to write ant thing");
    }
}
//Custom annotation

//Marker annotation

@interface eCommerce{}

@eCommerce

class Myntra{
    public void product(){
    System.out.println("it's provides us all product in one place we needed");
}
}

@eCommerce
class flipkart extends Myntra{
    public void product2(){
        System.out.println("It's product quality is almost good");
    }
}

//single value annotation

@interface shoesCompany{
    int price();
}

@shoesCompany(price=1500)
class PUMA{
    public void veriety(){
        System.out.println("Puma has one of the product in market");
    }
}

class Aqualite extends PUMA{
    @shoesCompany(price=4000)
    public void quality(){
        System.out.println("It's us a nice quality product");
    }

}


//multi value annotation

@interface empInfo{
    String empId();
    double Salary();
}
class Employee{
    @empInfo(empId = "E00t5",Salary = 45653.87)
    public void empDetails(){
        String name="Marry";
        System.out.println("Employee name is "+name);
    }
}
public class Used_all_Annotation {
    public static void main(String[] args) {

        //Override
        
        Tools t2=new Tools();
        t2.Books();

        //Deprected

        normalPen np=new normalPen();
        np.ballPen();
        np.gelPen();

        //marker annotation

        flipkart fk=new flipkart();
        fk.product();
        fk.product2();

        //single value annotation

        Aqualite aq=new Aqualite();
        aq.veriety();
        aq.quality();

        //multi value annotation

        Employee e1=new Employee();
        e1.empDetails();
    

}
}
