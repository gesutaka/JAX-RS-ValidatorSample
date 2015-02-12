package validator;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.ws.rs.QueryParam;

/**
 *
 * @author kitagawa
 */
@Named
@RequestScoped
public class ValidatorParam {

    @QueryParam("name")
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
