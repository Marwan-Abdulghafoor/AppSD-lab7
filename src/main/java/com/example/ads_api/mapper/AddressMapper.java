package com.example.ads_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper ADDRESS_MAPPER = Mappers.getMapper(AddressMapper.class);
}
