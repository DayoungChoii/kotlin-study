package tina.feb

class Solution12912 {
    fun solution(a: Int, b:Int):Long {
        var sum: Long= 0
        var big = 0
        var small = 0

        if(a == b){
            return a.toLong()
        }
        else if(a > b){
            big = a
            small = b
        } else{
            big = b
            small = a
        }

        for(i in small..big){
            sum += i
        }
        return sum
    }
}