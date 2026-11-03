import java.util.*;

class Developer{
    void work(){
        System.out.println("Developer is working");
    }
    void Project(){
        System.out.println("Developer is working on Project");
    }
}
class FrontendDeveloper extends Developer{
    @Override     
    void work(){
        System.out.println("Frontend Developer is working on UI");
    }
    @Override
    void Project(){
        System.out.println("Frontend Developer is working on UI Project");
    }
    
}
class BackendDeveloper extends Developer{
    @Override
    void work(){
        System.out.println("Backend Developer is working on Database");
    }
    @Override
    void Project(){
        System.out.println("Backend Developer is working on Database Project");
    }
}
class FullStackDeveloper extends Developer{
    @Override
    void work(){
        System.out.println("FullStack Developer is working on UI and Database");
    }
    @Override
    void Project(){
        System.out.println("FullStack Developer is working on UI and Database Project");
    }

}
public class RunTimePolymorphism {

    public static void main(String[] args) {
        FrontendDeveloper f = new FrontendDeveloper();
        accessMethod(f);

        BackendDeveloper b = new BackendDeveloper();
        accessMethod(b);

        FullStackDeveloper fs = new FullStackDeveloper();
        accessMethod(fs);
        
    }
    public static void accessMethod(Developer d){  // Runtime Polymorphism
        d.work();
        d.Project();
    }
    
}
