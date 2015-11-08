package org.forkjoin.apikit.example.api;

import org.forkjoin.api.ActionType;
import org.forkjoin.api.Api;
import org.forkjoin.api.ApiMethod;
import org.forkjoin.apikit.example.model.User;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;


/**
 * @author zuoge85 on 15/6/11.
 */
@Api
public interface BaseApi {
    @ApiMethod(value = "base/", type = ActionType.CREATE)
    User create(@Valid User user);

    @ApiMethod(value = "base/{id}", type = ActionType.GET)
    User get(@PathVariable String id);
}