package Hello.Lesson12number4;

public class Skirt extends Dress implements ClothForWomen {

    Skirt(){

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

    public void DressWomen(){
        size=Size.S.euroSize;
        coast=48;
        colour="yellow";

    }
}
