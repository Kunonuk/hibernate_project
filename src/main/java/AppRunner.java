import model.Label;
import repository.LabelRepository;
import repository.impl.LabelRepositoryImpl;

import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        LabelRepository labelRepository = new LabelRepositoryImpl();
        //System.out.println(labelRepository.getById(15L));

        //System.out.println(labelRepository.insert(new Label("test11")));

        //System.out.println(labelRepository.update(new Label(15L, "test12")));

        //labelRepository.delete(14L);

        /*List<Label> list = labelRepository.getAll();
        System.out.println(list);*/
    }
}
