package tddex.todo.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class ToDoTest {
    public static class インスタンス化テスト {

        @Test
        public void 文字列で内容を与えてインスタンスを作る() throws Exception {
            // when
            ToDo instance = new ToDo("hoge");
            // then
            assertThat(instance, is(notNullValue()));
            assertThat(instance.toString(), is("hoge"));
        }
        
    }
}
