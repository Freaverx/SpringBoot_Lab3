package ru.proskuryakov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.proskuryakov.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResposneService {

    Response modify(Response response);

}
