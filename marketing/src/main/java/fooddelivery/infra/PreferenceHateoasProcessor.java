package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class PreferenceHateoasProcessor implements RepresentationModelProcessor<EntityModel<Preference>>  {

    @Override
    public EntityModel<Preference> process(EntityModel<Preference> model) {

        
        return model;
    }
    
}
