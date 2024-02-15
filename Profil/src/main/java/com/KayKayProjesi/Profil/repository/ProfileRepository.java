package com.KayKayProjesi.Profil.repository;

import com.KayKayProjesi.Profil.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile , Integer>
{
}
