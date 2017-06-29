package aventure

import java.lang.Math.abs

/**
 * Created by IT-NB on 29/06/2017.
 */
val input ="L1, L3, L5, L3, R1, L4, L5, R1, R3, L5, R1, L3, L2, L3, R2, R2, L3, L3, R1, L2, R1, L3, L2, R4, R2, L5, R4, L5, R4, L2, R3, L2, R4, R1, L5, L4, R1, L2, R3, R1, R2, L4, R1, L2, R3, L2, L3, R5, L192, R4, L5, R4, L1, R4, L4, R2, L5, R45, L2, L5, R4, R5, L3, R5, R77, R2, R5, L5, R1, R4, L4, L4, R2, L4, L1, R191, R1, L1, L2, L2, L4, L3, R1, L3, R1, R5, R3, L1, L4, L2, L3, L1, L1, R5, L4, R1, L3, R1, L2, R1, R4, R5, L4, L2, R4, R5, L1, L2, R3, L4, R2, R2, R3, L2, L3, L5, R3, R1, L4, L3, R4, R2, R2, R2, R1, L4, R4, R1, R2, R1, L2, L2, R4, L1, L2, R3, L3, L5, L4, R4, L3, L1, L5, L3, L5, R5, L5, L4, L2, R1, L2, L4, L2, L4, L1, R4, R4, R5, R1, L4, R2, L4, L2, L4, R2, L4, L1, L2, R1, R4, R3, R2, R2, R5, L1, L2"
var waytogo: Int = 0
enum class Direction( val value: Int){
    SOUTH(180), NORTH(0), EAST(90), WEST(270)
}
data class Point(var x: Int, var y: Int)
fun main(args: Array<String>) {
    val l_input = input.split(", ")
    var p: Point = Point(0,0)
    for (i in l_input){

        when(i.first()){
            'L' -> waytogo = (waytogo-90)%360
            'R' -> waytogo = (waytogo+90)%360
            else -> print(i)
        }
        waytogo = (waytogo+360)%360
        when(waytogo){
            Direction.SOUTH.value -> p.x -= i.substring(1).toInt()
            Direction.NORTH.value -> p.x += i.substring(1).toInt()
            Direction.EAST.value -> p.y += i.substring(1).toInt()
            Direction.WEST.value -> p.y -= i.substring(1).toInt()
            else -> print(waytogo)
        }

    }
    println(abs(p.x)+abs(p.y))
}