class Phone {
    int pin;
    String password;

    void unlock(int pin){
        this.pin = pin;
        System.out.println("Unlocking with pin: " + this.pin);
    }
    void unlock(String password){
        this.password = password;
        System.out.println("Unlocking with password: " + this.password);
    }

    Pattern unlock(Pattern pat){
        System.out.println("Unlocking with pattern");
        return pat;

    }
    Face unlock(Face f){
        System.out.println("Unlocking with face");
        return f;
    }
    FingerPrint unlock(FingerPrint fp){
        System.out.println("Unlocking with FingerPrint");
        return fp;

    }
}

class Pattern{

}

class Face{
    
}

class FingerPrint{

}

class PhoneUnlock{
    public static void main(String[] args) {
        Phone p = new Phone();
        p.unlock(1234);
        p.unlock("hello123");
        Pattern pat = new Pattern();
        p.unlock(pat);
        Face f = new Face();
        p.unlock(f);
        FingerPrint fp = new FingerPrint();
        p.unlock(fp);
    }
}
    

