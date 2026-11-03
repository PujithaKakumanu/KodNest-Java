// Mobile has A Os -> Has A Relation
// Main object -> Mobile
// composite object -> (depends on main object for its existence)(Titly coupled) -> Os(composition) -- if main object is destroyed then composite object is also destroyed
// Aggregate object -> (independent of main object)(loose coupling) -> charger(aggregation) -- if main object is destroyed then aggregate object is not destroyed
// In composition object is created inside the class with main object at instance level
class Os{
    Os(){
        System.out.println("Os is Installed");
    }
    void checkOs(){
        System.out.println("Os is still Executing");
    }
}
class Mobile{
    Os o = new Os();
    Mobile(){
        System.out.println("Mobile created with Os");
    }
    
    
}
public class HasARelationCompositeObject {
    public static void main(String[] args) {
        Mobile m;
        m = new Mobile();
        m.o.checkOs();
        // m = null;
        // m.o.checkOs();//NullPointerException
    }
}
