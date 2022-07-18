package com.epam.spring.homework3.mapper;

import com.epam.spring.homework3.dto.ClientDTO;
import com.epam.spring.homework3.dto.ClientDTO.ClientDTOBuilder;
import com.epam.spring.homework3.model.Client;
import com.epam.spring.homework3.model.Client.ClientBuilder;
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
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientDTO mapClientDTO(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDTOBuilder clientDTO = ClientDTO.builder();

        clientDTO.id( client.getId() );
        clientDTO.firstName( client.getFirstName() );
        clientDTO.secondName( client.getSecondName() );
        clientDTO.birthdate( client.getBirthdate() );
        clientDTO.phone( client.getPhone() );
        clientDTO.email( client.getEmail() );

        return clientDTO.build();
    }

    @Override
    public Client mapClient(ClientDTO clientDTO) {
        if ( clientDTO == null ) {
            return null;
        }

        ClientBuilder client = Client.builder();

        client.id( clientDTO.getId() );
        client.firstName( clientDTO.getFirstName() );
        client.secondName( clientDTO.getSecondName() );
        client.birthdate( clientDTO.getBirthdate() );
        client.phone( clientDTO.getPhone() );
        client.email( clientDTO.getEmail() );

        return client.build();
    }

    @Override
    public List<ClientDTO> mapClientDTOs(List<Client> clients) {
        if ( clients == null ) {
            return null;
        }

        List<ClientDTO> list = new ArrayList<ClientDTO>( clients.size() );
        for ( Client client : clients ) {
            list.add( mapClientDTO( client ) );
        }

        return list;
    }
}
