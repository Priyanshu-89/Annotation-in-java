@interface MobileCompany{
    int value();
}

@MobileCompany(2023)
class Nokia{
    @MobileCompany(2020)
    public void playMusic(){
        System.out.println("This is leatest song");
    }
    @MobileCompany(02)
    public void clickSnap(){
        System.out.println("This snap is taken form yesterday");
    }
}

@MobileCompany(2022)
class Iphone{ //implements Nokia
    @MobileCompany(2010)
    public void Security(){
        System.out.println("Iphone provides us highest security");
    }

    public void Camera(){
        System.out.println("It has bestest quality of camera");
    }
}

public class Single_Value_Annotation {
    public static void main(String[] args) {
        Nokia N=new Nokia();
        N.clickSnap();
        N.playMusic();
    }
}
