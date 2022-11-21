package fooddelivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "marketing", url = "${api.url.marketing}")
public interface PreferenceService {
    @RequestMapping(method= RequestMethod.GET, path="/preferences/{id}")
    public Preference getPreference(@PathVariable("id") Long id);
}

