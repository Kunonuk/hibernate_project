import model.Label;
import model.Post;
import model.PostStatus;
import model.Writer;
import repository.LabelRepository;
import repository.WriterRepository;
import repository.impl.LabelRepositoryImpl;
import repository.impl.WriterRepositoryImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        LabelRepository labelRepository = new LabelRepositoryImpl();
        //System.out.println(labelRepository.getById(1L));

        //System.out.println(labelRepository.insert(new Label("test11")));

        //System.out.println(labelRepository.update(new Label(15L, "test12")));

        //labelRepository.delete(14L);

        /*List<Label> list = labelRepository.getAll();
        System.out.println(list);*/


        WriterRepository writerRepository = new WriterRepositoryImpl();

        //writerRepository.getById(1L);

        /*List<Label> labels = Arrays.asList(new Label("label9"), new Label("label10"));
        List<Label> labels1 = Arrays.asList(new Label("label11"), new Label("label12"));
        List<Post> posts = Arrays.asList(
                new Post("content5", new Date(), new Date(), PostStatus.ACTIVE, labels),
                new Post("content6", new Date(), new Date(), PostStatus.UNDER_REVIEW, labels1));
        writerRepository.insert(new Writer("name3", "last3", posts));*/


        writerRepository.update(new Writer(1L, "name3", "name4"));
    }
}
