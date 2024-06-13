interface PGP{
    float share = 1000f;
    String surname = "a";
}interface MGP{
    float share = 1000f;
    String surname = "b";
}interface F extends PGP{
    float share = PGP.share/2f;
}interface M extends MGP,PGP{
    float share = MGP.share/2f;
    String surname = PGP.surname;
}class U implements MGP{
    float share = MGP.share/2f;
}class A implements PGP,MGP{
    float share = PGP.share/2f;
    String surname = MGP.surname;
}class Me implements F,M{
    float share = F.share/2f + M.share/2f;
    String surname = PGP.surname;
}public class PropertySharing{
    public static void main(String[] args) {
        Me me = new Me();
        U u = new U();
        A a = new A();
        System.out.println(u.share);
        System.out.println(u.surname);
        System.out.println(a.share);
        System.out.println(a.surname);
        System.out.println(me.share);
        System.out.println(me.surname);
    }   
}