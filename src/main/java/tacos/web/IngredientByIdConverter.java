package tacos.web;

import java.util.Optional;

import lombok.RequiredArgsConstructor;
import tacos.Ingredient;
import tacos.data.IngredientRepository;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IngredientByIdConverter implements Converter<String, Ingredient> {

  private final IngredientRepository ingredientRepo;

  @Override
  public Ingredient convert(String id) {
    Optional<Ingredient> optionalIngredient = ingredientRepo.findById(id);
    return optionalIngredient.orElse(null);
  }
}