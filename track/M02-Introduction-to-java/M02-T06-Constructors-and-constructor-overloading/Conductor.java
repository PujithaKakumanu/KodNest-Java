class Conductor{
    void collect(Money m){
        System.out.println("Money collected by conductor");
    }
    Ticket give(){
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;
    }
}
class Money{

}
class Ticket{

}
class Passenger{
    public static void main(String[] args) {
        new Passenger();
        Conductor c = new Conductor();
        Money m = new Money();
        c.collect(m);
        Ticket t = c.give();
        System.err.println(t);
        if(t!=null){
            System.err.println("Ticket collected");
        }
    }
}
