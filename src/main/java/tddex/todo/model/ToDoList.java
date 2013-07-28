package tddex.todo.model;

import java.util.List;

public class ToDoList {
    private final List<ToDo> list;
    ToDoList(List<ToDo> todolist) {
        list = todolist;
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
