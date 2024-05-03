interface GrandFather{
   String surname;
   void shareProperty();
}interface PaternalGrandFather extends GrandFather{
    int assets = 100;
    this.surname = "yoyo";
    String name = "Ravindra"
}interface MaternalGrandFather extends GrandFather{
    int assets = 150;
    this.surname = "lila"; 
    String name = "Narendra";
}interface Father extends PaternalGrandFather{
    float share = this.assets/(float)3;
    Sname = this.surname + "Rathod";
}class Aunt implements PaternalGrandFather{
    float share = this.assets/(float)3;
    String name = this.surname + "Thandon";
}class Uncle implements PaternalGrandFather{
    float share = this.assets/(float)3;
    String name = this.surname + "Mahindra";
}interface Mother extends MaternalGrandFather{
    float share = this.assets/(float)2;
    String name = this.surname + "Hasyaprabha";
}class GrandChild implements Father, Mother{
    float share = Father.share/(float)2 + Mother.share/(float)2;
    String name = Father.surname + "Honey Singh";
}
