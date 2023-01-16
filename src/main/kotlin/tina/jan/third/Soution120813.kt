package tina.jan.third

class Solution120813 {
    fun solution(n: Int): IntArray {
        val list = ArrayList<Int>()

        for(i:Int in 1..n step 2){
            list.add(i)
        }

        return list.toIntArray()
    }
}