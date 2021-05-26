package sefim.io.HMRS.business.abstracts;

import java.util.List;

import sefim.io.HMRS.core.utilities.results.DataResult;
import sefim.io.HMRS.core.utilities.results.Result;
import sefim.io.HMRS.entities.concretes.Position;


public interface PositionService {
	DataResult<List<Position>> getAll();
	Result add(Position position);
}
