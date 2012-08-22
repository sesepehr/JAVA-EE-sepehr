package org.rest.sec.web.user;

import org.rest.common.util.order.OrderByName;
import org.rest.sec.client.template.UserRESTTemplateImpl;
import org.rest.sec.model.dto.User;
import org.rest.sec.test.SecSortAndPaginationRESTIntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Ordering;

public class UserSortAndPaginationRESTIntegrationTest extends SecSortAndPaginationRESTIntegrationTest<User> {

    @Autowired
    private UserRESTTemplateImpl template;

    public UserSortAndPaginationRESTIntegrationTest() {
        super(User.class);
    }

    // tests

    // template method (shortcuts)

    @Override
    protected final User createNewEntity() {
        return template.createNewEntity();
    }

    @Override
    protected final String getURI() {
        return template.getURI();
    }

    @Override
    protected final UserRESTTemplateImpl getAPI() {
        return template;
    }

    @Override
    protected final Ordering<User> getOrdering() {
        return new OrderByName<User>();
    }

}