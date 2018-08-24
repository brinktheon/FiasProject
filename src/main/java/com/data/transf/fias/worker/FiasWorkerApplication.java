package com.data.transf.fias.worker;

import com.data.transf.fias.worker.execute.Executor;
import com.data.transf.fias.worker.execute.Relationship;
import com.data.transf.fias.worker.handlers.HouseHandler;
import com.data.transf.fias.worker.handlers.ItemHandler;
import com.data.transf.fias.worker.services.HouseService;
import com.data.transf.fias.worker.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
* Разработчику нужно:
* 1) Написать модель
* 2) Написать хендлер
* 3) Сервис + Репозиторий и имплементацию
* 4) Добавить маску + Хендлер в мапу(по маске найдется нужный файл, через класс ValidateFiles)
* */
@SpringBootApplication
public class FiasWorkerApplication implements CommandLineRunner {

    @Autowired
    ItemService itemService;

    @Autowired
    HouseService houseService;

    public static void main(String[] args) {
        SpringApplication.run(FiasWorkerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Relationship.putRelationship("AS_ADDROBJ_", new ItemHandler(itemService));
        //Relationship.putRelationship("AS_HOUSE_", new HouseHandler(houseService));
        //new Executor().execute();
    }
}
