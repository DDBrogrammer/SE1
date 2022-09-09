package ex_1;

import java.util.ArrayList;
import java.util.Collections;


public class MaxMinIntList<Integer> extends ArrayList {

    public Integer max(){
        if(this.size() == 0){
            return null;
        }
        Collections.sort(this);
        return (Integer) this.toArray()[this.size()-1];
    }

    public Integer min() {
        if(this.size() == 0){
            return null;
        }
        Collections.sort(this);
        return (Integer) this.toArray()[0];
    }


}
