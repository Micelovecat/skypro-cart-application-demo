package pro.sky.skyprocartapplicationdemo.service;
import java.util.List;

public interface CartService {

    List<Integer> addItems(List<Integer> items);
    List<Integer> getItems();
}
