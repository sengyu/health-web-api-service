package sen.shen.api.web.model;

import java.util.List;

import org.springframework.data.domain.PageImpl;

public class BlolPressureList extends PageImpl<BloodPressureDto>{

	public BlolPressureList(List<BloodPressureDto> content) {
		super(content);
		// TODO Auto-generated constructor stub
	}

}
