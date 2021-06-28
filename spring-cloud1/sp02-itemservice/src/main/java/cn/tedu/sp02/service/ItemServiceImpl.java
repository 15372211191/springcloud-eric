package cn.tedu.sp02.service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.service.ItemService;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class ItemServiceImpl implements ItemService {
//获取订单的商品列表
    @Override
    public List<Item> getItems(String orderId) {
        log.info("获取商品列表，orderId="+orderId);
        List<Item> items = new ArrayList<>();
        items.add(new Item("商品1",1,1));
        items.add(new Item("商品2",2,2));
        items.add(new Item("商品3",3,3));
        items.add(new Item("商品4",4,4));
        items.add(new Item("商品5",5,5));

        return items;
    }
//减少商品库存
    @Override
    public void decreaseNumber(List<Item> items) {
        for (Item item : items) {
            log.info("减少商品库存"+item);
        }

    }
}
