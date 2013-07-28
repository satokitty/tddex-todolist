package tddex.todo.model

import spock.lang.Specification

class ToDoRepositorySpec extends Specification {
    def filename = "outputfile.txt"

    def "初期状態では空リストが返却される"() {
        given:
        ToDoRepository sut = new ToDoRepository(filename)

        expect:
        sut.getAll().toString() == "[]"
    }

    def "インスタンス生成時に永続化時に出力するファイル名を指定する"() {
        when:
        ToDoRepository sut = new ToDoRepository("output.txt")

        then:
        sut.getFileName() == "output.txt"
    }

    def "インスタンス生成時に与えるファイル名がnullの場合IAE"() {
        when:
        new ToDoRepository()

        then:
        IllegalArgumentException e = thrown()
        e.message == "fileName must not be null."
    }

    def "addメソッドでToDoを追加できる"() {
        given:
        ToDoRepository sut = new ToDoRepository(filename)
        ToDo todo = new ToDo("Hoge")

        when:
        sut.add(todo)

        then:
        sut.getAll() != null
        sut.getAll().toString() == "[Hoge]"
    }

    def "addメソッドで複数のToDoを追加できる"() {
        given:
        ToDoRepository sut = new ToDoRepository(filename)
        ToDo todo = new ToDo("Hoge")
        ToDo todo2 = new ToDo("Fuga")

        when:
        sut.add(todo)
        sut.add(todo2)

        then:
        sut.getAll() != null
        sut.getAll().toString() == "[Hoge, Fuga]"
    }
//
//    def "persistentメソッドで現在の状態をファイルに保存できる"() {
//        given:
//
//
//        when:
//        then:
//    }
}