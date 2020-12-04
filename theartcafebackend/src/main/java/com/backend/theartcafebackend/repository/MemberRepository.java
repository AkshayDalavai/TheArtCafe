package com.backend.theartcafebackend.repository;

import com.backend.theartcafebackend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {
    Member findByUsername(final String userName);

    @Query(value = "select * from the_art_cafe.member l where l.id_Shoppingcart = ?1", nativeQuery=true)
    Member findByShoppingByID(final Integer id_Shoppingcart);
}
