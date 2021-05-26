package sefim.io.HMRS.business.abstracts;

import java.util.List;

import sefim.io.HMRS.core.utilities.results.DataResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
}
