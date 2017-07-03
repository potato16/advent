package aventure.day1

import java.lang.Math.abs

/**
 * Created by IT-NB on 29/06/2017.
 */
val input1 ="L1, L3, L5, L3, R1, L4, L5, R1, R3, L5, R1, L3, L2, L3, R2, R2, L3, L3, R1, L2, R1, L3, L2, R4, R2, L5, R4, L5, R4, L2, R3, L2, R4, R1, L5, L4, R1, L2, R3, R1, R2, L4, R1, L2, R3, L2, L3, R5, L192, R4, L5, R4, L1, R4, L4, R2, L5, R45, L2, L5, R4, R5, L3, R5, R77, R2, R5, L5, R1, R4, L4, L4, R2, L4, L1, R191, R1, L1, L2, L2, L4, L3, R1, L3, R1, R5, R3, L1, L4, L2, L3, L1, L1, R5, L4, R1, L3, R1, L2, R1, R4, R5, L4, L2, R4, R5, L1, L2, R3, L4, R2, R2, R3, L2, L3, L5, R3, R1, L4, L3, R4, R2, R2, R2, R1, L4, R4, R1, R2, R1, L2, L2, R4, L1, L2, R3, L3, L5, L4, R4, L3, L1, L5, L3, L5, R5, L5, L4, L2, R1, L2, L4, L2, L4, L1, R4, R4, R5, R1, L4, R2, L4, L2, L4, R2, L4, L1, L2, R1, R4, R3, R2, R2, R5, L1, L2"
var waytogo: Int = 0
var pHC : Point? = null
var _where_i_go : MutableList<Point> = ArrayList<Point>()
enum class Direction( val value: Int){
    SOUTH(180), NORTH(0), EAST(90), WEST(270)
}
data class Point(var x: Int, var y: Int){
    override fun toString(): String {
        return "${x}, ${y}"
    }
}

fun chkContaint( p: Point){
    if (pHC == null && _where_i_go.contains(p)){
        pHC = p.copy()
    }
    _where_i_go.add(p.copy())
}
fun main(args: Array<String>) {
    val l_input = input1.split(", ")
    var p: Point = Point(0, 0)
    _where_i_go.add(p.copy())
    for (i in l_input){
        when(i.first()){
            'L' -> waytogo = (waytogo -90)%360
            'R' -> waytogo = (waytogo +90)%360
            else -> print(i)
        }
        waytogo = (waytogo +360)%360
        when(waytogo){
            Direction.SOUTH.value -> {
                for (j in 1..(i.substring(1).toInt())){
                    p.x -= 1
                    chkContaint(p)
                }
            }
            Direction.NORTH.value -> {
                for (j in 1..(i.substring(1).toInt())){
                    p.x += 1
                    chkContaint(p)
                }
            }
            Direction.EAST.value -> {
                for (j in 1..(i.substring(1).toInt())){
                    p.y += 1
                    chkContaint(p)
                }
            }
            Direction.WEST.value -> {
                for (j in 1..(i.substring(1).toInt())){
                    p.y -= 1
                    chkContaint(p)
                }
            }
            else -> print(waytogo)
        }
    }
    println(abs(p.x)+abs(p.y))

    println(abs(pHC!!.x)+abs(pHC!!.y))


}