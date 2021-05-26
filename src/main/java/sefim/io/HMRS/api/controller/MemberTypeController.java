package sefim.io.HMRS.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sefim.io.HMRS.business.abstracts.MemberTypeService;
import sefim.io.HMRS.entities.concretes.MemberTypes;

@RestController
@RequestMapping("/api/membertypes")
public class MemberTypeController {
	private MemberTypeService memberTypeService;

	public MemberTypeController(MemberTypeService memberTypeService) {
		
		this.memberTypeService = memberTypeService;
	}
	@GetMapping("/getall")
	public List<MemberTypes> getAll(){
		return this.memberTypeService.getAll();
	}

}
