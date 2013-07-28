package tddex.todo.model;

import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {
    private List<ToDo> list = new ArrayList<>();
    private String fileName;

    public ToDoRepository(String fileName){
        if (fileName == null) {
            throw new IllegalArgumentException("fileName must not be null.");
        }
        this.fileName = fileName;
    }

    public ToDoList getAll() {
        return new ToDoList(list);
    }

    public void add(ToDo todo) {
        list.add(todo);
    }

    public String getFileName(){
        return fileName;
    }
}
