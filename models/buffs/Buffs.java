package lolsimulation.models.buffs;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by League of Engineers on 11/21/2015.
 */
public class Buffs {

    private List<Buff> buffs;

    public Buffs(){
        this.buffs = new LinkedList<>();
    }

    public void addBuff(Buff newBuff){
        buffs.add(newBuff);
    }

    public void removeBuff(Buff buff){
        buffs.remove(buff);
    }

    public void update(float timeElapsed){
        for(Buff buff : buffs){
            if(buff.update(timeElapsed)){
                this.removeBuff(buff);
            }
        }
    }

}
