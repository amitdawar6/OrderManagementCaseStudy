package com.orderManagement.Workflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderManagement.Workflow.Model.Specialists;
import com.orderManagement.Workflow.Repository.SpecialistRepository;

@Service
public class specialistService {
	
	@Autowired
	private SpecialistRepository specialistRepository;

	public List<Specialists> getServiceByspecialistId(int no) {
		List<Specialists> list= specialistRepository.getServiceByspecialistId(no);
		return list;
	}
	public List<Specialists> getSpecialistByspecialistName(String no) {
		List<Specialists> list= specialistRepository.getSpecialistByspecialistName(no);
		return list;
	}

	public List<Specialists> getAllSpecialists() {
		List<Specialists> list=specialistRepository.findAll();
		return list;
	}

	
	
	

}
