package aventure

import com.sun.org.apache.xpath.internal.operations.Mult
import java.io.File
import java.nio.charset.StandardCharsets.UTF_8

/**
 * Created by IT-NB on 03/07/2017.
 * Chỉ là viết thương sâu một chút thôi em à
 *
 */
fun main(args: Array<String>) {
    val f = File("D:\\thao-note\\learnning\\kotlin\\advent\\src\\inputdata\\day4.txt").readLines(UTF_8)

    val tmp = f[0].split('-')
    var bag_of_dust=""
    for (i in 0..tmp.lastIndex-1){
        bag_of_dust += tmp[i]
    }
    val tmp2 = tmp.last().split('[')
    val sector_ID = tmp2[0]
    val checksum = tmp2[1].substring(0,tmp2[1].lastIndex)
    var my_collect: MutableList<Pair<Char,Int>> = arrayListOf()
    for (i in bag_of_dust.toCharArray()){

    }
}