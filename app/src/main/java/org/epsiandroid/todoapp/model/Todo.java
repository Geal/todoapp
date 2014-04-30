package org.epsiandroid.todoapp.model;

import java.util.ArrayList;
import java.util.List;

public class Todo {
    public int    todo_id;
    public String title;
    public String content;

    public Todo(int _id, String _title, String _content) {
        todo_id = _id;
        title   = _title;
        content = _content;
    }
}
