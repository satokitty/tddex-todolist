package tddex.todo.model

import spock.lang.Specification
import spock.lang.Unroll


class ToDoSpec extends Specification {
    def "インスタンス作成時にコンテンツを与える"() {
        given:
        def instance = new ToDo("contents")

        expect:
        instance != null
    }

    @Unroll("contents == #contents")
    def "インスタンス作成時に与えたコンテンツを表示できる"() {
        given:
        def sut = new ToDo(contents)

        expect:
        sut.toString() == contents

        where:
        contents << ["hoge", "あああ", "123"]
    }
}