package closure

class ClosureStudy {

    static void main(String[] args) {

        //闭包：就是一段代码块
        // 定义一个闭包
        def closure = {
            println("Hello Groovy")
        }
        // 调用闭包
        closure.call()

        // 参数
        def closure_1 = { String str, int age ->
            // 带有参数的闭包 = zhangqi , age is =14
            println("带有参数的闭包 = $str , age is =$age")
        }
        closure_1.call('zhangqi', 14)

        // 隐式参数
        def closure_it = {
            println("name is $it")
        }
        // name is zhangqi
        closure_it.call("zhangqi")

        // 闭包的返回值
        def closure_return = { String name ->
            return "Hello $name"
        }
        def returnValue = closure_return.call("Groovy")
        // returnValue is Hello Groovy
        println("returnValue is $returnValue")

        // 闭包是一定有返回值的
        def closure_null = {
            println("Hello $it")
        }

        def returnNull = closure_null("Groovy")
        // null
        println(returnNull)
    }
}
