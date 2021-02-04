package anno;

import java.lang.annotation.Repeatable;

@interface Todos{
     Todo[] value();

}
@Repeatable(Todos.class)
public @interface Todo {
    String value();
}
