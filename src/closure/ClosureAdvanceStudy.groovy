package closure

/**
 * 闭包三个重要的变量
 * this:代表闭包定义处的类
 * owner：代表闭包定义处的类或者对象（闭包可以嵌套闭包）
 * delegate：代表任意对象，默认与owner一致
 * 大多数三者都是一致，大多数都是在类中定义的
 */
def scriptClosure = {
    println(" this is $this")
    println("owner is $owner")
    println("delegate is $delegate")
}
//        scriptClosure.call()


ClosureTest s = new ClosureTest()
def closure_3 = {
    def closure_4 = {
        println(" closure_3 this is $ClosureAdvanceStudy")
        println("closure_3 owner is $owner")
        println("closure_3 delegate is $delegate")
    }

    closure_4.call()
}

// closure_3.call()

class ClosureTest {
    def closure_1 = {
        println(" closure_1 this is $this")
        println("closure_1 owner is $owner")
        println("closure_1 delegate is $delegate")
    }

    def say() {
        def closure_2 = {
            println(" closure_2 this is $this")
            println("closure_2 owner is $owner")
            println("closure_2 delegate is $delegate")
        }
        closure_2.call()
    }
}

/**
 * 闭包的委托策略
 */

class Student {
    String name
    def pretty = {
        "my name is $name"
    }

    @Override
    String toString() {
        return pretty.call()
    }
}

class Teacher {
    String name
}

def student = new Student(name: "zhangqi")
def teacher = new Teacher(name: "zhang")
// 改变委托对象
student.pretty.delegate = teacher
// 改变委托策略 默认是 OWNER_FIRST

// DELEGATE_FIRST 首先从委托对象中寻找属性，找不到再去原对象中寻找
// DELEGATE_ONLY 仅仅从委托对象中寻找
student.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println(student.toString())


