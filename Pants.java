package Hello.Lesson12number4;

import static Hello.Lesson12number4.Size.*;

public class Pants extends Dress implements ClothForMen, ClothForWomen  {

    Pants(){}

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
        size = Size.L.euroSize;
        coast = 499;
        colour = "red";
    }

    public void DressWomen(){
        size = Size.M.euroSize;
        coast = 10;
        colour = "green";
    }
}
