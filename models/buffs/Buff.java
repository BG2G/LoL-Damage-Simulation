package lolsimulation.models.buffs;

/**
 * Created by League of Engineers on 11/14/2015.
 */
public abstract class Buff {

    protected float duration;
    protected boolean permanent;
    protected boolean unique;
    protected String name;
    protected float cooldown;
    protected float timeSinceLastActivation;


    public boolean hasExpired(){
        return (duration <= 0);
    }

    public boolean update(float timeElapsed){
        if(cooldown != 0){
            //Update time
            timeSinceLastActivation = timeSinceLastActivation + timeElapsed;
        }
        duration = duration - timeElapsed;
        if(duration <= 0){
            return true;
        }
        return false;
    }

    public boolean isReady(){
        return (timeSinceLastActivation > cooldown);
    }

}
