package kate.jan.forth

class Solution131705 {
    fun solution(number: IntArray):Int {
        var hab = 0
        var count = 0
        var result = 0
        for (i in 0 until number.size){
            for (j in i+1 until number.size){
                for (k in j+1 until number.size) {
                    hab = number[i]+number[j]+number[k]
                    if(hab==0) count++
                }
            }
        }
        return count
    }
}