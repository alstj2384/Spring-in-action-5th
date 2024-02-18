package tacos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id; // Ch 3
    private Date createdAt; // Ch 3
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
