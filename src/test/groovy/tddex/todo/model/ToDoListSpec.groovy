package tddex.todo.model

import spock.lang.Specification


class ToDoListSpec extends Specification {
    def "インスタンス作成の際にToDoオブジェクトのリストを与える"() {
        given:
        ToDo todo1 = new ToDo("contents1")
        ToDo todo2 = new ToDo("contents2")

        List<ToDo> todolist = [todo1, todo2]

        when:
        def instance = new ToDoList(todolist)

        then:
        instance != null
        instance.size() == 2
        instance.toString() == "[contents1, contents2]"
    }

//    def "インスタンス作成時に与えたリストのサイズをsizeメソッドで取得できる"() {
//        when:
//        def sut = new ToDoList(todolist)
//
//        then:
//        sut.size() == todolist.size()
//    }
}