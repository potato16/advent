package aventure.day3

import java.io.File
import java.io.InputStream
import java.io.Reader
import java.nio.charset.StandardCharsets.UTF_8

/**
 * Created by IT-NB on 30/06/2017.
 */
fun main(args: Array<String>) {
    val f = File("D:\\thao-note\\learnning\\kotlin\\advent\\src\\inputdata\\day3.txt").readLines(UTF_8)

    var part2_list : MutableList<List<String>> = arrayListOf()
    for (i in 0..f.size-1 step 3){
        var tmp1 = f[i].split("\\s+".toRegex())
        var tmp2 = f[i+1].split("\\s+".toRegex())
        var tmp3 = f[i+2].split("\\s+".toRegex())
        if(tmp1.size == 4) tmp1 = tmp1.subList(1,tmp1.size)
        if(tmp2.size == 4) tmp2 = tmp2.subList(1,tmp2.size)
        if(tmp3.size == 4) tmp3 = tmp3.subList(1,tmp3.size)
        for (j in 0..2) part2_list.add(listOf(tmp1[j],tmp2[j],tmp3[j]))

    }
    println(count_legit_triangles(f))
    println(count_legit_triangles2(part2_list))
}
fun count_legit_triangles2(l: List<List<String>>): Int{
    var h_m = 0
    for (i in l){
        val a = i[0].toInt()
        val b = i[1].toInt()
        val c = i[2].toInt()
        println("$i and : $a $b $c ")
        if (a+b>c && a+c>b && b+c>a) h_m ++
    }
    return h_m
}
fun count_legit_triangles( l: List<String>): Int{
    var h_m: Int =0
    for (i in l){
        var tmp = i.split("\\s+".toRegex())
        if (tmp.size == 4) {

            tmp = tmp.subList(1,tmp.size)
        }
        val a= tmp[0].toInt()
        val b= tmp[1].toInt()
        val c= tmp[2].toInt()
        if (a+b>c && a+c>b && b+c>a) h_m ++
    }
    return h_m
}