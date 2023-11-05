
tasks.register("testPreJava11Collections") {
    val myList: MutableList<String> = MyUtils.newPreJava11List("Hello List!")
    val mySet: MutableSet<String> = MyUtils.newPreJava11Set("Hello Set!")
    val myMap: MutableMap<String, String> = MyUtils.newPreJava11Map("Hello", "Map!")
    doLast {
        println(myList + mySet + myMap)
    }
}

tasks.register("testJava11Collections") {
    val myList: MutableList<String> = MyUtils.newJava11List("Hello List!")
    val mySet: MutableSet<String> = MyUtils.newJava11Set("Hello Set!")
    val myMap: MutableMap<String, String> = MyUtils.newJava11Map("key", "Map!")
    doLast {
        println(myList + mySet + myMap)
    }
}

