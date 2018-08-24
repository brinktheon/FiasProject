package controller;

import com.data.transf.fias.worker.model.Item;
import com.data.transf.fias.worker.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    private final ItemService service;

    @Autowired
    public ItemController(ItemService service) {
        this.service = service;
    }

    @RequestMapping(
            value = "/items",
            params = {"page", "size"},
            method = RequestMethod.GET
    )
    List<Item> getAllItems(@RequestParam("page") int page, @RequestParam("size") int size){
        return service.getListItems(page, size);
    }

    @RequestMapping("/test")
    public String test() {
        return "ETO TEST !!!";
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}
