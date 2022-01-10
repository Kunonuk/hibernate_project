import model.Label;
import repository.LabelRepository;
import repository.impl.LabelRepositoryImpl;

public class AppRunner {

    public static void main(String[] args) {
        LabelRepository labelRepository = new LabelRepositoryImpl();
        System.out.println(labelRepository.getById(2L));

        //System.out.println(labelRepository.insert(new Label("test1")));
    }
}
