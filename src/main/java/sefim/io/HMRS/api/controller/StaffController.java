package sefim.io.HMRS.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sefim.io.HMRS.business.abstracts.StaffService;
import sefim.io.HMRS.core.utilities.results.DataResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.entities.concretes.Staff;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {
	private StaffService staffService;

	public StaffController(StaffService staffService) {
		super();
		this.staffService = staffService;
	}
	@GetMapping("/getall")
	public DataResult<List<Staff>> getAll(){
		return this.staffService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Staff staff) {
		return this.staffService.add(staff);
	}
}
