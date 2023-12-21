package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CustomerSupportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CustomerSupport>> {

    @Override
    public EntityModel<CustomerSupport> process(
        EntityModel<CustomerSupport> model
    ) {
        return model;
    }
}