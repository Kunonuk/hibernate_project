package repository;

import java.util.List;

public interface GenericRepository <T, ID> {
    T getById(ID id);
    T insert(T t);
    T update(T t);
    void delete (ID id);
    List<T> getAll();
}
