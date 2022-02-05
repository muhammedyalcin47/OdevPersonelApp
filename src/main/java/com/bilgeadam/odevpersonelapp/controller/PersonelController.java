package com.bilgeadam.odevpersonelapp.controller;

import com.bilgeadam.odevpersonelapp.Exception.PersonelNotFoundException;
import com.bilgeadam.odevpersonelapp.entity.Personel;
import com.bilgeadam.odevpersonelapp.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonelController {

    @Autowired
    private PersonelRepository personelRepository;

    @GetMapping("/personel/{id}")
    public Personel getKisi(@PathVariable("id") long id)
    {
        Personel personel = null;
        Optional<Personel> personelDB = personelRepository.findById(id);

                if(personelDB.isPresent())
                {
                    personel = personelDB.get();
                    return personel;
                }
                else
                {
                    throw new PersonelNotFoundException(id + " nolu Personel bulunamadı!");

                }

    }
    @GetMapping("/personel")
    public List<Personel> getTumPersonel()
    {
        return personelRepository.findAll();
    }
}
