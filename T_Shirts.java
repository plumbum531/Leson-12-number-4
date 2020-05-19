package Hello.Lesson12number4;

public class T_Shirts extends Dress implements ClothForMen, ClothForWomen {

    T_Shirts(){

    }


    @Override
    public void DressMan() {
        size=Size.XXS.euroSize;
        coast=28;
        colour="white";
    }

    @Override
    public void DressWomen(){
        size=Size.XS.euroSize;
        coast=96;
        colour="brown";}
}
