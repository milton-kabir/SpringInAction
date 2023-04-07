package tacos.web.api;

import lombok.Getter;
import tacos.Ingredient;
import tacos.Ingredient.Type;

import org.springframework.hateoas.ResourceSupport;

public class IngredientResource extends ResourceSupport {

  @Getter
  private String name;

  @Getter
  private Type type;

  public IngredientResource(Ingredient ingredient) {
    this.name = ingredient.getName();
    this.type = ingredient.getType();
  }
}