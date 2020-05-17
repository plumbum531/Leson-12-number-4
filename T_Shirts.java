package Hello.Lesson12number4;

public class T_Shirts extends Dress implements ClothForMen, ClothForWomen {

    T_Shirts(){

    }

    public int getSize(){
        return (size);
    }

    public int getCoast(){
        return (coast);
    }

    public String getColour(){
        return(colour);
    }

    @Override
    public void DressMan() {
        size=Size.XXS.euroSize;
        coast=28;
        colour="white";
    }

    public void DressWomen(){
        size=Size.XS.euroSize;
        coast=96;
        colour="brown";}
}
