package service;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import validator.ValidatorParam;

/**
 *
 * @author kitagawa
 */
@Path("")
public class SampleService {

    @Path("validate")
    @GET
    public String validate(@Valid @BeanParam ValidatorParam param) {
        if (param.getName() != null) {
            return param.getName();
        }
        return "null";
    }
    
}
