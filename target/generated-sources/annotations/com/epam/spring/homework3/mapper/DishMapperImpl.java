package com.epam.spring.homework3.mapper;

import com.epam.spring.homework3.dto.DishDTO;
import com.epam.spring.homework3.dto.DishDTO.DishDTOBuilder;
import com.epam.spring.homework3.model.Dish;
import com.epam.spring.homework3.model.Dish.DishBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-18T04:24:50+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class DishMapperImpl implements DishMapper {

    @Override
    public DishDTO mapDishDTO(Dish dish) {
        if ( dish == null ) {
            return null;
        }

        DishDTOBuilder dishDTO = DishDTO.builder();

        dishDTO.id( dish.getId() );
        dishDTO.name( dish.getName() );
        dishDTO.calories( dish.getCalories() );
        dishDTO.ingredients( dish.getIngredients() );
        dishDTO.category( dish.getCategory() );

        return dishDTO.build();
    }

    @Override
    public Dish mapDish(DishDTO dishDTO) {
        if ( dishDTO == null ) {
            return null;
        }

        DishBuilder dish = Dish.builder();

        dish.id( dishDTO.getId() );
        dish.name( dishDTO.getName() );
        dish.calories( dishDTO.getCalories() );
        dish.ingredients( dishDTO.getIngredients() );
        dish.category( dishDTO.getCategory() );

        return dish.build();
    }

    @Override
    public List<DishDTO> mapDishDTOs(List<Dish> dishes) {
        if ( dishes == null ) {
            return null;
        }

        List<DishDTO> list = new ArrayList<DishDTO>( dishes.size() );
        for ( Dish dish : dishes ) {
            list.add( mapDishDTO( dish ) );
        }

        return list;
    }
}
