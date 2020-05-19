package Hello.Lesson12number4;

import static Hello.Lesson12number4.Size.*;

public class Pants extends Dress implements ClothForMen, ClothForWomen  {

    Pants(){
    }

    @Override
    public void DressMan() {
        super.size = Size.L.euroSize;
        super.coast = 499;
        super.colour = "red";
    }
    @Override
    public void DressWomen(){
        super.size = Size.M.euroSize;
        super.coast = 10;
        super.colour = "green";
    }
}
