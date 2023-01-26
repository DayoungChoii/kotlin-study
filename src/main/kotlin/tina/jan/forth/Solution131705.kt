package tina.jan.forth

class Solution131705 {
    fun solution(number: IntArray):Int {
        var count = 0;

        for(i in number.indices){
            for(j in i + 1 until number.size){
                for(k in j + 1 until number.size){
                    if(number[i] + number[j] + number[k] == 0) count++;
                }
            }
        }
        return count
    }
}