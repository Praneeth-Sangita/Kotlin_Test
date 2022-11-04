import java.util.*

fun main(){

    var sc= Scanner(System.`in`)
    var num:Int
    println("Enter the number")
    num=sc.nextInt()
    var ans=fact(num)
    println(ans)

}

fun fact(num: Int): Int {
    if(num==0 || num==1){
        return 1
    }
    return num*fact(num-1)
}