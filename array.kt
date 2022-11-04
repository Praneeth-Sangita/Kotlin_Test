import java.util.*

fun main(args: Array<String>) {

    var  sc= Scanner(System.`in`)
    var size:Int
    var temp=0
    println("Enter the size of the array")
    size=sc.nextInt()
    var arr= Array<Int>(size){0}
    println("Enter array elements")
    for(i in 0 until size){
        arr[i]=sc.nextInt()
    }
//    arr.sort()
//    println("${arr[size-1]-arr[0]}")
    for(i in 0..size-1){
        for(j in 0..size-1){
            if(arr[i]<arr[j]){
                temp=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
            }
        }
    }
    println("${arr[size-1] - arr[0]}")

}