package com.orderManagement.Workflow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderManagement.Workflow.Model.*;
@Repository
public interface ServiceRepository extends JpaRepository <Services,Integer>{

}
