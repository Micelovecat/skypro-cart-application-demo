package pro.sky.skyprocartapplicationdemo.service.impl;


import org.springframework.stereotype.Service;
import pro.sky.skyprocartapplicationdemo.cart.Cart;
import pro.sky.skyprocartapplicationdemo.service.CartService;


import java.util.List;


@Service
public class CartServiceImpl implements CartService {


    private final Cart cart;


    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public List<Integer> addItems(List<Integer> items) {
        return cart.addItems(items);
    }


    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }

}
