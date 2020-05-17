package Hello.Lesson12number4;

public class Tie extends Dress implements ClothForMen {
    Tie() {

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
        size = Size.M.euroSize;
        coast = 37;
        colour = "black";
    }
}
