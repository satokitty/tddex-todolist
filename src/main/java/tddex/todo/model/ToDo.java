package tddex.todo.model;

public class ToDo {
    private final String content;

    public ToDo(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }


}
