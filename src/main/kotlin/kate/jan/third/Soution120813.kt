package kate.jan.third

import java.util.*

class Soution120813 {
    fun solution(n: Int): ArrayList<Int> {
        var list = ArrayList<Int>();
        val n = 15;
        for(i in 0..n){
            if(i%2==1) {
                list.add(i);
            }
        }
        return list;
    }

}