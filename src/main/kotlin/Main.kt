fun main(args: Array<String>) {
    //print은 println
    println("What is your name?")

    // input은 readln
    // val은 read-only이면서 로컬 변수가 됩니다. java에서는 final, c/c++에서는 const에 해당합니다. 초기화 이후 변할 수 없는 값을 말하게 됩니다.
    val name = readln()

    println("Hello, $name")

    //var는 일반적인 변수에 해당합니다.
    //값이 변할 수 있습니다.
    var number = 10;

    //함수 형태 : fun 함수명(변수명: 변수 타입): 리턴 타입 { return 값 }
    fun sum(a: Int, b: Int): Int{
        return a+b+number;
    }
    println("5+10+10 is " + sum(5, 10))
    fun otherSum(a: Int, b: Int) = a + b
    fun negative(a: Int, b: Int): Int = a - b

}