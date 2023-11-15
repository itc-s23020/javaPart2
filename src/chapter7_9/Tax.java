package chapter7_9;
import javax.xml.namespace.QName;
import java.util.IdentityHashMap;
import java.util.Objects;
public final class Tax {

    private final Id id;
    private final int shotoku;
    private final int koujo;

    public Tax(Id id, int shotoku, int koujo) {
        this.id =  new Id(id.getNumber(), id.getName());
        this.shotoku = shotoku;
        this.koujo = koujo;
    }
    public int zeigaku(){
        return (int) ((shotoku-koujo)*0.1);
    }
    public Id getId(){
        return new Id(id.getNumber(), id.getName());

    } public int getShotoku(){
        return shotoku;
    } public int getKoujo(){
        return koujo;
    }
@Override
public String toString() {
    return "Tax [id="+ id +", shotoku="+ shotoku +
", koujo=" + koujo + "]";
}
}


