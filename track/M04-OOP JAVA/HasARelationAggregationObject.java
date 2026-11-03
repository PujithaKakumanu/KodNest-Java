// Has A Relation
// Aggregation
// In Aggregation(Object created outside the class and passed it to the object of the class)
// In Aggregation we pass "has a" object as a parameter to one of method present in main object


// If main object is destroyed then "has a" object is not destroyed

class Os{
    Os(){
        System.out.println("Os is installed");
    }
}
class Charger{
    Charger(){
        System.out.println("Charger created");
    }
}
class Mobile{
    Os o;
    Charger c;
    Mobile(){
        System.out.println("Mobile created with Os and Charger");
    }
    void insertCharger(Charger c){
        this.c = c;
        System.out.println("Charger is inserted");
    }
    void checkCharger(){
        System.out.println("Charger is still working");
    }
    void removeCharger(){
        this.c = null;
        System.out.println("Charger is removed");
    }
}
public class HasARelationAggregationObject {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        Charger c = new Charger();
        m.o = new Os();
        m.insertCharger(c);
        m.checkCharger();
        m.removeCharger();
        m = null;
        c.checkCharger();
    }
}